# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/controller

This directory contains the controller classes for the Sunbird RC Core project. These classes handle incoming HTTP requests and delegate tasks to the appropriate services.

## AbstractController.java
This is the base class for all controller classes in this directory. It provides common functionalities and methods to be used by the derived controller classes.

## FileStorageController.java
This class handles file storage-related operations, such as uploading and retrieving files from the storage system.

## RegistryAttestationPolicyController.java
This class manages the attestation policies for the registry. It allows creating, updating, and deleting attestation policies.

## RegistryCertificateController.java
This class is responsible for managing registry certificates. It provides endpoints for creating, updating, and deleting certificates.

## RegistryClaimsController.java
This class handles registry claims, which are pieces of information about a user or entity that can be verified. It provides methods for adding, updating, and deleting claims.

## RegistryController.java
This is the main controller class for the registry. It provides the primary endpoints for interacting with the registry system.

## RegistryEntityController.java
This class manages registry entities, which are the users or organizations that interact with the registry. It provides methods for creating, updating, and deleting entities.

## RegistrySwaggerController.java
This class is responsible for generating and serving the Swagger documentation for the registry API. It ensures that the API documentation is up-to-date and accessible.

## RegistryTemplateController.java
This class manages templates for registry entities, claims, and certificates. It allows creating, updating, and deleting templates.

## RegistryUtilsController.java
This class contains utility methods and endpoints that do not fit into the other controller classes. It provides miscellaneous functionalities that support the registry system.

The controller classes in this directory are essential for providing a clean and organized API for the Sunbird RC Core project. They enable developers to interact with the registry system easily and efficiently.