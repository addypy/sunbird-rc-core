# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/consumers

This directory contains the consumer class for creating entities in the Sunbird RC framework. The purpose of this class is to listen for and process messages related to the creation of new entities in the registry.

## CreateEntityConsumer.java

**Path:** java/registry/src/main/java/dev/sunbirdrc/registry/consumers/CreateEntityConsumer.java

The `CreateEntityConsumer` class is responsible for consuming messages related to the creation of new entities in the registry. It is responsible for processing these messages and adding the new entities to the registry.

### Usage

The `CreateEntityConsumer` class is used as a part of the Sunbird RC framework to handle new entity creation. When a message is received with the details of a new entity, the `CreateEntityConsumer` class processes the message, validates the data, and adds the entity to the registry.

### Key Functions

Some of the key functions in the `CreateEntityConsumer` class are:

- `consumeCreateEntity`: This function is responsible for consuming messages related to the creation of a new entity. It processes the message, validates the data, and adds the new entity to the registry.
- `validateEntityData`: This function is responsible for validating the entity data received in the message. It checks for required fields and ensures that the data is valid before adding the entity to the registry.
- `addEntityToRegistry`: This function is responsible for adding the new entity to the registry. It saves the entity data along with any additional metadata required by the Sunbird RC framework.

### Dependencies

The `CreateEntityConsumer` class depends on the following classes and interfaces:

- `Entity`: This class represents an entity in the Sunbird RC framework. It contains the data and metadata related to an entity.
- `Registry`: This interface represents the registry in the Sunbird RC framework. It is responsible for storing and managing entities.

### Example

To use the `CreateEntityConsumer` class, you would typically create an instance of the class and call the `consumeCreateEntity` function with a message containing the details of the new entity:

```java
CreateEntityConsumer createEntityConsumer = new CreateEntityConsumer();
Message message = new Message(entityData);
createEntityConsumer.consumeCreateEntity(message);
