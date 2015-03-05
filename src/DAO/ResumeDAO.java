package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	public static void main(String[] args) {
		System.out.println((new ResumeDAO()).getAllResume());
	}

	// 从数据库中查询数据
	public List<Resume> getAllResume() {
		List<Resume> resumeList = new ArrayList<Resume>();
		String sql = "select * from resume;";
		try {
			this.conn.rs = this.conn.st.executeQuery(sql);
			while (this.conn.rs.next()) {
				String rname = this.conn.rs.getString("rname");
				String rposition = this.conn.rs.getString("rposition");
				String rmoney = this.conn.rs.getString("rmoney");
				String rsex = this.conn.rs.getString("rsex");
				String rtel = this.conn.rs.getString("rtel");
				String rid = this.conn.rs.getString("rid");
				String ridcard = this.conn.rs.getString("ridcard");
				String rbirthday = this.conn.rs.getString("rbirthday");
				resumeList.add(new Resume(ridcard, rposition, rmoney, rname,
						rsex, rbirthday, ridcard, rtel));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resumeList;
	}

	// 将数据存入到数据库中
	public boolean saveResume2DB(Resume resume) {
		boolean flag = false;
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
			if (i > 0) {
				flag = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return flag;
	}

}
