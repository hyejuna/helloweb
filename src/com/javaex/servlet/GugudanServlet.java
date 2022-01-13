package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Gugudan") //주소에 입력하는 부분임(동적에서 파일이름자리)
public class GugudanServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//코드작성부분
		
		response.setContentType("text/html;charset=utf-8"); // 한글 깨짐 방지
		
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		PrintWriter out = response.getWriter();
		
		out.println("<table border='1'>"); // html 내용 "안에. html에서 "는 '로 바꿈 . head, body 등 기본적인거는 생략 가능.
		
		for(int i=1; i<=9; i++) {
			out.println("	<tr>");
			out.println("		<td>"+ dan + "</td>");
			out.println("		<td>"+ i +"</td>");
			out.println("		<td>"+ dan*i +"</td>");
			out.println("	</tr>");
		}
		out.println("</table>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
