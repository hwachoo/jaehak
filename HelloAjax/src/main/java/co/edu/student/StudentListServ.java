package co.edu.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/studentList.json")
public class StudentListServ extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//[{"studentNo": ?, "studentName: "?", "engScore": ?, "korScore": ?}, {}]
		resp.setCharacterEncoding("UTF-8"); //한글이 있을 경우 처리 가능
		resp.setContentType("text/html;charset=UTF-8");
		StudentDAO dao = new StudentDAO();
		List<Student> list = dao.studentList();
		
		String jsonString = "[";
		for(int i = 0; i < list.size(); i++) {
			jsonString += "{\"studentNo\": "+list.get(i).getStudentNO()
					+", \"studentName: \""+list.get(i).getStudentName()
					+"\", \"engScore\": "+list.get(i).getEngScore()
					+", \"korScore\":"+list.get(i).getKorScore()+"}";
			
			if(i != list.size()-1) { //list.size의 마지막 index값이 아닐 경우
				jsonString += ","; //jsonString의 끝에 ,를 표시
			}
		}
		
		jsonString += "]";
		
		resp.getWriter().print(jsonString);
	}

}
