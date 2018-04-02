package top.pancras.uddi.service;

import java.util.List;

public interface AreaInterface {
	List<Area> getAreaList(String parentId,int page,int rows);
}
