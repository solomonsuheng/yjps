package DBConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Demo.DBTest;
import VO.News;

public class MySQLDBConn {
	// 返回的数据集合
	public ResultSet rs = null;
	// 执行SQL语句
	public Statement st = null;

	// 无参数构造函数
	public MySQLDBConn() {
		// 当类声明对象后初始化数据库参数
		this.initDB();
	}

	// 初始化数据库配置
	public void initDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/yjps", "root", "");
			st = con.createStatement();//
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 测试函数
	public static void main(String[] args) throws SQLException {
		DBTest conn = new DBTest();
		conn.initDB();
		System.out.println(conn.st);
		String sql = "select * from news;";
		ResultSet rs = conn.st.executeQuery(sql);
		long currentTime = System.currentTimeMillis();

		List<News> newsList = new ArrayList<News>();

		System.out.println(currentTime);
		if (rs.next()) {
			String nid = rs.getString("nid");
			String ntitle = rs.getString("ntitle");
			String ndate = rs.getString("ndate");
			String ncontent = rs.getString("ncontent");
			String ntype = rs.getString("ntype");
			String npublish = rs.getString("npublish");
			newsList.add(new News(nid, ntitle, ndate, ncontent, ntype, npublish));
		}
		System.out.println(newsList.get(0).toString());
	}
}
