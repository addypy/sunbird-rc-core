package dev.sunbirdrc.registry.dao;

// Custom exception class for handling "Not Found" scenarios in the application
public class NotFoundException extends Exception {
    // Entity type for which the record was not found
    private final String entityType;
    // Unique identifier (osid) of the entity for which the record was not found
    private final String osid;

    // Constructor for NotFoundException, takes entityType and osid as parameters
    public NotFoundException(String entityType, String osid) {
        // Call the superclass constructor with a formatted error message
        super(String.format("Record not found of type %s with id %s", entityType, osid));
        // Set the entityType and osid for this exception instance
        this.entityType = entityType;
        this.osid = osid;
    }
}