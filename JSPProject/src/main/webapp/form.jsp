<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
   <form name="frm" action="StudentGetServlet" method="get">
      <input type="hidden" name="cmd" value="search"> 
      ID: <input type="number" name="user_id" value="111"><br> 
      Name:<input   type="text" name="user_name" value="홍길동"><br>
      Eng:<input type="number" name="eng_score"><br>
      Kor:<input type="number" name="kor_score"> 
      <input type="submit" value="조회"> 
      <input id="addBtn" type="button" value="입력">
      <input id="modBtn" type="button" value="수정">
      <input id="delBtn" type="button" value="삭제">
      <hr>
      <a href="studentList.jsp">학생목록</a>
      
   </form>   
   <script>
   	//수정버튼
   	let modBtn = document.getElementById('modBtn');
   	modBtn.addEventListener('click', function() {
	let frm = document.forms.frm;
        
        frm.method = "post";
        frm.cmd.value = "mod";
        frm.submit(); // form의 submit버튼 클릭하는 기능
   	});
   
   	  //삭제버튼
   	  let delBtn = document.getElementById('delBtn');
   	  delBtn.addEventListener('click', function() {
   		let frm = document.forms.frm;
        
        frm.method = "post";
        frm.cmd.value = "del";
        frm.submit(); // form의 submit버튼 클릭하는 기능

   		  
   	  });//end of del
   
   
   	  //추가버튼
      let btn = document.querySelector('#addBtn');
      btn.addEventListener('click', function() {
         let frm = document.forms.frm;
         
         frm.action="StudentGetServlet";
         frm.method = "post";
         frm.cmd.value = "add";
         frm.submit(); // form의 submit         
      }); //end of insert
   </script>
</body>
</html>