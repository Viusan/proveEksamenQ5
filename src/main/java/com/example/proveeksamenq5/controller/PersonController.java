package com.example.proveeksamenq5.controller;

import com.example.proveeksamenq5.models.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import com.example.proveeksamenq5.repository.PersonRepository;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    private final PersonRepository repository;

    public PersonController(PersonRepository repository){
        this.repository = repository;
    }
    @PostMapping("/create")
    public void createUser(@RequestBody @Valid Person person){
        repository.insertUser(person);
    }
}
