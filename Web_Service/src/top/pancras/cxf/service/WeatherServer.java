package top.pancras.cxf.service;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
/*
 * 使用CXF发布jax-ws规范的WebService
 */
public class WeatherServer {
	public static void main(String[] args) {
		//1.创建JaxWsClientFactoryBean
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		//2.设置SEI接口
		factoryBean.setServiceClass(WeatherInterface.class);
		//3.设置SEI实现类对象
		factoryBean.setServiceBean(new WeatherInterfaceImpl());
		//4.设置服务器发布地址
		factoryBean.setAddress("http://127.0.0.1:12345/weather");
		//5.发布服务
		factoryBean.create();
	}
}
