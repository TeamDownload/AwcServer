package team.awc1.member.service.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team.awc1.member.repository.MemberRepository;
import team.awc1.member.repository.entity.Member;
import team.awc1.member.service.member.MemberShipSerive;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberShipServiceImpl implements MemberShipSerive {

    private final MemberRepository memberRepository;

    @Override
    public String join(String id, String name, String passWord) {

        Optional<Member> existingMember = Optional.ofNullable(memberRepository.findById(id));
        // MemberRepository 에서 findById로 아이디를 다 찾는다
        if(existingMember.isPresent()) {
            // MemberRepository 에서 아이디가 존재 한다면 리턴을 해준다.
            return "ID already exists";
        }

        Member member = Member.builder()
                // 빌더 패턴
                .id(id)
                .name(name)
                .passWord(passWord)
                .build();
        memberRepository.save(member);
        System.out.println(id + name);
        return "success";
    }
}
