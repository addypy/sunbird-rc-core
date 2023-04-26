package dev.sunbirdrc.registry.exception;

// This class represents a custom exception for unauthorized access.
public class UnAuthorizedException extends RuntimeException {
    // Constructor for the UnAuthorizedException class, taking a message as input.
    public UnAuthorizedException(String message) {
        // Call the superclass (RuntimeException) constructor with the provided message.
        super(message);
    }
}