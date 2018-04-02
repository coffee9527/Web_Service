package top.pancras.uddi.service;

public class Area {
	private String AreaCode;
	private String AreaFullName;
	private String AreaLevel;
	private String AreaName;
	private String ParentId;
	private String shortName;
	
	public Area() {

	}
	
	public Area(String areaCode, String areaFullName, String areaLevel, String areaName, String parentId,
			String shortName) {
		super();
		AreaCode = areaCode;
		AreaFullName = areaFullName;
		AreaLevel = areaLevel;
		AreaName = areaName;
		ParentId = parentId;
		this.shortName = shortName;
	}
	public String getAreaCode() {
		return AreaCode;
	}
	public void setAreaCode(String areaCode) {
		AreaCode = areaCode;
	}
	public String getAreaFullName() {
		return AreaFullName;
	}
	public void setAreaFullName(String areaFullName) {
		AreaFullName = areaFullName;
	}
	public String getAreaLevel() {
		return AreaLevel;
	}
	public void setAreaLevel(String areaLevel) {
		AreaLevel = areaLevel;
	}
	public String getAreaName() {
		return AreaName;
	}
	public void setAreaName(String areaName) {
		AreaName = areaName;
	}
	public String getParentId() {
		return ParentId;
	}
	public void setParentId(String parentId) {
		ParentId = parentId;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	
}
