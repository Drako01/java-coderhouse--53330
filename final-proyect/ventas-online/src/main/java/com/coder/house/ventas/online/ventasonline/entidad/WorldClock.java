package com.coder.house.ventas.online.ventasonline.entidad;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorldClock {

	//private String $id;
	private String currentDateTime;
	private String utcOffset;
	private Boolean isDayLightSavingsTime;
	private String dayOfTheWeek;
	private String timeZoneName;
	private Long currentFileTime;
	private String ordinalDate;
	private String serviceResponse;
	public String getCurrentDateTime() {
		return currentDateTime;
	}
	public void setCurrentDateTime(String currentDateTime) {
		this.currentDateTime = currentDateTime;
	}
	public String getUtcOffset() {
		return utcOffset;
	}
	public void setUtcOffset(String utcOffset) {
		this.utcOffset = utcOffset;
	}
	public Boolean getIsDayLightSavingsTime() {
		return isDayLightSavingsTime;
	}
	public void setIsDayLightSavingsTime(Boolean isDayLightSavingsTime) {
		this.isDayLightSavingsTime = isDayLightSavingsTime;
	}
	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}
	public void setDayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}
	public String getTimeZoneName() {
		return timeZoneName;
	}
	public void setTimeZoneName(String timeZoneName) {
		this.timeZoneName = timeZoneName;
	}
	public Long getCurrentFileTime() {
		return currentFileTime;
	}
	public void setCurrentFileTime(Long currentFileTime) {
		this.currentFileTime = currentFileTime;
	}
	public String getOrdinalDate() {
		return ordinalDate;
	}
	public void setOrdinalDate(String ordinalDate) {
		this.ordinalDate = ordinalDate;
	}
	public String getServiceResponse() {
		return serviceResponse;
	}
	public void setServiceResponse(String serviceResponse) {
		this.serviceResponse = serviceResponse;
	}
	
	
}
