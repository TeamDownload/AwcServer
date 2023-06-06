package team.awc1.member.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import team.awc1.member.controller.dto.DeviceAddRequest;
import team.awc1.member.service.device.DeviceService;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class DeviceAddController {

    private final DeviceService deviceService;

    @PostMapping("/deviceAdd")
    public ResponseEntity<Map<String, String>> deviceAdd(@RequestBody DeviceAddRequest deviceAddRequest) {

        String deviceName = deviceAddRequest.getDeviceName();
        String id = deviceAddRequest.getId();


        String result = deviceService.deviceAdd(deviceName,id);

        Map<String, String> response = new HashMap<>();

        if ("success".equalsIgnoreCase(String.valueOf(result))) {
            response.put("DeviceAdd", "success");
            System.out.println("Device Add : success");
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } else {
            response.put("DeviceAdd", "fail");
            System.out.println("Device Add : fail");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}