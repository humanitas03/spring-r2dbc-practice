package com.example.spring.r2dbc.mysql.java.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;


@Table("user")
public class UserEntity implements Persistable<String> {

    @Id
    private String id;
    private String name;
    private int age;

    // https://docs.spring.io/spring-data/data-commons/docs/current/api/index.html?org/springframework/data/domain/Persistable.html
    @Transient
    public final boolean newFlag;

    public UserEntity() {
        this.newFlag = true;
    }

    public UserEntity(String userId, String userName, int age, boolean newFlag) {
        this.id = userId;
        this.name = userName;
        this.age = age;
        this.newFlag = newFlag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    @Transient
    public boolean isNew(){
        return this.newFlag;
    }

    @Override
    public String toString(){
        return "id : " + this.id + " \n" +
                "name : " + this.name + "\n" +
                "age : " + this.age + "\n";
    }
}
