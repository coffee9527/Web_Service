package top.pancras.cxf.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
/*
 * 传统客户端
 */
public class WeatherClient {
	public static void main(String[] args) throws MalformedURLException {
		//创建服务视图(注意地址后面要加wsdl，否则会报错)
		URL url = new URL("http://127.0.0.1:12345/weather?wsdl");
		//第一个参数是WeatherInterfaceService类中的targetNamespace值
		QName qName = new QName("http://service.cxf.pancras.top/","WeatherInterfaceService");
		Service service = Service.create(url, qName);
		
		//获得PortType
		WeatherInterface port = service.getPort(WeatherInterface.class);
		//调用服务方法
		List<Weather> list = port.getWeatherByCity("北京");
		
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
