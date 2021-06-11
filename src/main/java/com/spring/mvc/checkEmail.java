package com.spring.mvc;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = checkEmailValidator.class)
public @interface checkEmail {

    public String value() default "xyz.com";
    public String message() default "email must ends with xyz.com";

    public Class<?>[] groups() default {};
    public Class<? extends Payload> [] payload () default {};

}
