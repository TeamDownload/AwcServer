package team.awc1.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team.awc1.member.repository.LogTimeDataRepository;
import team.awc1.member.repository.entity.LogTimeData;

@Service
@RequiredArgsConstructor
public class CurrentTimeServiceImpl implements CurrentTimeSerive{

    private final LogTimeDataRepository logTimeDataRepository;

    @Override
    public String currentTime(String executedMethod, String time) {
        LogTimeData logTimeData = LogTimeData.builder()
                .executedMethod(executedMethod)
                .time(time)
                .build();
        logTimeDataRepository.save(logTimeData);
        System.out.println(executedMethod + time);
        return "success";
    }
}
