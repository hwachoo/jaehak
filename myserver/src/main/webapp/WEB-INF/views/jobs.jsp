<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script>
	$(function() {
		$("#accor").accordion({
			//클릭할 때 펼치고 접기 기능 구현
			collapsible : true,
			active : 0,
			heightStyle : "content",
			activate : function(event, ui) {
			}
		});
	})
</script>
<body>
	<div id="accor">
		<c:forEach items="${jobs}" var="j">
			<h3>${j.job_title }</h3>
			<div>
				<c:forEach items="${j.employees}" var="e">
					<div>${e.employee_id } - ${e.first_name }</div>
				</c:forEach>
			</div>
		</c:forEach>
	</div>
</body>
</html>