package com.jayden.tutorial.domain.member.entity;

import com.jayden.tutorial.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
