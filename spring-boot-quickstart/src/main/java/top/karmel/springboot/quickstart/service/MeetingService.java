package top.karmel.springboot.quickstart.service;

import org.springframework.stereotype.Service;
import top.karmel.springboot.quickstart.entity.Meeting;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MeetingService
 * @Description TODO
 * @Author BC
 * @Date 2024/9/2 16:29
 * @Version 1.0
 */
@Service
public class MeetingService {

    private final List<Meeting> meetings = new ArrayList<>();

    public boolean isRoomAvailable(Meeting newMeeting) {
        return meetings.stream()
                .noneMatch(exitingMeeting -> exitingMeeting.isOverlapping(newMeeting));
    }

    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }
}
