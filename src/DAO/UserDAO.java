package DAO;

import java.sql.SQLException;

import DBConn.MySQLDBConn;

/**
 * @author mac
 *
 */

public class UserDAO {
	private MySQLDBConn conn = null;

	public UserDAO() {
		// 初始化数据库
		this.conn = new MySQLDBConn();
	}

	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
	}

	// 根据用户名和密码对cuser中的数据进行检测，返回该用户名密码是否存在
	public boolean isUserExist(String uname, String upwd) {
		boolean flag = true;
		String sql = "select *from cuser where cuname='" + uname
				+ "' and cupwd='" + upwd + "';";
		try {
			this.conn.rs = this.conn.st.executeQuery(sql);
			if (!this.conn.rs.next()) {
				// 数据库中没有返回对应账号和密码的数据,表示该数据不存在于数据库中
				flag = false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}
}
