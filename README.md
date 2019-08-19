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

## 영속성 컨텍스트
- 엔티티를 영구 저장하는 환경
- 엔티티 매니저를 통해서 영속성 컨텍스트에 접근

```java
EntityManager.persist(entity);
```

## 엔티티 생명주기
비영속(new/transient) : 영속성 컨텍스트와 전혀 관계가 없는 새로운 상태
영속(managed) : 영속성 컨텍스트에 관리되는 상태
준영속(detached) : 영속성 컨텍스트에 저장되어 있다가 분리된 상태
삭제(removed) : 삭제된 상태

## 영속성 컨텍스트 이점
1. 1차 캐시
2. 동일성 보장
3. 트랜잭션을 지원하는 쓰기 지연
4. 변경 감지
5. 지연 로딩

## 플러시
- 영속 컨텍스트의 변경 내용을 데이터베이스에 반영한다. (동기화)
- 트랜잭션이 커밋되면 자동으로 플러시가 발생한다.

### 직접 호출

```java
em.flush()
```

### 트랜잭션 커밋
플러시 자동으로 호출

```java
em.commit
```

### JPQL 쿼리 실행
플러시 자동 호출

## 엔티티 매핑
1. 객체와 테이블 매핑 : @Entity, @Table
2. 필드와 컬럼 매핑 : @Column
3. 기본 키 매핑 : @Id
4. 연관관계 매핑 : @ManyToOne, @JoinColumn

## 데이터베이스 스키마 자동 생성
- create : 기존 테이블 삭제 후 다시 생성
- create-drop : create와 같으나 종료 시점에 테이블 삭제
- update : 변경 부분만 반영 (새로운 컬럼을 추가하는 것만 가능)
- validate : 엔티티와 테이블이 정상 매핑되었는지만 체크
- none : 사용하지 않음
 
```
spring.jpa.hibernate.ddl-auto
```