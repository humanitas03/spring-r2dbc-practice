package com.example.springr2dbcmysqlkotlin

import com.example.springr2dbcmysqlkotlin.service.PersonService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController(
    private val personService: PersonService,
) {

    @GetMapping("/person/{name}")
    fun getPersonByName(@PathVariable("name") name: String) = personService.findByPersonByName(name)

    @GetMapping(path = ["/persons"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
    fun getAllPersonsStream() = personService.findAllPerson()
}
