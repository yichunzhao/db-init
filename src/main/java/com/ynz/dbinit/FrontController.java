package com.ynz.dbinit;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
@RequiredArgsConstructor
public class FrontController {
    private final PersonRepository personRepository;

    @RequestMapping("all")
    Iterable<Person> getAllPersons() {
        return personRepository.findAll();
    }
}
