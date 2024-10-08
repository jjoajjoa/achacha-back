package com.achacha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeartRateDataVO {
	
	int heartRateId; // 심박수 id
	int employeeId; // 사용자 id
	int driveLogId; // 운행기록 id
	
	@JsonProperty("heartrate") 
	int heartRate; // 심박수
	
	@JsonProperty("heartratelogtime")
	String heartRateLogTime; // 심박수 시간
	
	
	// 운행 시간 -----  테스트입니다 - 운행 vo 가 생성 되면 이동해야 되는 항목 입니다.
	String drivingTime;
	public String getDrivingTime() {
		return drivingTime;
	}
	public void setDrivingTime(String drivingTime) {
		this.drivingTime = drivingTime;
	}
	// 여기 까지 이동해야 하는 항목 입니다.



	@Override
	public String toString() {
		return "HeartRateDataVO [heartRateId=" + heartRateId + ", employeeId=" + employeeId + ", driveLogId="
				+ driveLogId + ", heartRate=" + heartRate + ", heartRateLogTime=" + heartRateLogTime + "]";
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
	
	public int getDriveLogId() {
		return driveLogId;
	}
	
	public void setDriveLogId(int driveLogId) {
		this.driveLogId = driveLogId;
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
	
}
