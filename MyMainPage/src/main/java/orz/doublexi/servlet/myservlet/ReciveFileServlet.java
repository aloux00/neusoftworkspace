package orz.doublexi.servlet.myservlet;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
@MultipartConfig
@WebServlet("/upload")
public class ReciveFileServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
			String path = req.getServletContext().getRealPath("/down/");
			Part part=req.getPart("uploadfile");
			if(part.getSize()==0) {
				req.getRequestDispatcher("response/uploadfailed.jsp").forward(req,resp);
				return;

			}
			String name = part.getSubmittedFileName().trim();
			int index=name.lastIndexOf(".");
			String suffix="";
			if(index>0) {
				 suffix= name.substring(index);
			}
//			String savepath=path+UUID.randomUUID()+suffix;
			String savepath=path+"["+UUID.randomUUID().toString().substring(0,4)+"]"+name;
			System.out.println(savepath);
	        part.write(savepath);
	        req.getRequestDispatcher("response/uploadsuccess.jsp").forward(req, resp);
		
	}

}
