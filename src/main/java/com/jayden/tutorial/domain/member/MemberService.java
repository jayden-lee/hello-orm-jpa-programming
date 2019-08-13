package com.jayden.tutorial.domain.member;

import com.jayden.tutorial.domain.member.infra.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import javax.transaction.Transactional;

@Service
public class MemberService {

    private MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public MemberDto.CreateMemberResponse createMember(MemberDto.CreateMemberRequest request) {
        if (StringUtils.isEmpty(request.getName())) {
            throw new RuntimeException("Invalid Parameter");
        }

        Member savedMember = memberRepository.save(Member.of(request.getName()));

        return MemberDto.CreateMemberResponse.builder()
                .name(savedMember.getName())
                .build();
    }

}
