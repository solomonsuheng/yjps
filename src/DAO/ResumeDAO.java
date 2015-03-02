package DAO;

import java.sql.SQLException;

import DBConn.MySQLDBConn;
import VO.Resume;

/**
 * @author mac
 *
 */
public class ResumeDAO {
	private MySQLDBConn conn = null;

	public ResumeDAO() {
		this.conn = new MySQLDBConn();
	}

	// 对传入的resume进行数据检测，判断是否为空
	public boolean isEmpty(Resume resume) {
		boolean flag = true;
		return true;
	}

	// 将数据存入到数据库中
	public boolean saveResume2DB(Resume resume) {
		boolean flag = false;
		if (isEmpty(resume)) {
			return flag;
		}
		String sql = "insert into resume (rposition,rmoney,rname,rsex,rbirthday,ridcard,rtel) values ('"
				+ resume.getRposition()
				+ "','"
				+ resume.getRmoney()
				+ "','"
				+ resume.getRname()
				+ "','"
				+ resume.getRsex()
				+ "','"
				+ resume.getRbirthday()
				+ "','"
				+ resume.getRidcard()
				+ "','"
				+ resume.getRtel() + "');";

		try {
			int i = this.conn.st.executeUpdate(sql);
			System.out.println(i);
			if (i > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
	}

	// 测试函数
	public static void main(String[] args) {
		Resume r = new Resume("1231", "asds", "1231", "adas", "Male", "2009",
				"1212", "123891283");
		ResumeDAO dao = new ResumeDAO();
		if (dao.saveResume2DB(r)) {
			System.out.println("成功");
		}
	}
}
