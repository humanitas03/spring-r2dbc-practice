package com.example.springr2dbcmysqlkotlin.repository

import com.example.springr2dbcmysqlkotlin.entity.Person
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface PersonRepository : ReactiveCrudRepository<Person, Long> {

    @Query("""
        
    """)
    Flux<Person>
}