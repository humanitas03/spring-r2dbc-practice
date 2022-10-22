package com.example.springr2dbcmysqlkotlin.service

import com.example.springr2dbcmysqlkotlin.repository.PersonRepository
import org.springframework.stereotype.Service
import java.time.Duration

@Service
class PersonService(
    private val personRepository: PersonRepository,
) {

    fun findByPersonByName(personName: String) = personRepository.findPersonAndTem(personName)

    fun findAllPerson() = personRepository.findAll().delayElements(Duration.ofSeconds(1L))
}