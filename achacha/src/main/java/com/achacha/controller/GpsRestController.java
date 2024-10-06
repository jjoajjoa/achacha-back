package com.achacha.controller;

import com.achacha.vo.GpsDataVO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GpsRestController {

    @PostMapping("/gps") // 클라이언트에서 보내는 GPS 데이터의 URL
    public ResponseEntity<Void> receiveGpsData(@RequestBody GpsDataVO gpsData) {
        // gpsData를 사용하여 필요한 처리를 여기에 구현
        // 예: 데이터베이스에 저장하거나 로그 출력
    	System.out.println(gpsData.toString());
        return ResponseEntity.ok().build(); // 성공 응답
    }
    
}
