package team.awc1.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.awc1.member.controller.dto.JoinRequest;
import team.awc1.member.service.member.MemberShipService;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequiredArgsConstructor
public class JoinMembershipController {

    private final MemberShipService memberShipService;

    @PostMapping("/join")
    public ResponseEntity<Map<String, String>> join(@RequestBody JoinRequest joinRequest){

        String id = joinRequest.getId();
        String name = joinRequest.getName();
        String passWord = joinRequest.getPassWord();

        String result = memberShipService.join(id, name, passWord);

        Map<String, String> response = new HashMap<>();

        if("success".equalsIgnoreCase(String.valueOf(result))){
            response.put("Membership","success");
            System.out.println("Membership : success");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }else {
            response.put("Membership", "fail");
            System.out.println("Membership : fail");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }



}
