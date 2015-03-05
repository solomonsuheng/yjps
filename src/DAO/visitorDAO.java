package DAO;

import java.sql.SQLException;

import DBConn.MySQLDBConn;

/**
 * @author mac
 *
 */
public class visitorDAO {
	private MySQLDBConn conn = null;

	public visitorDAO() {
		this.conn = new MySQLDBConn();
	}

	public static void main(String[] args) {
		visitorDAO dao = new visitorDAO();
		System.out.println(dao.saveUser("gesu", "admin"));
	}

	public boolean saveUser(String uname, String upwd) {
		boolean flag = false;

		if (isUserExist(uname, upwd)) {
			// 用户存在不能进行注册
			return false;
		}

		String sql = "insert into user (uname,upwd) values('" + uname + "','"
				+ upwd + "');";
		try {
			this.conn.st.executeUpdate(sql);
			flag = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	public boolean isUserExist(String uname, String upwd) {
		boolean flag = true;
		String sql = "select * from user where uname='" + uname + "' and "
				+ "upwd='" + upwd + "'";

		try {
			this.conn.rs = this.conn.st.executeQuery(sql);
			if (!this.conn.rs.next()) {
				// 查询到了数据
				flag = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}
