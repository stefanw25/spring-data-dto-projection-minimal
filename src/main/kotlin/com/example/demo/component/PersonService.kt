package com.example.demo.component

import com.example.demo.model.Person
import com.example.demo.repository.PersonRepository
import org.springframework.context.event.EventListener
import org.springframework.core.metrics.ApplicationStartup
import org.springframework.stereotype.Service

@Service
class PersonService(private val personRepository: PersonRepository) {
    init {
        onApplicationStartup()
    }

    @EventListener(ApplicationStartup::class)
    final fun onApplicationStartup() {
        println("Hello")
        listOf(
            Person().also {
                it.name = "Hans Paul"
            },
            Person().also {
                it.name = "Karl Heinz"
            }
        ).forEach { person -> personRepository.save(person) }

        personRepository.findAll().forEach {
            println(it.name)
        }
    }
}