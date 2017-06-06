package com.marriageonmind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marriageonmind.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
List<Person> findByCity(String cityName);
}
