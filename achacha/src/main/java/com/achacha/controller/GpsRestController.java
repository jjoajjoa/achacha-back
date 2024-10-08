package com.achacha.controller;

import com.achacha.dao.GpsDataDAO;
import com.achacha.vo.GpsDataVO;
import com.achacha.vo.UserInfoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/location")
public class GpsRestController {
	
	UserInfoVO user = HeartRateRestController.user;

    @PostMapping("/update")
    public ResponseEntity<?> updateLocation(@RequestBody GpsDataVO vo) {
        System.out.println("Received location - Latitude: " + vo.getGpsLatitude() + ", Longitude: " + vo.getGpsLongitude() + ", time: " + vo.getGpsLogTime());
        System.out.println("                    altitude: " + vo.getGpsAltitude() + ", speed: " + vo.getGpsSpeed() + ", accuracy: " + vo.getGpsAccuracy());
        user.setGpsLongitude(vo.getGpsLongitude());
        user.setGpsAccuracy(vo.getGpsAccuracy());
        user.setGpsAltitude(vo.getGpsAltitude());
        user.setGpsDirection(vo.getGpsDirection());
        user.setGpsLatitude(vo.getGpsLatitude());
        user.setGpsSpeed(vo.getGpsSpeed());
        user.setGpsLogTime(vo.getGpsLogTime());
        return ResponseEntity.ok().build();
    }
    
}
