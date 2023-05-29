package team.awc1.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import team.awc1.member.controller.dto.JoinRequest;
import team.awc1.member.service.LoginService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody JoinRequest joinRequest){

        String id = joinRequest.getId();
        String passWord = joinRequest.getPassWord();

        String result = loginService.login(id,passWord);

        Map<String, String> response = new HashMap<>();

        if("success".equalsIgnoreCase(String.valueOf(result))){
            response.put("login","success");
            System.out.println("login : success");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }else {
            response.put("login", "fail");
            System.out.println("login : fail");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}
