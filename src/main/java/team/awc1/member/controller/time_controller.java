package team.awc1.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class time_controller {

    @GetMapping("/")
    private String home(){
        return "time";
    }

}
