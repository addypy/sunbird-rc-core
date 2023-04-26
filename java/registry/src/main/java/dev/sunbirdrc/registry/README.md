# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry

This directory contains the source code for the Sunbird RC Core Registry, an open-source software framework for building electronic registries, enabling attestation capabilities, and building verifiable credentialing with minimal effort.

Below is an overview of the main components within this directory:

## Constants.java
This file contains constant values used throughout the application.

## app/
Contains the main application files:
- `AppStartupRunner.java`: Initializes the application at startup.
- `SunbirdRCApplication.java`: The main entry point for the Spring Boot application.

## config/
Contains various configuration classes:
- `GenericConfiguration.java`: General application configuration.
- `KafkaConfiguration.java`: Configuration for Kafka messaging.
- `MinioClientConfig.java`: Configuration for the Minio file storage client.
- `SchemaFilter.java`: Filters schema files for loading.
- `SchemaLoader.java`: Loads schema files.
- `SecurityConfig.java`: Application security configuration.
- `validation/`: Contains classes for validating database configurations.

## consumers/
Contains the `CreateEntityConsumer.java` class, which is responsible for consuming CreateEntity messages from Kafka.

## controller/
Contains the controller classes that handle incoming HTTP requests:
- `AbstractController.java`: Base class for all controllers.
- `FileStorageController.java`: Handles file storage-related requests.
- `RegistryXXXController.java`: Handles various registry-related requests.

## dao/
Contains Data Access Object (DAO) classes for interacting with the underlying data storage:
- `IRegistryDao.java`: Interface for the registry DAO.
- `RegistryDaoImpl.java`: Implementation of the registry DAO.
- `SearchDao.java`: Interface for search functionality.
- `SearchDaoImpl.java`: Implementation of search functionality.

## entities/
Contains entity classes representing various components of the registry:
- `AttestationPolicy.java`: Represents an attestation policy.
- `AttestationStatus.java`: Represents the status of an attestation.
- `VerificationRequest.java`: Represents a request for verification.

## exception/
Contains custom exception classes used throughout the application.

## frame/
Contains the `FrameContext.java` class, which is used to process data frames in the application.

## helper/
Contains helper classes for various tasks:
- `EntityStateHelper.java`: Assists with entity state management.
- `RegistryHelper.java`: Provides utility functions for the registry.

## model/
Contains various model classes used throughout the application, such as:
- `AuditRecordReader.java`: Reads audit records.
- `RegistrySignature.java`: Represents a registry signature.

## service/
Contains service classes for various tasks:
- `DecryptionHelper.java`: Helps with decryption tasks.
- `EncryptionHelper.java`: Helps with encryption tasks.
- `IAuditService.java`: Interface for audit services.
- `ICertificateService.java`: Interface for certificate services.
- `IReadService.java`: Interface for read services.
- `ISearchService.java`: Interface for search services.

## sink/
Contains classes related to data storage and retrieval:
- `DBProviderFactory.java`: Factory for creating database providers.
- `DatabaseProvider.java`: Interface for database providers.

## util/
Contains utility classes for various tasks:
- `ArrayHelper.java`: Provides utility functions for working with arrays.
- `ClaimRequestClient.java`: Handles claim requests.
- `Definition.java`: Represents a definition in the registry.
- `DefinitionsManager.java`: Manages definitions within the registry.
- `GraphDBFactory.java`: Factory for creating graph databases.
- `IDefinitionsManager.java`: Interface for definitions managers.
- `IndexHelper.java`: Helps with indexing tasks.
- `JsonKeys.java`: Contains JSON key constants.
- `OSResourceLoader.java`: Loads resources for the application.
- `PrivateField.java`: Represents a private field in the registry.
- `ReadConfigurator.java`: Configures read operations.
- `RecordIdentifier.java`: Represents a record identifier in the registry.
- `RefLabelHelper.java`: Helps with reference labels.
- `ResponseUtil.java`: Provides utility functions for HTTP responses.
- `TypePropertyHelper.java`: Helps with type properties.

Please refer to the README files within each subdirectory for more detailed information on the contents and functionality of the various components.