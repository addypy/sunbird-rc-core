package dev.sunbirdrc.registry.config.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

// This annotation is used to validate database configuration properties
@Documented
// Specifies the types of elements to which this annotation can be applied
@Target({ METHOD, FIELD, CONSTRUCTOR, PARAMETER, TYPE_USE })
// Specifies how long the annotation should be retained
@Retention(RUNTIME)
// Specifies the validator class that will be used to validate the annotated elements
@Constraint(validatedBy = { DatabaseConfigValidator.class })
public @interface ValidDatabaseConfig {
    // Default error message to be displayed if the validation fails
	String message() default "{Invalid database properties}";
	// Default validation group
	Class<?>[] groups() default {};
	// Default payload for the constraint
	Class<? extends Payload>[] payload() default {};
}