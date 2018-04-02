package top.pancras.uddi.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AreaDao {
	public List<Area> getAreaList(String parentId,int page,int rows) {
		
		//JDBC查询数据库
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Area> list = new ArrayList<Area>();
		
		try {
			//加载数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			//创建一个连接,此处要根据自己的数据库环境进行配置
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webservice", "root", "root");
			//创建Preparement
			String sql = "SELECT * FROM area WHERE PARENTID=? LIMIT ?,?";
			ps.getConnection().prepareStatement(sql);
			ps.setString(1, parentId);
			ps.setInt(2, (page-1)*rows);
			ps.setInt(3, rows);
			//执行查询
			rs = ps.executeQuery();
			//取查询结果
			while(rs.next()) {
				Area a = new Area();
				a.setAreaCode(rs.getString("AREACODE"));
				a.setAreaFullName(rs.getString("AREAFULLNAME"));
				a.setAreaLevel(rs.getString("AREALEVEL"));
				a.setAreaName(rs.getString("AREANAME"));
				a.setParentId(rs.getString("PARENTID"));
				a.setShortName(rs.getString("SHORTNAME"));
				list.add(a);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps != null) {
				try {
					ps.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		return list;
	}
}
