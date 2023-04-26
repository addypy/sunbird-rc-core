# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/service

This directory contains the service layer classes for the Sunbird RC Core application. These classes are responsible for implementing the business logic and handling the interactions between the data layer and the rest of the application.

## Files

### DecryptionHelper.java
This class contains helper methods for data decryption.

### ElasticReadService.java
This class is responsible for implementing the read operation for ElasticSearch.

### ElasticSearchService.java
This class contains the methods for interacting with ElasticSearch, including indexing, searching, and deleting documents.

### EncryptionHelper.java
This class contains helper methods for data encryption.

### EncryptionService.java
This class is responsible for handling encryption and decryption of data.

### FileStorageService.java
This class is responsible for handling file storage and retrieval operations.

### IAuditService.java
This interface defines the methods required for implementing audit services, such as logging and monitoring.

### ICertificateService.java
This interface defines the methods required for implementing certificate services, such as issuing and verifying certificates.

### IReadService.java
This interface defines the methods required for implementing read services, such as fetching data from a data source.

### ISearchService.java
This interface defines the methods required for implementing search services, such as querying and filtering data.

### KafkaHealthService.java
This class is responsible for monitoring and reporting the health of the Kafka service.

### NativeReadService.java
This class is responsible for implementing the read operation for native data sources.

### NativeSearchService.java
This class is responsible for implementing the search operation for native data sources.

### RegistryService.java
This class is responsible for managing registry operations, such as creating, updating, and deleting records.

### SchemaService.java
This class is responsible for managing schema operations, such as validation and transformation.

### SignatureHelper.java
This class contains helper methods for digital signature operations.

### SignatureService.java
This class is responsible for handling digital signature operations, such as signing and verifying data.

### WebhookService.java
This class is responsible for managing webhook operations, such as sending notifications to subscribed endpoints.

## impl directory

This directory contains the implementation classes for the various service interfaces.

### AuditDBImpl.java
This class implements the IAuditService interface for database audit operations.

### AuditDBWriter.java
This class is responsible for writing audit logs to the database.

### AuditFileImpl.java
This class implements the IAuditService interface for file-based audit operations.

### AuditProviderFactory.java
This class is responsible for creating instances of audit service implementations based on the application configuration.

### AuditServiceImpl.java
This class implements the IAuditService interface and provides the required audit operations.

### CertificateServiceImpl.java
This class implements the ICertificateService interface and provides the required certificate operations.

### EncryptionServiceImpl.java
This class implements the EncryptionService interface and provides the required encryption and decryption operations.

### README.md
This file provides documentation for the service implementation classes.

### RegistryAsyncServiceImpl.java
This class is responsible for handling asynchronous registry operations.

### RegistryServiceImpl.java
This class implements the RegistryService interface and provides the required registry operations.

### RetryRestTemplate.java
This class is responsible for handling RESTful API calls with retry functionality.

### SignatureServiceImpl.java
This class implements the SignatureService interface and provides the required digital signature operations.