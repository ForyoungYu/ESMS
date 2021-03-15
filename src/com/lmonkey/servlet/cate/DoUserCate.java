package com.lmonkey.servlet.cate;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lmonkey.entity.LMONKEY_CATEGORY;
import com.lmonkey.entity.LMONKEY_USER;
import com.lmonkey.service.LMONKEY_CATEGORYDao;
import com.lmonkey.service.LMONKEY_USERDao;

/**
 * Servlet implementation class DoUserCate
 */
@WebServlet("/manage/admin_docateadd")
public class DoUserCate extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置字符集
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charest=utf-8");
		response.setContentType("text/html;charset=gb2312");

		int fid = Integer.parseInt(request.getParameter("parentId"));
		String name = request.getParameter("className");
		
		LMONKEY_CATEGORY cate = new LMONKEY_CATEGORY(0, name, fid);
		LMONKEY_CATEGORYDao.insert(cate);
		 
		response.sendRedirect("admin_cateselect");
	}
}
