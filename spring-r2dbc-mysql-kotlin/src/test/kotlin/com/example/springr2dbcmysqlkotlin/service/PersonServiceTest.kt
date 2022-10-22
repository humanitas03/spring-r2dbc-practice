package com.example.springr2dbcmysqlkotlin.service

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class PersonServiceTest @Autowired constructor(
    private val personService: PersonService
) {

    @Test
    fun personServiceSearchTest() {

    }
}