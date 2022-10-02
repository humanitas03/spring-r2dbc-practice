package com.example.springr2dbcquerydslmysqljava.repository;

import com.example.springr2dbcquerydslmysqljava.entity.Member;
import com.example.springr2dbcquerydslmysqljava.entity.QMember;
import com.example.springr2dbcquerydslmysqljava.entity.QTeam;
import com.example.springr2dbcquerydslmysqljava.repository.dto.MemberProjection;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@RequiredArgsConstructor
public class MemberCustomRepository {
    private final MemberRepository memberRepository;

    public Flux<MemberProjection> findMemberWithTeam(Long memberId) {
        var member = QMember.member;
        var team = QTeam.team;

        BooleanBuilder builder = new BooleanBuilder();

        if(memberId != 0L) {
            builder.and(member.id.eq(memberId));
        }

        return memberRepository.query(query-> query.select(Projections.constructor(
                MemberProjection.class,
                    member.id.as("memberId"),
                    member.name.as("name"),
                    team.name.as("teamName")
                ))
                .from(member)
                .leftJoin(team)
                .on(member.teamId.eq(team.id))
            .where(builder)
        ).all();
    }

}
