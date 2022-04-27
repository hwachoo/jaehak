package co.edu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Info extends HttpServlet {

	//info 페이지 요청 -> Init()실행 -> Service()(요청할 때 마다) -> Destroy()(종료)
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8"); //한글이 있을 경우 처리 가능
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		out.print("<h3>서블릿 페이지</h3>");
		out.print("<h3>안녕하세요</h3>");
		out.print("<a href=\"../index.html\">index</a>");
		//<a href="../index.html">index</a>
	}
}
