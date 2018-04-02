package top.pancras.uddi.service;

import javax.xml.ws.Endpoint;

/**
 * 区域查询服务发布
 * @author pancras
 *
 */
public class AreaServer {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:12345/area", new AreaInterfaceImpl());
	}
}
