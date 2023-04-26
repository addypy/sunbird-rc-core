# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/sink/shard

This directory contains scripts that manage shards (database partitions) in the Sunbird RC framework, which is used for building electronic registries and managing data access. These scripts help distribute data across multiple shards, improving the performance and scalability of the system.

## [DefaultShardAdvisor.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/sink/shard/DefaultShardAdvisor.java)

`DefaultShardAdvisor.java` provides a default shard advisor for the Sunbird RC framework. A shard advisor is responsible for determining which shard (database partition) to use when storing or retrieving data. In this case, the default shard advisor selects the first entry in the application configuration as the only default shard. This default shard advisor can be extended to provide custom shard advisors for specific use cases.

## [IShardAdvisor.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/sink/shard/IShardAdvisor.java)

`IShardAdvisor.java` is an interface that must be implemented by all shard advisors in the Sunbird RC framework. Shard advisors are responsible for determining the appropriate shard (database partition) to store or retrieve data based on a given attribute.

## [SerialNumberShardAdvisor.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/SerialNumberShardAdvisor.java)

`SerialNumberShardAdvisor.java` extends the `DefaultShardAdvisor` class and provides a custom implementation for selecting a shard based on the serial number's even or odd value.

## [Shard.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/Shard.java)

The `Shard.java` script is a class that represents a shard in the Sunbird RC framework. A shard is a partition of a database, which is used to distribute data across multiple servers for better performance and scalability.

## [ShardAdvisor.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/sink/shard/ShardAdvisor.java)

The `ShardAdvisor` class is responsible for creating an instance of a shard advisor based on the provided class name. A shard advisor is an object that helps in managing and distributing data across multiple shards (partitions) in a distributed database system.

## [ShardManager.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/sink/shard/ShardManager.java)

The `ShardManager` class is responsible for managing database shards in the Sunbird RC registry. It provides methods to activate and retrieve shards based on attribute values or shard IDs. This class is essential for distributing data across multiple databases, ensuring efficient data storage and retrieval.