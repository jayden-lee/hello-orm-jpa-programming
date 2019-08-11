# Spring Data JPA Study Repo
> 인프런 자바 ORM 표준 JPA 프로그래밍 강좌를 학습하고 정리한 내용입니다

## JPA
- Java Persistence API
- 자바 진영의 ORM 표준 기술
- JPA 2.1 표준 명세를 구현한 3가지 구현체 (Hibernate, EclipseLink, DataNucleus)

## ORM
- Object-relational mapping (객체 관계 매핑)
- ORM 프레임워크 역할은 객체와 관계형 데이터베이스 중간에서 매핑
- Java Application -> JPA -> JDBC API -> DB

## JPA 성능 최적화 기능
1. 1차 캐시와 동일성 보장
2. 트랜잭션을 지원하는 쓰기 지연
3. 지연 로딩