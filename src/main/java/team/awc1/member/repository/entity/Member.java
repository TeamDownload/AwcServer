package team.awc1.member.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
// Entity 는 간단하게는 테이블 설계를 한다, User 클레스에 필드 변수들로 컬럼을 구성한다.
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class Member {

    @Id // 데이터베이스 테이블의 PK와 객체 필드를 매핑시켜주는 어노테니션 JPA
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @GeneratedValue 기본 키를 자동 생성해주는 어노테이션
    // strategy = GenerationType.IDENTITY
    // IDENTITY 전략은 기본키 생성은 데이터베이스에 위임
    
    // 디비에 생성됨  class 이름으로 테이블 생성됨
    private Long index;

    private String id;

    private String name;

    private String passWord;
}
