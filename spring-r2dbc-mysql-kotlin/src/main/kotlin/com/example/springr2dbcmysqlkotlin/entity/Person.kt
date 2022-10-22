package com.example.springr2dbcmysqlkotlin.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("person")
class Person(

    @Id
    var id: Int? = null,

    var name: String?,

    var phoneNumber: String?,

    var teamId: Int?,
)
