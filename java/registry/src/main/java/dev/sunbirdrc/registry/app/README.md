# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/app

This directory contains the main application files for the Sunbird RC framework, which is an open-source software framework for building electronic registries, attestation capabilities, and verifiable credentialing with minimal effort.

## Files

### AppStartupRunner.java

**Path**: `java/registry/src/main/java/dev/sunbirdrc/registry/app/AppStartupRunner.java`

`AppStartupRunner.java` is responsible for initializing and setting up the application during startup. It performs tasks such as loading configurations, setting up database connections, and initializing beans required for the application to run. This file ensures that all necessary components are in place before the application starts accepting requests.

### SunbirdRCApplication.java

**Path**: `java/registry/src/main/java/dev/sunbirdrc/registry/app/SunbirdRCApplication.java`

`SunbirdRCApplication.java` is the main entry point for the application. It contains the `main` method, which starts the Spring Boot application. This file is responsible for bootstrapping the application, initializing the Spring Boot framework, and launching the application server.

## Usage

To start the Sunbird RC application, you need to run the `SunbirdRCApplication.java` file. This will initialize the application, load the required configurations, and start the application server. Once the server is up and running, you can interact with the application through its exposed APIs and use it for building electronic registries, attestation capabilities, and verifiable credentialing.