package com.sat.example.hello.dao;

import java.text.ParseException;

/**
 * Created by Satish on 4/15/2018.
 */
public class SampleApiDAO {
    public void createPerson(com.sat.example.hello.model.db.Person person) throws ParseException {
        System.out.println("Database person obj="+person);
        System.out.println("Person saved in DAO layer");
    }
}
