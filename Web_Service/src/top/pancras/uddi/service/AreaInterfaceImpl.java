package top.pancras.uddi.service;

import java.util.List;

import javax.jws.WebService;

@WebService
public class AreaInterfaceImpl implements AreaInterface {

	@Override
	public List<Area> getAreaList(String parentId, int page, int rows) {
		AreaDao areaDao = new AreaDao();
		List<Area> areaList = areaDao.getAreaList(parentId, page, rows);
		return areaList;
	}

}
