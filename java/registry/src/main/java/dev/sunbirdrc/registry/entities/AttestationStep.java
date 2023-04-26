package dev.sunbirdrc.registry.entities;

import lombok.Data;

// AttestationStep class represents a single step in the attestation process.
// It contains information about the API endpoint, method, and request schema for that step.
@Data
public class AttestationStep {
    private String osid; // Unique identifier for the attestation step
    private String apiURL; // URL of the API endpoint for this attestation step
    private String apiMethod; // HTTP method (e.g., GET, POST) for the API endpoint
    private String apiRequestSchema; // JSON schema for the API request payload
}