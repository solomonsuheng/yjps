package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DAO.ResumeDAO;
import VO.Resume;

//上传简历
public class ResumeServlet extends HttpServlet {
	private ResumeDAO dao = null;
	private Resume resume = null;

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	// 获取所有的简历信息
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		List<Resume> list = this.dao.getAllResume();
		Gson gson = new Gson();
		gson.toJson(list);
		out.write(gson.toJson(list));
		out.close();
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String rid = "0";
		String rposition = request.getParameter("rposition");
		String rmoney = request.getParameter("rmoney");
		String rname = request.getParameter("rname");
		String rsex = request.getParameter("rsex");
		String rbirthday = request.getParameter("rbirthday");
		String rtel = request.getParameter("rtel");
		String ridcard = request.getParameter("ridcard");

		resume = new Resume(rid, rposition, rmoney, rname, rsex, rbirthday,
				ridcard, rtel);
		// System.out.println(resume.toString());
		if (this.dao.saveResume2DB(resume)) {
			// 存储数据成功
			out.write("Ok");
		} else {
			// 存储数据失败
			out.write("No");
		}

		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		this.dao = new ResumeDAO();
	}

}
