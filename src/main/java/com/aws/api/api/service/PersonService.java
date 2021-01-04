package com.aws.api.api.service;

import com.aws.api.api.entity.Person;
import com.aws.api.api.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepository repo;

    @Autowired
    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    public List<Person> get() {
        return repo.findAll();
    }
}
