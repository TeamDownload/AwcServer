package team.awc1.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.awc1.member.controller.dto.ArduinoDataRequest;
import team.awc1.member.controller.dto.JoinRequest;


@RestController
public class ArduinoDataController {

    @GetMapping("/arduinoPush123")
    public JoinRequest test(){
        JoinRequest joinREquest = new JoinRequest();
        joinREquest.setId("test");
        joinREquest.setName("pass");

        return joinREquest;
    }

    @PostMapping("/arduinoPull123")
    public String mapRequest(@RequestBody ArduinoDataRequest param){
        System.out.println(param.toString());
        return param.toString();
    }
}
