package com.example.endcase.controller;

import com.example.endcase.pojo.CustomNode;
import com.example.endcase.pojo.Person;
import com.example.endcase.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    PersonService personService;

    @GetMapping("/{name}")
    public CustomNode findByName(@PathVariable("name") String name){
        Person person = personService.findByName(name);
        return new CustomNode(person.getName(), 1);
    }

    @GetMapping("/all")
    public List<CustomNode> findAllPerson(){
        List<Person> personList = personService.findAllPerson();
        List<CustomNode> customNodeList = new ArrayList<CustomNode>();
        for(Person person: personList){
            customNodeList.add(new CustomNode(person.getName(), 1));
        }
        return customNodeList;
    }
}
