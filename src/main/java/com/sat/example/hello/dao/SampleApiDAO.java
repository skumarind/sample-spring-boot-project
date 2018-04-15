package com.sat.example.hello.dao;

import com.sat.example.hello.model.json.Person;

/**
 * Created by Satish on 4/15/2018.
 */
public class SampleApiDAO {
    public void createPerson(Person person){
        System.out.println("Person saved in DAO layer");
    }
}
