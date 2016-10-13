package com.bit2016.helloweb.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// POST 방식의 데이터로 넘어오는 파라미터 엔코딩
		// GET 방식은 이 방식으론 안되고 server.xml에서 port 바꾼 곳 뒤에 URIEncoding="UTF-8" 추가!!
		request.setCharacterEncoding("UTF-8");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password"); 
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String birthYear = request.getParameter("birth-year");
		String birthMonth = request.getParameter("birth-month");
		String[] hobbies = request.getParameterValues("hobby");
		String selfIntro = request.getParameter("self-intro");
		
		System.out.println(email);
		System.out.println(password);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(birthYear);
		System.out.println(birthMonth);
		if (hobbies != null) {
//			for (int i = 0; i < hobbies.length; i++) {
//				System.out.println(hobbies[i]);
//			}
			for (String hobby : hobbies) {
				System.out.println(hobby);
			}
		}
		System.out.println(selfIntro);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
