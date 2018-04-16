package com.sat.example.hello.model.db;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Satish on 4/16/2018.
 */
@Entity
@Table(name="Person")
public class Person implements Serializable{
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
