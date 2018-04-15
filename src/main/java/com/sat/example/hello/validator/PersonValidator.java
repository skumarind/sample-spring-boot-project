package com.sat.example.hello.validator;

import com.sat.example.hello.exception.PersonValidationException;
import com.sat.example.hello.model.json.Person;

/**
 * Created by Satish on 4/15/2018.
 */
public class PersonValidator {

    public void validatePerson(Person person) throws PersonValidationException {
        validateName(person.getName());
    }

    private void validateName(String name) throws PersonValidationException {
        if(!name.matches("[a-zA-Z\\s]+")){
            throw new PersonValidationException("Name should contain alphabets");
        }
        if(name.length() > 60){
            throw new PersonValidationException("Name should be between 2 and 60 characters");
        }
    }
}
