package co.edu.student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/addStudentServlet")
public class AddStudentServ extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String studentNo = req.getParameter("sno"); //getParameter는 String타입이 아니면 오류 발생
		String studentName = req.getParameter("snm");
		String engScore = req.getParameter("eng");
		String korScore = req.getParameter("kor");
		
		
		Student student = new Student();
		student.setStudentNo(Integer.parseInt(studentNo)); //String 타입의 studNo를 int로 변환
		student.setStudentName(studentName);
		student.setEngScore(Integer.parseInt(engScore));
		student.setKorScore(Integer.parseInt(korScore));

		//db.insert 기능 추가
		StudentDAO dao = new StudentDAO();
		boolean success = dao.addStudent(student);
		if(success) {
			// {"retCode":"success", "studentNo": studentNo, "studentName":"studentName", "engScore":engScore, "korScore":korScore} = returnCode
			resp.getWriter().println("{\"retCode\":\"success\", \"studentNo\":" + studentNo + ", \"studentName\":\""+ studentName +"\", \"engScore\":"+engScore+", \"korScore\":"+korScore+"}");
		} else {
			//{"retCode":"fail"}
			resp.getWriter().println("{\"retCode\":\"Fail\"}");
		}
		
	}
}
