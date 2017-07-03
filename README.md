# Akka Cluster with ZooKeeper

Example of how to join an Akka Cluster using ZooKeeper for providing a seed node. 

For further info please refer to: https://github.com/sclasen/akka-zk-cluster-seed

## Starting the nodes
Before starting the nodes, make sure ZooKeeper is up and running. Then start the number of nodes you want using below command:

```sh
sbt  run
```

Check the logs to see how they join the cluster.

[Akka Cluster]: <http://doc.akka.io/docs/akka/current/java/common/cluster.html>
[Apache ZooKeeper]: <https://zookeeper.apache.org/>
