# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/config/validation

## [DatabaseConfigValidator.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/config/validation/DatabaseConfigValidator.java)

### Description
The `DatabaseConfigValidator` class is responsible for validating the database configuration. It checks if the provided database configuration is valid by ensuring that certain fields are not empty and that certain values are unique.

The class implements the `ConstraintValidator` interface, which allows it to be used as a custom validation constraint in the application. The `isValid` method is the main method that performs the validation checks.

Here are some examples of the validation checks performed by the `DatabaseConfigValidator` class:

1. Check if the `provider` and `uuidPropertyName` fields are not empty.
2. Check if at least one `connectionInfo` is specified.
3. Check if the `shardId` and `uri` fields are not empty for each `connectionInfo`.
4. Check if the `shardLabel` field is not empty when multiple shards exist.
5. Check if the `shardId` is unique when multiple shards exist.
6. Check if the `shardLabel` is unique when multiple shards exist.

If any of the validation checks fail, an error message is set in the `ConstraintValidatorContext`. If all checks pass, the `isValid` method returns `true`.

## [ValidDatabaseConfig.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/config/validation/ValidDatabaseConfig.java)

### Description
This script defines a custom annotation called `ValidDatabaseConfig` that is used to validate database configuration properties. The annotation can be applied to various elements such as methods, fields, constructors, parameters, and type uses. It specifies the `DatabaseConfigValidator` class as the validator to be used for validating the annotated elements.

When the validation fails, a default error message "Invalid database properties" will be displayed. The annotation also provides default values for validation groups and payload.

### Example Usage
To use this custom annotation, you can apply it to a field or method that holds the database configuration properties. The `DatabaseConfigValidator` class will then be responsible for validating the properties.

```java
public class DatabaseConfiguration {
    @ValidDatabaseConfig
    private String connectionString;
    
    // Other fields and methods
}
```

In this example, the `connectionString` field will be validated using the `DatabaseConfigValidator` class when the `DatabaseConfiguration` object is validated. If the validation fails, the default error message "Invalid database properties" will be displayed.