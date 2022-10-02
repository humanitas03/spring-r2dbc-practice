package com.example.springr2dbcquerydslmysqljava.entity;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("member_tb")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Member {
    @Id
    @Column("id")
    private Long id;

    @Column("team_id")
    private Long teamId;

    @Column("name")
    private String name;

    @Column("email")
    private String email;

    @Column("phone_number")
    private String phoneNumber;
}
