package team.awc1.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team.awc1.member.repository.MemberRepository;
import team.awc1.member.repository.entity.Member;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberSerive{

    private final MemberRepository memberRepository;

    @Override
    public String join(String id, String name, String passWord) {
        Member member = Member.builder()
                .id(id)
                .name(name)
                .passWord(passWord)
                .build();
        memberRepository.save(member);
        return "success";
    }
}
