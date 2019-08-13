package com.jayden.tutorial.controller;

import com.jayden.tutorial.domain.MemberDto;
import com.jayden.tutorial.domain.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "Member API")
@RestController
@RequestMapping("api/v1/member")
public class MemberController {

    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @ApiOperation(value = "멤버 저장")
    @PostMapping
    public MemberDto.CreateMemberResponse createMember(@RequestBody MemberDto.CreateMemberRequest request) {
        return memberService.createMember(request);
    }

}
