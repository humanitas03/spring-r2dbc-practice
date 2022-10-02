package com.example.springr2dbcquerydslmysqljava.repository;

import com.example.springr2dbcquerydslmysqljava.entity.Member;
import com.infobip.spring.data.r2dbc.QuerydslR2dbcRepository;

public interface MemberRepository extends QuerydslR2dbcRepository<Member, Long> {

}
