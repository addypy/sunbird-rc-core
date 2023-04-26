package dev.sunbirdrc.registry.entities;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

// This class represents a revoked credential in the registry system.
@Data
@Builder
@EqualsAndHashCode
public class RevokedCredential {
    // The entity type of the revoked credential.
    private String entity;
    
    // The unique identifier of the revoked credential's entity.
    private String entityId;
    
    // The attestation property associated with the revoked credential.
    private String attestationProperty;
    
    // The unique identifier of the attestation property.
    private String attestationPropertyId;
    
    // The signed data of the revoked credential.
    private String signedData;
    
    // The signed hash of the revoked credential.
    private String signedHash;
    
    // The user identifier associated with the revoked credential.
    private String userId;
}