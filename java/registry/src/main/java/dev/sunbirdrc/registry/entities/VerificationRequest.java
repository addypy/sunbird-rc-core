package dev.sunbirdrc.registry.entities;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

// This class represents a verification request for signed credentials
@Data
public class VerificationRequest {
    // The signedCredentials field holds the JSON representation of the signed credentials
    JsonNode signedCredentials;
}