package team.awc1.member.service.device;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team.awc1.member.repository.DeviceRegistrationDataRepository;
import team.awc1.member.repository.MemberRepository;
import team.awc1.member.repository.entity.DeviceRegistrationData;
import team.awc1.member.repository.entity.Member;


@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService{

    private final DeviceRegistrationDataRepository deviceRegistrationDataRepository;
    private final MemberRepository memberRepository;

    @Override
    public String deviceAdd(String deviceName, String id) {

        Member member = memberRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found"));

        DeviceRegistrationData deviceRegistrationData1 = DeviceRegistrationData.builder()
                .deviceName(deviceName)
                .member(member)
                .build();
        deviceRegistrationDataRepository.save(deviceRegistrationData1);
        System.out.println("deviceName : " + deviceName + "id : " + id);
        return "success";
    }
}
