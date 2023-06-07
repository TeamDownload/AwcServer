package team.awc1.member.service.login;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team.awc1.member.repository.MemberRepository;
import team.awc1.member.repository.entity.Member;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class LoginServiceImpl implements LoginService {

    private final MemberRepository memberRepository;

    @Override
    public String login(String id, String passWord) {

        Optional<Member> loginId = memberRepository.findById(id);

        if (loginId.isPresent()) {
            // Check if password is correct
            if (loginId.get().getPassWord().equals(passWord)) {
                System.out.println("login success");
                return "success";
            } else {
                System.out.println("password fail");
                return "fail - incorrect password";
            }
        } else {
            System.out.println("id fail");
            return "fail - ID does not exist";
        }
    }
}