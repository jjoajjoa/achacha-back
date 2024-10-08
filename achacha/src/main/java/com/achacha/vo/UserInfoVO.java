package com.achacha.vo;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

// 심박수 정보와 GPS 정보가 합쳐진 VO
@Component
public class UserInfoVO {
	
	
	private int gpsId;
	private Integer driveLogId;
	private int heartRateId; // 심박수 id
	private int employeeId; // 사용자 id

	String drivingTime; // 운전기록 테이블에 추가되어야하는 항목

	@JsonProperty("latitude")
	private Double gpsLatitude; // 위도

	@JsonProperty("longitude")
	private Double gpsLongitude; // 경도

	@JsonProperty("altitude")
	private Double gpsAltitude; // 고도

	@JsonProperty("speed")
	private Double gpsSpeed; // 속도

	@JsonProperty("accuracy")
	private Double gpsAccuracy; // 정확도

	@JsonProperty("time")
	private String gpsLogTime; // 시간

	@JsonProperty("direction")
	private String gpsDirection; // 방향

	@JsonProperty("heartrate")
	private int heartRate; // 심박수

	@JsonProperty("heartratelogtime")
	private String heartRateLogTime; // 심박수 시간

	public int getGpsId() {
		return gpsId;
	}

	public void setGpsId(int gpsId) {
		this.gpsId = gpsId;
	}

	public Integer getDriveLogId() {
		return driveLogId;
	}

	public void setDriveLogId(Integer driveLogId) {
		this.driveLogId = driveLogId;
	}

	public int getHeartRateId() {
		return heartRateId;
	}

	public void setHeartRateId(int heartRateId) {
		this.heartRateId = heartRateId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDrivingTime() {
		return drivingTime;
	}

	public void setDrivingTime(String drivingTime) {
		this.drivingTime = drivingTime;
	}

	public Double getGpsLatitude() {
		return gpsLatitude;
	}

	public void setGpsLatitude(Double gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
	}

	public Double getGpsLongitude() {
		return gpsLongitude;
	}

	public void setGpsLongitude(Double gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}

	public Double getGpsAltitude() {
		return gpsAltitude;
	}

	public void setGpsAltitude(Double gpsAltitude) {
		this.gpsAltitude = gpsAltitude;
	}

	public Double getGpsSpeed() {
		return gpsSpeed;
	}

	public void setGpsSpeed(Double gpsSpeed) {
		this.gpsSpeed = gpsSpeed;
	}

	public Double getGpsAccuracy() {
		return gpsAccuracy;
	}

	public void setGpsAccuracy(Double gpsAccuracy) {
		this.gpsAccuracy = gpsAccuracy;
	}

	public String getGpsLogTime() {
		return gpsLogTime;
	}

	public void setGpsLogTime(String gpsLogTime) {
		this.gpsLogTime = gpsLogTime;
	}

	public String getGpsDirection() {
		return gpsDirection;
	}

	public void setGpsDirection(String gpsDirection) {
		this.gpsDirection = gpsDirection;
	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	public String getHeartRateLogTime() {
		return heartRateLogTime;
	}

	public void setHeartRateLogTime(String heartRateLogTime) {
		this.heartRateLogTime = heartRateLogTime;
	}

	@Override
	public String toString() {
		return "UserInfoVO [gpsId=" + gpsId + ", driveLogId=" + driveLogId + ", heartRateId=" + heartRateId
				+ ", employeeId=" + employeeId + ", drivingTime=" + drivingTime + ", gpsLatitude=" + gpsLatitude
				+ ", gpsLongitude=" + gpsLongitude + ", gpsAltitude=" + gpsAltitude + ", gpsSpeed=" + gpsSpeed
				+ ", gpsAccuracy=" + gpsAccuracy + ", gpsLogTime=" + gpsLogTime + ", gpsDirection=" + gpsDirection
				+ ", heartRate=" + heartRate + ", heartRateLogTime=" + heartRateLogTime + "]";
	}

}
