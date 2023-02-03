package com.example.endcase.controller;

import com.example.endcase.pojo.Person;
import com.example.endcase.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/{name}")
    public Person findByName(@PathVariable("name") String name){
        return personService.findByName(name);
    }
}
