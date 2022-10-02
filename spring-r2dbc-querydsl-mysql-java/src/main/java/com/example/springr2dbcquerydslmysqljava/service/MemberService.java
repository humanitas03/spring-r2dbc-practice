package com.example.springr2dbcquerydslmysqljava.service;

import com.example.springr2dbcquerydslmysqljava.repository.MemberCustomRepository;
import com.example.springr2dbcquerydslmysqljava.repository.dto.MemberProjection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberCustomRepository memberCustomRepository;

    @Transactional(readOnly = true)
    public Flux<MemberProjection> findMemberWithTeam(Long memberId) {
        return memberCustomRepository.findMemberWithTeam(memberId);
    }
}
