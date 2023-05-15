package team.awc1.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.awc1.member.repository.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // JpaRepository 에 있는 것들이 save, findById 등등 많아서 이것만 extend 해도 된다
}
