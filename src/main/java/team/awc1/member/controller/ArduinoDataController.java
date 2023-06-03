package team.awc1.member.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.awc1.member.controller.dto.ArduinoDataRequest;


@RestController
public class ArduinoDataController {

    @PostMapping("/arduinopush")
    public String mapRequest(@RequestBody ArduinoDataRequest param){
        System.out.println(param.toString());
        return param.toString();
    }
}
