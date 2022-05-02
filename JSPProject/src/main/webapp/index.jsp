<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
<h3>반갑습니다</h3>
<% /*java source 사용가능*/
	//javacode
	String name = "홍길동";
	out.println("<h3>" + name + "</h3>"); //out -> 내장객체 = 선언하지 않아도 사용가능
	// input 태그의 name = parameter
	String id = request.getParameter("user_id"); //내장개체
	String name2 = request.getParameter("user_name");
	out.println("<h4>입력값: " + id + ", name:" + name2 + "</h4>");
%>

<!-- 인덱스 호출 -->
<a href="../student/student.do">Student Servlet</a>
</body>
</html>