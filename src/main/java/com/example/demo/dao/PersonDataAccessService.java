package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class PersonDataAccessService implements PersonDAO {
    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        return Arrays.asList(new Person(UUID.randomUUID(), "FROM POSTGRES DB"));
        //List.of using Java 11, had no other choice here using Java 8
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return 0;
    }
}
