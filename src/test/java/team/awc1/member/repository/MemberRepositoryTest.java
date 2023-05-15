package team.awc1.member.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.awc1.member.repository.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;
    // @Autowired 로 MemberRepository를 끌고와서 memberRepository로 지정해서 사용
    @Test
    public void crudTest(){
        Member member = Member.builder()
                .id("nyg159")
                .name("노원진")
                .passWord("1234")
                .build();

        // creat Test
        memberRepository.save(member);

        // get test
        Member foundMember = memberRepository.findById(1L).get();

    }
    
}
