name := "akka-cluster-zookeeper"

version := "1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= {
  val akkaVersion = "2.5.3"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
    "com.sclasen" %% "akka-zk-cluster-seed" % "0.1.8"
  )
}