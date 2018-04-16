package com.sat.example.hello.config;

import com.sat.example.hello.dao.SampleApiDAO;
import com.sat.example.hello.dto.SampleApiDTO;
import com.sat.example.hello.service.SampleApiService;
import com.sat.example.hello.service.SampleApiServiceImpl;
import com.sat.example.hello.validator.PersonValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Satish on 4/15/2018.
 */
@Configuration
public class SampleAppConfig {

    @Bean
    public PersonValidator personValidator(){
        return new PersonValidator();
    }

    @Bean
    public SampleApiService sampleApiService(){
        return new SampleApiServiceImpl();
    }

    @Bean
    public SampleApiDAO sampleApiDAO(){
        return new SampleApiDAO();
    }

    @Bean
    public SampleApiDTO sampleApiDTO(){
        return new SampleApiDTO();
    }
}
