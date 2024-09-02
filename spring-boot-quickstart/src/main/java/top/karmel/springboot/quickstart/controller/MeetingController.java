package top.karmel.springboot.quickstart.controller;

import jakarta.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.karmel.springboot.quickstart.entity.Meeting;
import top.karmel.springboot.quickstart.service.MeetingService;

/**
 * @ClassName MeetingController
 * @Description TODO
 * @Author BC
 * @Date 2024/9/2 16:34
 * @Version 1.0
 */
@RestController
@RequestMapping("/meeting")
public class MeetingController {

    @Resource
    private MeetingService meetingService;

    @PostMapping("/check")
    public ResponseEntity<String> check(@RequestBody Meeting meeting) {
        if (meetingService.isRoomAvailable(meeting)) {
            meetingService.addMeeting(meeting);
            return ResponseEntity.ok("会议室可用！");
        } else {
            return ResponseEntity.ok("会议室已被占用！");
        }
    }
}
