import akka.actor.ActorSystem
import akka.cluster.seed.ZookeeperClusterSeed
import akka.event.Logging

import scala.concurrent.Await
import scala.concurrent.duration._

object Main extends App {

  // Initialize Actor System
  val system = ActorSystem("akka-cluster-zookeeper")

  // Join Cluster using ZK seed node
  ZookeeperClusterSeed(system).join()

  // Create Cluster events listener
  system.actorOf(SimpleClusterListener.props(), "cluster-listener")

  // Add system hooks
  scala.sys.addShutdownHook{
    val log = Logging(system, getClass)
    log.info("Shutting down server and actor system")
    system.terminate()
    Await.result(system.whenTerminated, 1 minute)
  }

}
