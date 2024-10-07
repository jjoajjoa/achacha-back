package com.achacha.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GpsDataVO {
	private int gpsId;
	private Integer driveLogId;

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

	public GpsDataVO(int gpsId, Integer driveLogId, String gpsLogTime, Double gpsLatitude, Double gpsLongitude,
			Double gpsAltitude, Double gpsSpeed, Double gpsAccuracy) {
		super();
		this.gpsId = gpsId;
		this.driveLogId = driveLogId;
		this.gpsLogTime = gpsLogTime;
		this.gpsLatitude = gpsLatitude;
		this.gpsLongitude = gpsLongitude;
		this.gpsAltitude = gpsAltitude;
		this.gpsSpeed = gpsSpeed;
		this.gpsAccuracy = gpsAccuracy;
	}

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

	public String getGpsLogTime() {
		return gpsLogTime;
	}

	public void setGpsLogTime(String gpsLogTime) {
		this.gpsLogTime = gpsLogTime;
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

	public String getGpsDirection() {
		return gpsDirection;
	}

	public void setGpsDirection(String gpsDirection) {
		this.gpsDirection = gpsDirection;
	}

	@Override
	public String toString() {
		return "GpsDataVO [gpsId=" + gpsId + ", driveLogId=" + driveLogId + ", gpsLogTime=" + gpsLogTime
				+ ", gpsLatitude=" + gpsLatitude + ", gpsLongitude=" + gpsLongitude + ", gpsAltitude=" + gpsAltitude
				+ ", gpsSpeed=" + gpsSpeed + ", gpsAccuracy=" + gpsAccuracy + "]";
	}

}
