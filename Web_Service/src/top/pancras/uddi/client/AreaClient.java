package top.pancras.uddi.client;

import java.util.List;

public class AreaClient {
	public static void main(String[] args) {
		//创建服务视图
		AreaInterfaceImplService service = new AreaInterfaceImplService();
		//从服务视图获取PortType
		AreaInterfaceImpl port = service.getAreaInterfaceImplPort();
		List<Area> list = port.getAreaList("1.1", 1, 5);
		for(Area area : list) {
			System.out.println(area.getAreaName());
		}
	}
}
