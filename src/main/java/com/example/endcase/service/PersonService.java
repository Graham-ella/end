package com.example.endcase.service;

import com.example.endcase.dao.PersonDao;
import com.example.endcase.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    PersonDao personDao;

    public Person findByName(String name){
        return personDao.findByName(name);
    }

    public List<Person> findAllPerson(){
        return personDao.findAll();
    }
}
