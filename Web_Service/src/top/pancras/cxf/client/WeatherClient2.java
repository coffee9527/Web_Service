package top.pancras.cxf.client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class WeatherClient2 {
	public static void main(String[] args) throws Exception {
		//1.创建一个JaxWsProxyFactoryBean对象
		JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
		//2.设置要给PortType的class
		factoryBean.setServiceClass(WeatherInterface.class);
		//3.设置一个address，服务端的url包括ip及端口
		factoryBean.setAddress("http://127.0.0.1:12345/weather?wsdl");
		//4.调用create方法生成PortType代理对象。
		WeatherInterface protType = (WeatherInterface)factoryBean.create();
		//5.调用服务端方法
		List<Weather> list = protType.getWeatherByCity("上海");
		
		for(Weather weather : list) {
			Date time = weather.getDate().toGregorianCalendar().getTime();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String date = sdf.format(time);
			System.out.println("日期：" + date);
			System.out.println("最高温度：" + weather.getMaxTemp());
			System.out.println("最低温度：" + weather.getMinTemp());
			System.out.println("天气信息：" + weather.getInfo());
			System.out.println("===============================");
		}
		
	}
}	
