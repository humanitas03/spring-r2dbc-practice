package com.example.springr2dbcquerydslmysqljava.controller;

import com.example.springr2dbcquerydslmysqljava.repository.MemberCustomRepository;
import com.example.springr2dbcquerydslmysqljava.repository.dto.MemberProjection;
import com.example.springr2dbcquerydslmysqljava.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/member/{member-id}")
    public Flux<MemberProjection> memberWithTeam(@PathVariable("member-id") Long id) {
        return memberService.findMemberWithTeam(id);
    }
}
