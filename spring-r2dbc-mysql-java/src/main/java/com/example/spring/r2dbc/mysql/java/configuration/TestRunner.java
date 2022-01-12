package com.example.spring.r2dbc.mysql.java.configuration;

import com.example.spring.r2dbc.mysql.java.entity.UserEntity;
import com.example.spring.r2dbc.mysql.java.repository.UserRepository;
import java.time.Duration;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        UserEntity newUser = new UserEntity(UUID.randomUUID().toString(), "jackson", 11, true);
        var result = userRepository
                .save(newUser)
                .blockOptional(Duration.ofSeconds(5))
                .orElseThrow();

        System.out.println(result);
    }
}
