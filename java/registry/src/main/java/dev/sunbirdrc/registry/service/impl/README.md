
# [SignatureServiceImpl.java](sunbird-rc-core/java/registry/src/main/java/dev/sunbirdrc/registry/service/impl/SignatureServiceImpl.java)

## Description
`SignatureServiceImpl.java` is a Java class that implements the `ISignatureService` interface. It provides methods for generating digital signatures and verifying the authenticity of signed data. The class is responsible for handling digital signature-related operations, such as signing JSON data, verifying signed data, and fetching the public key of the signer.

### Key Methods

1. `sign(JsonNode data)`: This method generates a digital signature for the given JSON data. It takes a `JsonNode` object representing the data to be signed and returns a `SignatureResponse` object containing the signed data and the signature value.

   Example usage:
   ```java
   ISignatureService signatureService = new SignatureServiceImpl(...);
   JsonNode data = ...;
   SignatureResponse signatureResponse = signatureService.sign(data);
   ```

2. `verify(JsonNode signedData)`: This method verifies the authenticity of the given signed data. It takes a `JsonNode` object representing the signed data and returns a boolean value indicating whether the signature is valid or not.

   Example usage:
   ```java
   ISignatureService signatureService = new SignatureServiceImpl(...);
   JsonNode signedData = ...;
   boolean isValid = signatureService.verify(signedData);
   ```

3. `getPublicKey(String keyId)`: This method fetches the public key of the signer identified by the given key ID. It takes a `String` representing the key ID and returns a `PublicKey` object representing the signer's public key.

   Example usage:
   ```java
   ISignatureService signatureService = new SignatureServiceImpl(...);
   String keyId = "exampleKeyId";
   PublicKey publicKey = signatureService.getPublicKey(keyId);
   ```

4. `getServiceName()`: This method returns the name of the Sunbird Signature Service.

5. `getHealthInfo()`: This method checks the health status of the Sunbird Signature Service by sending a GET request to the health check URL. It returns a `ComponentHealthInfo` object containing the service name, health status, and any additional information.

   Example usage:
   ```java
   ISignatureService signatureService = new SignatureServiceImpl(...);
   ComponentHealthInfo healthInfo = signatureService.getHealthInfo();
   System.out.println("Service Name: " + healthInfo.getServiceName());
   System.out.println("Is Healthy: " + healthInfo.isHealthy());
   ```
