package top.pancras.webservice.client;

public class WeatherClient {
	public static void main(String[] args) {
		//创建服务视图
		WeatherInterfaceImplService service = new WeatherInterfaceImplService();
		//从服务视图中获取PortType对象
		WeatherInterfaceImpl protType = service.getWeatherInterfaceImplPort();
		//调用服务端方法
		String weatherInfo = protType.getWeatherByCity("北京");
		System.out.println(weatherInfo);
	}
}
