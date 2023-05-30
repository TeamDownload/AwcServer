package team.awc1.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import team.awc1.member.repository.entity.LogTimeData;

public interface LogTimeDataRepository extends JpaRepository<LogTimeData, Long> {

}
