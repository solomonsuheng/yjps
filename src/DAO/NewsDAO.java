package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DBConn.MySQLDBConn;
import VO.News;

/**
 * @author mac
 *
 */
public class NewsDAO {

	private MySQLDBConn conn = null;

	public NewsDAO() {
		// 初始化数据库连接
		this.conn = new MySQLDBConn();
	}

	// 获取所有信息
	public List<News> getAllNews() throws SQLException {
		List<News> list = new ArrayList<News>();
		String sql = "select * from news;";
		this.conn.rs = this.conn.st.executeQuery(sql);
		while (this.conn.rs.next()) {
			String nid = this.conn.rs.getString("nid");
			String ntitle = this.conn.rs.getString("ntitle");
			String ndate = this.conn.rs.getString("ndate");
			String ncontent = this.conn.rs.getString("ncontent");
			String ntype = this.conn.rs.getString("ntype");
			String npublisher = this.conn.rs.getString("npublish");
			list.add(new News(nid, ntitle, ndate, ncontent, ntype, npublisher));
		}
		this.conn.rs.close();
		return list;
	}

	// 发布新闻
	public boolean postNews(String title, String content, int type) {
		boolean flag = false;
		long date = System.currentTimeMillis();
		String sql = "insert into news (ntitle,ndate,ncontent,ntype,npublish) values('"
				+ title
				+ "','"
				+ date
				+ "','"
				+ content
				+ "',"
				+ type
				+ ",'admin');";

		try {
			if (this.conn.st.executeUpdate(sql) > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	// 1为新闻，2为市场动态
	// 根据类型获取所有新闻
	public List<News> getNews(int type) throws SQLException {
		List<News> list = new ArrayList<News>();
		String sql = "select * from news where ntype='" + type + "';";
		this.conn.rs = this.conn.st.executeQuery(sql);
		while (this.conn.rs.next()) {
			String nid = this.conn.rs.getString("nid");
			String ntitle = this.conn.rs.getString("ntitle");
			String ndate = this.conn.rs.getString("ndate");
			String ncontent = this.conn.rs.getString("ncontent");
			String ntype = this.conn.rs.getString("ntype");
			String npublisher = this.conn.rs.getString("npublish");
			list.add(new News(nid, ntitle, ndate, ncontent, ntype, npublisher));
		}
		this.conn.rs.close();
		return list;
	}

	public boolean isDestroy() throws SQLException {
		boolean flag = false;
		this.conn.st.close();
		this.conn.rs.close();
		return flag;
	}

	public static void main(String[] args) throws SQLException {
		NewsDAO dao = new NewsDAO();
		System.out.println(dao.postNews("uu", "ok", 2));
	}
}
