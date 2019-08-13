package com.jayden.tutorial.domain.member.infra;

import com.jayden.tutorial.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
