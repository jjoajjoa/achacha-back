package com.achacha.vo;

public class GpsDataVO {
	private int gpsId; // GPSpk
	private Integer driveLogId; // 운행기록pk
	private String gpsLogTime; // 기록시각
	private double gpsLatitude; // 위도
	private double gpsLongitude; // 경도
	private double gpsAltitude; // 고도
	private double gpsSpeed; // 속도
	private double gpsAccuracy; // 정확도
	private double gpsDirection; // 방향

	public GpsDataVO(int gpsId, Integer driveLogId, String gpsLogTime, double gpsLatitude, double gpsLongitude,
			double gpsAltitude, double gpsSpeed, double gpsAccuracy, double gpsDirection) {
		super();
		this.gpsId = gpsId;
		this.driveLogId = driveLogId;
		this.gpsLogTime = gpsLogTime;
		this.gpsLatitude = gpsLatitude;
		this.gpsLongitude = gpsLongitude;
		this.gpsAltitude = gpsAltitude;
		this.gpsSpeed = gpsSpeed;
		this.gpsAccuracy = gpsAccuracy;
		this.gpsDirection = gpsDirection;
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

	public double getGpsLatitude() {
		return gpsLatitude;
	}

	public void setGpsLatitude(double gpsLatitude) {
		this.gpsLatitude = gpsLatitude;
	}

	public double getGpsLongitude() {
		return gpsLongitude;
	}

	public void setGpsLongitude(double gpsLongitude) {
		this.gpsLongitude = gpsLongitude;
	}

	public double getGpsAltitude() {
		return gpsAltitude;
	}

	public void setGpsAltitude(double gpsAltitude) {
		this.gpsAltitude = gpsAltitude;
	}

	public double getGpsSpeed() {
		return gpsSpeed;
	}

	public void setGpsSpeed(double gpsSpeed) {
		this.gpsSpeed = gpsSpeed;
	}

	public double getGpsAccuracy() {
		return gpsAccuracy;
	}

	public void setGpsAccuracy(double gpsAccuracy) {
		this.gpsAccuracy = gpsAccuracy;
	}

	public double getGpsDirection() {
		return gpsDirection;
	}

	public void setGpsDirection(double gpsDirection) {
		this.gpsDirection = gpsDirection;
	}

	@Override
	public String toString() {
		return "GpsDataVO [gpsId=" + gpsId + ", driveLogId=" + driveLogId + ", gpsLogTime=" + gpsLogTime
				+ ", gpsLatitude=" + gpsLatitude + ", gpsLongitude=" + gpsLongitude + ", gpsAltitude=" + gpsAltitude
				+ ", gpsSpeed=" + gpsSpeed + ", gpsAccuracy=" + gpsAccuracy + ", gpsDirection=" + gpsDirection + "]";
	}

}
