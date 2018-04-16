package com.sat.example.hello.service;

import com.sat.example.hello.dao.SampleApiDAO;
import com.sat.example.hello.dto.SampleApiDTO;
import com.sat.example.hello.model.json.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;

/**
 * Created by Satish on 4/15/2018.
 */
public class SampleApiServiceImpl implements SampleApiService {
    @Autowired
    private SampleApiDAO sampleApiDAO;

    @Autowired
    private SampleApiDTO sampleApiDTO;

    @Override
    public void createPerson(Person person) throws ParseException {
        com.sat.example.hello.model.db.Person personObj = sampleApiDTO.convertJSONToEntityFormat(person);
        sampleApiDAO.createPerson(personObj);
    }
}
