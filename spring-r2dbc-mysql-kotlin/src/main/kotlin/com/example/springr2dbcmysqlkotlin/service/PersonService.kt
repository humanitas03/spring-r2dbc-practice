package com.example.springr2dbcmysqlkotlin.service

import com.example.springr2dbcmysqlkotlin.repository.PersonRepository
import org.springframework.stereotype.Service

@Service
class PersonService(
    private val personRepository: PersonRepository,
) {


}