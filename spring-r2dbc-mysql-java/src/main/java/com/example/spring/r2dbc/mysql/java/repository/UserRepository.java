package com.example.spring.r2dbc.mysql.java.repository;


import com.example.spring.r2dbc.mysql.java.entity.UserEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends R2dbcRepository<UserEntity, String> {

}
