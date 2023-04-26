# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/model/attestation

This directory contains classes related to the attestation process in the Sunbird RC framework. These classes are used to manage and process attestation paths and entity property URIs for entities in a registry.

## [AttestationPath.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/model/attestation/AttestationPath.java)

`AttestationPath` is a class that manages and processes attestation paths for entities in a registry. It provides methods to parse and extract information from a given attestation path, and to generate a set of `EntityPropertyURI` objects based on the provided JSON data.

### Key Components

- `path`: A string representing the attestation path.
- `steps`: A list of strings representing the individual steps in the attestation path.
- `ARRAY_STEP`: A constant string representing an array step in the path.
- `SEP`: A constant string representing the separator used in the path.

### Methods

- `AttestationPath(String path)`: Constructor that initializes the `path` variable.
- `setSteps()`: A private method that parses the `path` and populates the `steps` list.
- `getPath()`: Returns the `path` string.
- `getEntityPropertyURIs(JsonNode node, String uuidPropertyName)`: Takes a JSON node and a UUID property name as input and returns a set of `EntityPropertyURI` objects based on the provided data.

### Example Usage

Please refer to the detailed example usage in the AttestationPath.java section above.

## [EntityPropertyURI.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/EntityPropertyURI.java)

`EntityPropertyURI` is a utility class that helps in managing and manipulating property URIs and JSON pointers for entities in the Sunbird RC framework. It provides methods to merge property URIs, create an `EntityPropertyURI` object from a given entity and property URI, and access the JSON pointer and property URI of an `EntityPropertyURI` object.

### Example Usage

1. Creating an `EntityPropertyURI` object:
```java
EntityPropertyURI entityPropertyURI = new EntityPropertyURI("propertyURI", "/json/pointer");
```

2. Merging two `EntityPropertyURI` objects:
```java
EntityPropertyURI mergedEntityPropertyURI = EntityPropertyURI.merge(entityPropertyURI1, "uuidPath", "/json/path");
```

3. Creating an `EntityPropertyURI` object from an entity and property URI:
```java
Optional<EntityPropertyURI> optionalEntityPropertyURI = EntityPropertyURI.fromEntityAndPropertyURI(jsonNode, "propertyURI", "uuidPropertyName");
if (optionalEntityPropertyURI.isPresent()) {
    EntityPropertyURI entityPropertyURI = optionalEntityPropertyURI.get();
}
```

4. Accessing the JSON pointer and property URI of an `EntityPropertyURI` object:
```java
JsonPointer jsonPointer = entityPropertyURI.getJsonPointer();
String propertyURI = entityPropertyURI.getPropertyURI();
```
