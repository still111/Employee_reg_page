package com.spring.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class checkEmailValidator
        implements ConstraintValidator<checkEmail, String> {

    private String endOfEmail;
    @Override
    public boolean isValid(String enteredValue,
                           ConstraintValidatorContext constraintValidatorContext) {

        return enteredValue.endsWith(endOfEmail);
    }

    @Override
    public void initialize(checkEmail checkEmail) {
        endOfEmail = checkEmail.value();
    }
}
