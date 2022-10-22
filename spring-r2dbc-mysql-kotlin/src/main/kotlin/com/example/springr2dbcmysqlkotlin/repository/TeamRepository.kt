package com.example.springr2dbcmysqlkotlin.repository

import com.example.springr2dbcmysqlkotlin.entity.Team
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface TeamRepository : ReactiveCrudRepository<Team, Long> {
}