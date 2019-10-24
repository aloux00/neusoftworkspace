package dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HouseInfoDao;
import dao.St;

public class LoginServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String empno = req.getParameter("empno");
		String ename = req.getParameter("ename");
		String job = req.getParameter("job");
		String mgr = req.getParameter("mgr");
		String sal = req.getParameter("sal");
		String comm = req.getParameter("comm");
		String deptno = req.getParameter("deptno");
		HouseInfoDao dao = new HouseInfoDao();

		
			int a;
			try {
				a = dao.addHouseInfo(new St(Integer.parseInt(empno),ename,job,Integer.parseInt(mgr),new Date(),Integer.parseInt(sal),Integer.parseInt(comm),Integer.parseInt(deptno)));
				PrintWriter pw = resp.getWriter();
				if (a > 0) {
					System.out.println("登录成功");
					pw.write("<h1>添加成功</h1>");
				} else {
					pw.write("<h1>添加失败</h1>");
				}
			} catch (NumberFormatException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		
}
}