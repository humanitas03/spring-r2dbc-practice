package com.example.springr2dbcmysqlkotlin.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("team")
data class Team(

    @Id
    var id: Int? = null,

    var teamName: String?,
)
