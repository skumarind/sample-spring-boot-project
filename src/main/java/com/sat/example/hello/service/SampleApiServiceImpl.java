package com.sat.example.hello.service;

import com.sat.example.hello.dao.SampleApiDAO;
import com.sat.example.hello.model.json.Person;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Satish on 4/15/2018.
 */
public class SampleApiServiceImpl implements SampleApiService {
    @Autowired
    private SampleApiDAO sampleApiDAO;

    @Override
    public void createPerson(Person person) {
        sampleApiDAO.createPerson(person);
    }
}
