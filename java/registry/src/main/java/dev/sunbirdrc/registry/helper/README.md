# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/helper

This directory contains helper classes for the Sunbird RC Core project, specifically for the registry component. These helper classes provide utility methods that simplify the process of interacting with the registry and managing the state of entities within the registry.

## EntityStateHelper.java

`EntityStateHelper.java` is a helper class that provides utility methods for managing the state of entities within the registry. This includes methods for creating, updating, and deleting entities, as well as fetching the current state of an entity.

The main purpose of this class is to encapsulate the logic for interacting with the registry's underlying data storage and provide a clean, easy-to-use interface for other parts of the application to manage entity states.

**Usage:**

Create an instance of `EntityStateHelper` and use its methods to interact with the registry entities.

Example:

```java
EntityStateHelper entityStateHelper = new EntityStateHelper();
entityStateHelper.createEntity(entityData);
```

## RegistryHelper.java

`RegistryHelper.java` is a helper class that provides utility methods for interacting with the registry. It provides methods for adding, updating, and fetching data from the registry, as well as managing the digital signature of data and metadata.

This class is responsible for handling the communication between the registry and the authorized data repositories, enabling the application to store and retrieve data securely and efficiently.

**Usage:**

Create an instance of `RegistryHelper` and use its methods to interact with the registry.

Example:

```java
RegistryHelper registryHelper = new RegistryHelper();
registryHelper.addDataToRegistry(data, metadata, digitalSignature);
```

To sum up, the `sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/helper` directory contains helper classes that simplify interactions with the registry and its entities. These classes provide a clean interface for other parts of the application to work with the registry, ensuring that the code is easy to understand and maintain.