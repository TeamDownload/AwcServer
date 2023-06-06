package team.awc1.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.awc1.member.repository.entity.DeviceRegistrationData;



public interface DeviceRegistrationDataRepository extends JpaRepository<DeviceRegistrationData, Long> {

}
