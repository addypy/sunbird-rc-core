# sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/entities

This directory contains the Java classes that represent the entities used in the Sunbird RC electronic registry framework.

## AttestationPolicy.java

This file is used to define the attestation policies for the electronic registries.

## AttestationStatus.java

This enumeration represents the attestation status of an entity in the registry. It has two possible values:

1. `DRAFT`: The entity is in draft status, meaning it has not yet been attested.
2. `PUBLISHED`: The entity is published and attested.

This enumeration is used to track and manage the attestation status of entities within the Sunbird RC framework.

## AttestationStep.java

The `AttestationStep` class represents a single step in the attestation process. It contains information about the API endpoint, method, and request schema for that step. This class is used to define and manage the steps involved in the attestation process within the Sunbird RC framework.

## AttestationType.java

`AttestationType.java` is an enumeration file that represents the types of attestation available in the Sunbird RC system. Attestation is the process of verifying and confirming the authenticity of data or information.

## AttestorPluginType.java

`AttestorPluginType.java` is an enumeration file that represents the types of Attestor Plugins in the Sunbird RC system. Attestor Plugins are components that help in the attestation process, which is the act of verifying and validating data in the registry.

## FlowType.java

`FlowType.java` is an enumeration file that represents the different types of flows in the registry system. Enumerations, or enums, are a special type of class in Java that allows you to define a fixed set of constants. In this case, the constants represent the various flow types that can occur within the registry system.

## RevokedCredential.java

`RevokedCredential.java` is a class that represents a revoked credential in the registry system. A revoked credential is a previously issued credential that has been invalidated by the issuer or the system for various reasons, such as expiration or misuse.

## SchemaStatus.java

`SchemaStatus.java` is an enumeration representing the status of a schema in the registry. A schema is a structure that defines the data and metadata about a user or entity in the registry.

## VerificationRequest.java

The `VerificationRequest` class represents a request to verify signed credentials. It is used when a user or entity wants to verify the authenticity of the credentials they have received.