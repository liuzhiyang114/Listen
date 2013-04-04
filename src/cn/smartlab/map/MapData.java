package cn.smartlab.map;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.smartlab.mobileserver.tool.JSONArray;
import com.smartlab.mobileserver.tool.JSONObject;

import cn.smartlab.dao.DBMSDao;
import cn.smartlab.json.JsonToArray;

public class MapData {

	/*
	 * 将数据库的数据库封装到map集合, 以便DataBaseServer调用
	 */

	List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();

	// 测试sql语句
	// String sql =
	// "select parkno,pname,lat,lon,pamount,restamount,pinfo from parkinfo";

	//String sql = "select cityname,street,status,cardno from parkinfo a,carinfo b,cardinfo c where b.carid=c.cardid";

	@Test
	public List jsonToArray(String sql) throws SQLException, ClassNotFoundException, Exception,
			IOException {

		ResultSet rs = new DBMSDao().query(sql);

		// 处理查询结果（将查询结果转换成List<Map>格式）
		ResultSetMetaData rsmd = rs.getMetaData();
		int num = rsmd.getColumnCount();

		while (rs.next()) {
			Map map = new LinkedHashMap();
			for (int i = 0; i < num; i++) {
				String columnName = rsmd.getColumnName(i + 1);
				map.put(columnName, rs.getString(columnName));
			}
			resultList.add(map);
		}

		return resultList;
		
		/*// 取出模拟数据List<Map>的值
		for (Object obj : resultList) {

			System.out.println(obj.toString());

		}
		
		System.out.println("---------------------------------------------");
		JSONArray json =  new JSONArray(resultList);
		System.out.println(json);*/
	}

}
