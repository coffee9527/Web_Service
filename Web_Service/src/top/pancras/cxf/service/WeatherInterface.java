package top.pancras.cxf.service;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface WeatherInterface {
	public List<Weather> getWeatherByCity(String city);
}
