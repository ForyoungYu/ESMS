package com.lmonkey.servlet.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class admin_logout
 */
@WebServlet("/manage/admin_logout")
public class AdminLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charest=utf-8");
		response.setContentType("text/html;charset=gb2312");
		
		HttpSession session = request.getSession();
		
		session.removeAttribute("name");
		session.removeAttribute("isLogin");
		session.removeAttribute("isAdminLogin");
	
		PrintWriter out = response.getWriter();
		
		out.write("<script>");
		out.write("alert('退出成功！');");
		out.write("location.href='login.jsp'");
		out.write("</script>");
		out.close();
	}
}
