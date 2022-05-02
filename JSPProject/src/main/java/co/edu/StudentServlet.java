package co.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//IOC : Introversion Of Control - 개발자 제어가 아닌 container에 따라 제어
public class StudentServlet extends HttpServlet {
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출.");
		//첫번째 실행될 때 한 번만 실행됨
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8"); //페이지 정보 지정(html태그를 읽을 수 있게 만들어 줌)
		
		String method = req.getMethod();
		
		//요청정보 : req, 응답정보 : resp
		PrintWriter out = resp.getWriter(); //출력스트림 생성, 웹페이지에 응답정보(출력)을 보여줌
		out.println("<h3>Student Sample page.</h3>");
		if(method.equals("GET")) {
			out.println("<h3>Get방식 호출</h3>");
			doGet(req, resp);
		}else if(method.equals("POST")) {
			out.println("<h3>Post방식 호출</h3>");
		}
		out.println("<a href='./index.jsp?user_name=kildong&user_id=hong'>index page</a>");
		//공백이 들어가선 안됨(경로 인식 못함)
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy() 호출.");
		//
	}
}
