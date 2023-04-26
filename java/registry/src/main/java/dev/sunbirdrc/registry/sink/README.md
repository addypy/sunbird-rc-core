# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/sink

This directory contains the various database providers and related classes used by the Sunbird RC Core to store and manage registry data.


|_ **DBProviderFactory.java** - A factory class responsible for creating instances of different database providers based on the configuration.

|_ **DatabaseProvider.java** - An interface for all the database provider classes. It defines the common methods that each provider should implement.

|_ **JanusGraphStorage.java** - A class that implements the `DatabaseProvider` interface for JanusGraph storage.

|_ **Neo4jGraphProvider.java** - A class that implements the `DatabaseProvider` interface for Neo4j graph database.

|_ **Neo4jIdProvider.java** - A class responsible for generating and managing unique identifiers for Neo4j graph elements.

|_ **OSGraph.java** - A class that represents a graph object in the OrientDB graph database.

|_ **OrientDBGraphProvider.java** - A class that implements the `DatabaseProvider` interface for OrientDB graph database.

|_ **SqlgProvider.java** - A class that implements the `DatabaseProvider` interface for Sqlg graph database.

|_ **TinkerGraphProvider.java** - A class that implements the `DatabaseProvider` interface for TinkerGraph in-memory graph database.


## shard/

This subdirectory contains the classes related to sharding in the registry database.

|_ **DefaultShardAdvisor.java** - A class that provides a default implementation of shard advisor, which defines the sharding strategy.

|_ **IShardAdvisor.java** - An interface for all shard advisor classes. It defines the methods that each shard advisor should implement.

|_ **README.md** - A readme file containing information about the classes in the shard subdirectory.

|_ **SerialNumberShardAdvisor.java** - A class that provides a serial number-based sharding strategy.

|_ **Shard.java** - A class representing a shard in the registry database.

|_ **ShardAdvisor.java** - A class responsible for managing shard advisors and providing the appropriate shard advisor based on the configuration.

|_ **ShardManager.java** - A class responsible for managing shards in the registry database. It provides methods to add, update, and retrieve shards.