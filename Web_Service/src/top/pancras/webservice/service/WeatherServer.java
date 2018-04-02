package top.pancras.webservice.service;

import javax.xml.ws.Endpoint;

public class WeatherServer {
	public static void main(String[] args) {
		//1.第一个参数：服务发布URL
		//2.第二个参数：SEI实现类对象
		String address = "http://127.0.0.1:12345/weather";
		WeatherInterfaceImpl impl = new WeatherInterfaceImpl();
		Endpoint.publish(address, impl);
	}
}
