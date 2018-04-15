package com.sat.example.hello.endpoint;

import com.sat.example.hello.exception.PersonValidationException;
import com.sat.example.hello.model.json.Person;
import com.sat.example.hello.service.SampleApiService;
import com.sat.example.hello.validator.PersonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Satish on 3/15/2018.
 */
@RestController
public class HelloController {
    @Autowired
    private PersonValidator personValidator;

    @Autowired
    private SampleApiService sampleApiService;

    @RequestMapping(value = "/person", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity createPerson(@RequestBody Person person) {
        try {
            personValidator.validatePerson(person);
            sampleApiService.createPerson(person);
            return ResponseEntity.ok().body("Person created");
        } catch (PersonValidationException e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
