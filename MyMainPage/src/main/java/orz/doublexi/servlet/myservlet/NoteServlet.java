package orz.doublexi.servlet.myservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import orz.doublexi.servlet.service.NoteService;
@WebServlet("/insertnote.html")
public class NoteServlet extends HttpServlet {
	private NoteService noteService=new NoteService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
request.setCharacterEncoding("utf-8");
System.out.println(request.getClass());
request.getSession();
String noteleibie=request.getParameter("noteleibie");
	String notename=request.getParameter("notename");
	String notecontent=request.getParameter("notecontent");
	noteService.insertNote(noteleibie, notename, notecontent);
	request.getRequestDispatcher("/mynote.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
