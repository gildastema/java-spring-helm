package org.example.javademok8shelm;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class PersonController {

    private final PersonRepository personRepository;
    @PostMapping("/api/persons")
    public  Person create(@RequestBody Person person){
        log.info("User creation ");
        return personRepository.save(person);
    }

    @GetMapping("/api/persons")
    public List<Person> getPersons(){
        log.info("Get List of persons");
        return personRepository.findAll();
    }
}
