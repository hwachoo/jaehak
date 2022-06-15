<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empClient.jsp</title>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
</head>
<body>
	<div id="divList"></div>
	<script>
	//ajax 필수 옵션
		$.ajax({
			url : "req",
			//async 비동기 옵션 false = 동기식
			async : false,
			//mothod를 정해주지 않을 경우 default는 get
			method : "post",
			//서버로 보내줄 데이터
			data : JSON.stringify({first_name:"gildong", last_name:"kim"}),
			contentType : "json", //보내는 파라미터가 json string
			//서버로 보내줄 데이터의 형태 json, xml, text ...
			dataType : "json",
			success : function(result){
				console.log("결과는");
				console.log(result);
			} 
		})
		console.log("요청");
	</script>
</body>
</html>