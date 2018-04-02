package top.pancras.cxf.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class WeatherInterfaceImpl implements WeatherInterface {

	@Override
	public List<Weather> getWeatherByCity(String city) {
		
		return getWeatherInfo(city);
	}
	
	private List<Weather> getWeatherInfo(String city) {
		//生成三天的天气信息
		List<Weather> list = new ArrayList<Weather>();
		
		Calendar c = Calendar.getInstance();
		Date d1 = c.getTime();
		c.set(Calendar.DATE, c.get(Calendar.DATE)+1);
		Date d2 = c.getTime();
		c.set(Calendar.DATE, c.get(Calendar.DATE)+1);
		Date d3 = c.getTime();
		
		list.add(new Weather(30,20,city + ":今天很热",d1));
		list.add(new Weather(31,21,city + ":今天小雨",d2));
		list.add(new Weather(32,22,city + ":今天大雨",d3));
		
		return list;
	}
}
