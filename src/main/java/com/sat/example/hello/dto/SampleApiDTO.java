package com.sat.example.hello.dto;

import com.sat.example.hello.model.db.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Created by Satish on 4/16/2018.
 */
public class SampleApiDTO {
    public Person convertJSONToEntityFormat(com.sat.example.hello.model.json.Person person) throws ParseException {
        Person personObj = new Person();
        personObj.setId(Integer.parseInt(person.getId()));
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
        personObj.setDateOfBirth(sdf.parse(person.getDateOfBirth()));
        personObj.setName(person.getName());
        return personObj;
    }
}
