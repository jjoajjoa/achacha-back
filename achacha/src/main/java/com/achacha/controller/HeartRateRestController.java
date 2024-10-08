package com.achacha.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.achacha.vo.HeartRateDataVO;

@RestController
@RequestMapping("/heartrate")
public class HeartRateRestController {

	
	// 심박수 변화에 따라 전송 받음 ( 데이터 베이스에 들어가는 세팅 해야 합니다  아직 안함 )
    @PostMapping("/heartrate") 
    public ResponseEntity<String> receiveHeartRate(@RequestBody HeartRateDataVO watchData) {
        System.out.println("Received Heart Rate: " + watchData.getHeartRate());
        return ResponseEntity.ok("Data received"); // 200 메세지를 반환( 성공 실패 )
    }
    
    // 완료 누르면 시간 전송      -------------  이 메서드도 운전기록 생성되면 고쳐야 합니다.
    @PostMapping("/drivingtime") 
    public ResponseEntity<String> receiveDrivingTime(@RequestBody HeartRateDataVO watchData) {
        System.out.println("Received Driving Time: " + watchData.getDrivingTime());
        return ResponseEntity.ok("Data received");
    }
	
}
