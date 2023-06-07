package team.awc1.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.awc1.member.controller.dto.ArduinoDataRequest;

import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequiredArgsConstructor
public class ArduinoDataControllerTest {
    private ConcurrentHashMap<String, ArduinoDataRequest> storage = new ConcurrentHashMap<>();

    @PostMapping("/arduinoPull")
    public ArduinoDataRequest postData(@RequestBody ArduinoDataRequest param){
        System.out.println(param.toString());
        storage.put("latest", param);
        return param;
    }

    @GetMapping("/arduinoPush")
    public ArduinoDataRequest getData() {
        return storage.getOrDefault("latest", new ArduinoDataRequest());
    }
}


