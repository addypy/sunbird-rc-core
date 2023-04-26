# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/config

This directory contains the configuration files for the Sunbird RC Core project. These files are responsible for setting up various components and services required for the proper functioning of the application.

## GenericConfiguration.java

This file contains the generic configuration settings for the Sunbird RC Core application. These settings include server properties, caching properties, and other general application settings.

## KafkaConfiguration.java

This file contains the configuration settings for integrating with Apache Kafka. It includes settings for Kafka producers and consumers, such as bootstrap servers, message serialization, and deserialization, and other Kafka-related properties.

## MinioClientConfig.java

This file contains the configuration settings for connecting to and interacting with the Minio object storage service. It includes settings for the Minio client, such as the endpoint, access key, secret key, and bucket name.

## SchemaFilter.java

This file contains the implementation of a filter that is responsible for filtering out invalid or unauthorized schema requests. It ensures that only valid and authorized schema requests are processed by the application.

## SchemaLoader.java

This file contains the implementation of a loader that loads schema files from the specified path during the initialization of the application. It reads the schema files and stores them in memory for further use.

## SecurityConfig.java

This file contains the security configuration settings for the Sunbird RC Core application. It includes settings for authentication, authorization, and secure communication between the different components of the application.

## validation/

This sub-directory contains the files related to the validation of database configurations.

### DatabaseConfigValidator.java

This file contains the implementation of a validator that is responsible for validating the database configuration settings. It checks if the settings are valid and properly configured for the application.

### README.md

This file provides a brief description of the files and their purpose within the validation sub-directory.

### ValidDatabaseConfig.java

This file contains a custom annotation used to mark a database configuration as valid. It is used in conjunction with the DatabaseConfigValidator to ensure that only valid database configurations are used in the application.