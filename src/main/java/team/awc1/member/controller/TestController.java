package team.awc1.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.awc1.member.controller.dto.JoinRequest;

import java.util.HashMap;
import java.util.Map;


// 테스트 컨트롤러
@RestController
public class TestController {

    @GetMapping("/")
    private String home(){
        return "time";
    }

    @GetMapping ("/test")
    public JoinRequest test(){
        JoinRequest joinREquest = new JoinRequest();
        joinREquest.setId("test");
        joinREquest.setName("pass");

        return joinREquest;
    }

    @PostMapping("/posttest")
    public String mapRequest(@RequestBody HashMap<String, Object> param){
        Map<String, String> response = new HashMap<>();
//        response.put(String)
        // json 으로 데이터 받기
        System.out.println(param.toString());
        return param.toString();
    }
}
