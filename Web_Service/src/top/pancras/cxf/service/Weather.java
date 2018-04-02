package top.pancras.cxf.service;

import java.util.Date;

public class Weather {
	private int maxTemp;
	private int minTemp;
	private String info;
	private Date date;
	
	public Weather() {
	}
	
	public Weather(int maxTemp, int minTemp, String info, Date date) {
		super();
		this.maxTemp = maxTemp;
		this.minTemp = minTemp;
		this.info = info;
		this.date = date;
	}

	public int getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(int maxTemp) {
		this.maxTemp = maxTemp;
	}

	public int getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(int minTemp) {
		this.minTemp = minTemp;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
