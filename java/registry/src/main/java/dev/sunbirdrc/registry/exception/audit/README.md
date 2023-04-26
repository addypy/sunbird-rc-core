# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/exception/audit

This directory contains custom exception classes used in the Sunbird RC framework to handle errors related to auditing and registry operations. Here is an overview of each file and its purpose:

## [AuditException.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/exception/audit/AuditException.java)

### Description
`AuditException.java` is a custom exception class that extends the built-in `Exception` class in Java. This custom exception is used to handle errors related to auditing in the Sunbird RC framework. When an issue occurs during the auditing process, this exception is thrown with a specific error message to provide more information about the problem.

For example, if there is an issue with the audit log data, the `AuditException` can be thrown with a message like "Invalid audit log data". This helps developers and users to understand the cause of the error and take appropriate action.

## [EntityTypeMissingException.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/exception/audit/EntityTypeMissingException.java)

### Description
`EntityTypeMissingException` is a custom exception class that extends the `AuditException` class. This exception is thrown when the entity type is missing in the registry operation. The class has a constructor that takes a string message as an argument and passes it to the superclass constructor.

For example, if a registry operation requires an entity type to be specified and it is not provided, the `EntityTypeMissingException` can be thrown with a relevant error message to inform the user about the missing information.

## [InvalidArguementException.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/exception/audit/InvalidArguementException.java)

### Description
`InvalidArguementException` is a custom exception class that extends the `AuditException` class. It is used to handle situations where an invalid argument is passed to a method or function in the Sunbird RC framework. When this exception is thrown, it will display a custom error message to inform the user about the invalid argument.

For example, if a method in the Sunbird RC framework expects a certain type of input and receives an incorrect or invalid input, the `InvalidArguementException` can be thrown with a message describing the issue. This helps developers and users to understand the cause of the error and fix it accordingly.

## [LabelCannotBeNullException.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/exception/audit/LabelCannotBeNullException.java)

### Description
This script defines a custom exception called `LabelCannotBeNullException`. This exception is thrown when a label is expected to have a value, but it is found to be null. The exception extends the base `Exception` class and takes a custom error message as an argument.

For example, if a label is required for a certain operation in the registry, but the label is missing or has a null value, this exception can be thrown to indicate the issue. The custom error message can provide more context about the specific problem encountered.