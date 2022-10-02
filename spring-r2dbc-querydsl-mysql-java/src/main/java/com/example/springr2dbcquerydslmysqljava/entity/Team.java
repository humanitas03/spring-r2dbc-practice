package com.example.springr2dbcquerydslmysqljava.entity;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("team_tb")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Team {
    @Id
    @Column("id")
    private Long id;

    @Column("name")
    private String name;
}
