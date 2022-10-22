package com.example.springr2dbcmysqlkotlin.repository

import com.example.springr2dbcmysqlkotlin.entity.Person
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Flux

interface PersonRepository : ReactiveCrudRepository<Person, Long> {

    @Query(
        """
        SELECT P.* From person P INNER JOIN team on P.team_id = team.id WHERE P.name = :personName
    """
    )
    fun findPersonAndTem(personName: String): Flux<Person>
}
