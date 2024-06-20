package com.example.demo.repository

import com.example.demo.dto.PersonDto
import com.example.demo.model.Person
import org.springframework.data.repository.Repository

interface PersonRepository : Repository<Person, Long> {
    fun findAll(): List<PersonDto>
    fun save(person: Person): Person
}