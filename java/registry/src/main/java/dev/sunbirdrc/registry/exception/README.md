# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/exception

This directory contains custom exception classes used in the Sunbird RC Core application. These exceptions help in handling specific error scenarios and provide meaningful error messages, making it easier to understand and debug issues in the code.

## List of Exception Classes

- [AttestationNotFoundException.java](#attestationnotfoundexceptionjava)
- [AuditFailedException.java](#auditfailedexceptionjava)
- [CustomException.java](#customexceptionjava)
- [EncryptionException.java](#encryptionexceptionjava)
- [EntityCreationException.java](#entitycreationexceptionjava)
- [InvalidPluginPathException.java](#invalidpluginpathexceptionjava)
- [MultipleEntityException.java](#multipleentityexceptionjava)
- [NullCheckException.java](#nullcheckexceptionjava)
- [RecordNotFoundException.java](#recordnotfoundexceptionjava)
- [SchemaException.java](#schemaexceptionjava)
- [TypeNotProvidedException.java](#typenotprovidedexceptionjava)
- [UnAuthorizedException.java](#unauthorizedexceptionjava)
- [UnexpectedInputException.java](#unexpectedinputexceptionjava)
- [UpdateException.java](#updateexceptionjava)

### AttestationNotFoundException.java

This script defines a custom exception called `AttestationNotFoundException`. This exception is thrown when an attestation is not found in the system. An attestation is a digital proof that verifies the authenticity of a user or entity's data in the registry.

### AuditFailedException.java

This script defines a custom exception class called `AuditFailedException`. This exception is thrown when there is an issue with the auditing process in the Sunbird RC framework.

### CustomException.java

`CustomException.java` is a custom exception class that extends the built-in Java `Exception` class. This custom exception is used to handle specific error scenarios in the Sunbird RC framework.

### EncryptionException.java

`EncryptionException.java` is a custom exception class that extends the built-in Java `Exception` class. This custom exception is used to handle encryption-related errors that may occur within the Sunbird RC Core application.

### EntityCreationException.java

This script defines a custom exception class called `EntityCreationException`. This exception is thrown when there is an issue or error while creating an entity in the Sunbird RC framework.

### InvalidPluginPathException.java

This script defines a custom exception called `InvalidPluginPathException`. This exception is thrown when there is an issue with the provided plugin path.

### MultipleEntityException.java

This script defines a custom exception called `MultipleEntityException`. This exception is thrown when there are multiple entities found in a situation where only one entity is expected.

### NullCheckException.java

`NullCheckException.java` is a custom exception class that extends the built-in `Exception` class in Java. This custom exception is used to handle cases where a null value is encountered when it is not expected.

### RecordNotFoundException.java

This script defines a custom exception called `RecordNotFoundException`. This exception is thrown when a record is not found in the registry.

### SchemaException.java

`SchemaException` is a custom exception class that extends the built-in `Exception` class in Java. It is used to handle errors related to the schema of the data in the Sunbird RC framework.

### TypeNotProvidedException.java

This script defines a custom exception called `TypeNotProvidedException`. This exception is thrown when a required type is not provided in a specific operation within the Sunbird RC framework.

### UnAuthorizedException.java

This script defines a custom exception called `UnAuthorizedException` that is used to handle unauthorized access situations in the Sunbird RC Core application.

### UnexpectedInputException.java

This script defines a custom exception class called `UnexpectedInputException`. This exception is thrown when the program encounters an unexpected input that it cannot handle.

### UpdateException.java

`UpdateException.java` is a custom exception class that extends the built-in Java `Exception` class. This custom exception is used to handle update-related errors in the Sunbird RC framework.