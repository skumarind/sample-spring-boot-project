package com.sat.example.hello.service;

import com.sat.example.hello.model.json.Person;

import java.text.ParseException;

/**
 * Created by Satish on 4/15/2018.
 */
public interface SampleApiService {
    public void createPerson(Person person) throws ParseException;
}
