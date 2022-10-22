package com.example.springr2dbcmysqlkotlin.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("person")
class Person (

    @Id
    var id: Long,

    var name: String,

    var phoneNumber: String,

    var teamId: Long,

    2
)