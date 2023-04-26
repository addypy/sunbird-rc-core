# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/util

This directory contains utility classes that support the functionality of the Sunbird RC Core. Below is a brief description of each file and its purpose.

- `ArrayHelper.java`: Contains utility methods for working with arrays.

- `AuditFileWriter.java`: Provides functionality to create and write audit logs to a file.

- `ClaimRequestClient.java`: Handles the communication with other services for claim requests.

- `Definition.java`: Represents a definition object that defines the structure of an entity in the registry.

- `DefinitionsManager.java`: Manages the definitions of entities and their properties.

- `DistributedDefinitionsManager.java`: Extends DefinitionsManager for handling distributed definitions.

- `EntityParenter.java`: Helps in creating relationships between entities such as parent-child relationships.

- `EntityTypeHandler.java`: Handles the processing of entity types in the registry.

- `GraphDBFactory.java`: Provides a factory method to create instances of GraphDB connections.

- `IDefinitionsManager.java`: Interface for the DefinitionsManager, allowing for different implementations.

- `IndexHelper.java`: Contains utility methods for working with indexes in the registry.

- `Indexer.java`: Handles the indexing of entities and their properties.

- `JsonKeys.java`: Contains constants for commonly used JSON keys in the registry.

- `OSResourceLoader.java`: Loads resources such as configuration files and schema files from the file system.

- `OSSchemaConfiguration.java`: Represents the configuration of a schema in the registry.

- `OSSystemFieldsHelper.java`: Provides helper methods for working with system fields in the registry.

- `ParentLabelGenerator.java`: Generates labels for parent entities based on their relationships.

- `PrivateField.java`: Represents a private field within an entity definition.

- `ReadConfigurator.java`: Configures the read operation for retrieving entities from the registry.

- `ReadConfiguratorFactory.java`: Factory for creating ReadConfigurator instances based on the request.

- `RecordIdentifier.java`: Represents the unique identifier of a record in the registry.

- `RefLabelHelper.java`: Contains utility methods for working with reference labels.

- `RefResolver.java`: Handles the resolution of references between entities.

- `ResponseUtil.java`: Contains utility methods for creating response objects.

- `ServiceProvider.java`: Provides a service for performing CRUD operations on entities in the registry.

- `ShardParentInfo.java`: Represents information about a shard parent in the registry.

- `ShardParentInfoList.java`: A list of ShardParentInfo objects.

- `TypePropertyHelper.java`: Contains utility methods for working with type properties in the registry.

- `ViewTemplateManager.java`: Manages the view templates for rendering entities in the registry.

These utility classes are used by the main Sunbird RC Core classes to perform various operations on entities and their properties. They help in keeping the code modular and maintainable.