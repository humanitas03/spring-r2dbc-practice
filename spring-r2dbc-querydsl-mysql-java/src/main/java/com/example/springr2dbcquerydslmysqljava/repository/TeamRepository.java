package com.example.springr2dbcquerydslmysqljava.repository;

import com.example.springr2dbcquerydslmysqljava.entity.Member;
import com.example.springr2dbcquerydslmysqljava.entity.Team;
import com.infobip.spring.data.r2dbc.QuerydslR2dbcRepository;

public interface TeamRepository extends QuerydslR2dbcRepository<Team, Long> {

}
