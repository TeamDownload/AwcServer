package team.awc1.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.awc1.member.repository.entity.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, String> {
    // JpaRepository 에 있는 것들이 save, findById 등등 많아서 이것만 extend 해도 된다
    Optional<Member> findById(String id);

    Member findByPassWord(String passWord);

    List<Member> findAll();

}
