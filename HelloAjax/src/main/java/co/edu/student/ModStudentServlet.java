package co.edu.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ajax/modStudentServlet")
public class ModStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ModStudentServlet() {
        super();
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	req.setCharacterEncoding("UTF-8");
    	resp.setCharacterEncoding("UTF-8");
    	resp.setContentType("text/html;charset=UTF-8");
    	
    	String sNo = req.getParameter("a");
    	String sName = req.getParameter("b");
    	String eng = req.getParameter("c");
    	String kor = req.getParameter("d");
    	
    	Student student = new Student();
    	student.setStudentNo(Integer.parseInt(sNo));
    	student.setStudentName(sName);
    	student.setEngScore(Integer.parseInt(eng));
    	student.setKorScore(Integer.parseInt(kor));
    	
    	StudentDAO dao = new StudentDAO();
    	boolean success = dao.modifyStudent(student);
    	
    	if(success) {
    		// {"retCode":"success", "studentNo": studentNo, "studentName":"studentName", "engScore":engScore, "korScore":korScore}
    		resp.getWriter().println("{\"retCode\":\"success\", \"studentNo\": "+sNo+", \"studentName\":\""+sName+"\", \"engScore\":"+eng+", \"korScore\":"+kor+"}");
    	}else {
    		//{"retCode":"NG", "retVal": id}
    		resp.getWriter().println("{\"retCode\":\"fail\", \"studentNo\": "+sNo+", \"studentName\":\""+sName+"\", \"engScore\":"+eng+", \"korScore\":"+kor+"}");
    	}
    	
    	
    }
}
