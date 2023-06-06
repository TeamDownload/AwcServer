package team.awc1.member.repository.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter
public class DeviceRegistrationData {

    @Id
    @Column(name = "DeviceName")
    private String deviceName;


    @ManyToOne
    @JoinColumn(name = "UserId")
    private Member member;
    // 일대다 에서 다를 맡고 있는 외래키 유저 아이디
}
