# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/model

This directory contains Java classes and packages that define and manage the data models used in the Sunbird Registry Core system. These classes are responsible for handling database connections, data signatures, and data structures for various registry operations, such as creating and attesting entities.

## Files and Packages

### AuditRecordReader.java
`AuditRecordReader.java` is a Java class that is responsible for reading audit records from the database. It is used to fetch and process the audit trail for various registry operations.

### DBConnectionInfo.java
`DBConnectionInfo.java` is a Java class that represents the connection information for the database. It contains attributes such as the database URL, username, password, and other configuration parameters needed for establishing a connection to the database.

### DBConnectionInfoMgr.java
`DBConnectionInfoMgr.java` is a Java class that manages the database connection information. It is responsible for creating, updating, and validating the connection information provided by `DBConnectionInfo.java`.

### IndexFields.java
`IndexFields.java` is a Java class that defines the index fields used in the registry. These fields are used to index the data stored in the registry, making it easy to search and retrieve specific entities.

### RegistrySignature.java
`RegistrySignature.java` is a Java class that represents the signature stamp that the registry puts on its data. This signature stamp is used to ensure the authenticity and integrity of the data stored in the registry. For more details, refer to the provided [description](#RegistrySignature.java).

### attestation/
This package contains Java classes that define the attestation process for the registry. It includes classes such as `AttestationPath.java` for defining the attestation path and `EntityPropertyURI.java` for managing property URIs.

### dto/
This package contains Data Transfer Object (DTO) classes that define the data structures used for various registry operations. These classes include:

- `AttestationRequest.java`: Represents an attestation request that is sent to the registry.
- `CreateEntityMessage.java`: Represents a message for creating a new entity in the registry.
- `CreateEntityStatus.java`: Represents the status of an entity creation operation.
- `DocumentsResponse.java`: Represents the response containing documents for a specific entity.
- `EntityDto.java`: Represents a data structure for an entity in the registry.
- `PostCreateEntityMessage.java`: Represents a message sent after an entity has been created.
- `WebhookEvent.java`: Represents a webhook event that is triggered by certain operations in the registry.

For more details on each class, refer to the README.md file inside the `dto/` directory.