package dev.sunbirdrc.registry.exception;

// This class represents a custom exception for handling duplicate records in the registry.
public class DuplicateRecordException extends Exception {
	// Serial version UID for serialization purposes.
	private static final long serialVersionUID = 8531501706088259947L;

	// Constructor that takes a custom error message as input.
	public DuplicateRecordException(String message) {
		super(message);
	}
}