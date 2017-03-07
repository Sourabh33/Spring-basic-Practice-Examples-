package com.sourabh.custom.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target( {ElementType.FIELD} )
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobby {

	String message() default "Please Provide a valid Hobby;" +
	"accepted hobbies are - Music, football, cricket and Hockey (choose anyone)";

	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
