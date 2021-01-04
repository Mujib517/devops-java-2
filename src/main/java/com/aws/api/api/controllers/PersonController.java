package com.aws.api.api.controllers;

import com.aws.api.api.entity.Person;
import com.aws.api.api.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/person")
public class PersonController {
    private PersonService svc;

    public PersonController(PersonService svc) {
        this.svc = svc;
    }

    @GetMapping
    public ResponseEntity<List<Person>> get() {
        List<Person> people = svc.get();
        return ResponseEntity.ok(people);
    }
}
