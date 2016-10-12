package com.bit2016.helloweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/table")
public class TableServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String row = request.getParameter("r");
		String col = request.getParameter("c");
		
		int nRow = Integer.parseInt(row);
		int nCol = Integer.parseInt(col);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		pw.println("<table border='1px' cellspacing='0' cellpadding='5px'>");
		for (int i = 0; i < nRow; i++) {
			pw.println("<tr>");
			for (int j = 0; j < nCol; j++) {
//				pw.println("<td>");
				pw.println("<td>cell(" + i + ", " + j + ")</td>");
//				pw.println("</td>");
			}
			pw.println("</tr>");
		}
		pw.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
