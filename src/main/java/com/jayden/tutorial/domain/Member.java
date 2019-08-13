package com.jayden.tutorial.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    protected Member() {

    }

    public static Member of(String name) {
        Member member = new Member();
        member.name = name;
        return member;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
