package com.example.springr2dbcquerydslmysqljava.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.example.springr2dbcquerydslmysqljava.entity.Member;
import com.example.springr2dbcquerydslmysqljava.entity.Team;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@ActiveProfiles("test")
public class MemberCustomRepositoryTest {

    @Autowired
    private MemberCustomRepository memberCustomRepository;

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    @BeforeEach
    public void setUp() {
        var team1 = new Team(null, "team1");

        var savedTeam = teamRepository.save(team1).block();

        var member1 = new Member(null,savedTeam.getId(), "member1", "member1@test.com", "010-222-2222");
        var member2 = new Member(null,savedTeam.getId(), "member2", "member2@test.com", "010-122-2222");

        memberRepository.saveAll(List.of(member1, member2)).blockLast();
    }

    @AfterEach
    public void clearUp() {
        memberRepository.deleteAll().block();
        teamRepository.deleteAll().block();
    }

    // TODO : Transactionl이 안되는 이유 : https://dokku.dev/reactive/1843/
    @Test
    public void normalMemberJoinTest() {
        var existMembers = memberRepository.findAll().toStream().collect(Collectors.toList());

        var searchedResult = memberCustomRepository.findMemberWithTeam(existMembers.get(0).getId()).blockLast();

        assertNotNull(searchedResult);
        assertEquals(existMembers.get(0).getId(), searchedResult.getMemberId());
        assertEquals(existMembers.get(0).getName(), searchedResult.getName());

    }

    @Test
    public void normalMemberJoinWithAllTest() {
        var searchedResult = memberCustomRepository.findMemberWithTeam(0L).toStream().collect(
            Collectors.toList());

        assertEquals(2, searchedResult.size());
    }
}
