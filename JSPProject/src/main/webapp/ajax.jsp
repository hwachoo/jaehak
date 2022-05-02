<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax.jsp</title>
</head>
<body>
	<script>
	 //Asynchronous Javascript And Xml. 비동기방식
	 let url = 'StudentGetServlet';
	 fetch(url) //fetch : promise 반환
	 	.then(result => {
	 		console.log(result);
	 		return result.json(); //stram타입을 json타입(object)으로 변환{"id":23, "name":"hong"...}
	 	})
	 	.then(result => {
	 		console.log(result);
	 	})
	 	.catch(error => {
	 		console.log(error);
	 	})
	 
	</script>
</body>
</html>