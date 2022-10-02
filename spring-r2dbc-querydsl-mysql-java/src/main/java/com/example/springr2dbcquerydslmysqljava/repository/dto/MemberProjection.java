package com.example.springr2dbcquerydslmysqljava.repository.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberProjection {

    private Long memberId;
    private String name;
    private String teamName;
}
