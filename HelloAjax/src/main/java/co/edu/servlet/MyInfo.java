package co.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edu/default.do")
public class MyInfo extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		//content type => default
		
		PrintWriter out = resp.getWriter(); //out변수 선언
		//resp.getWriter();출력함수
		out.print("<h3>컨텐트 타입이 기본</h3>");
	}
}
