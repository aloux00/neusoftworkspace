package orz.doublexi.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.DispatcherServlet;

@Controller
@RequestMapping("user")
public class UserController {
//	@RequestMapping("fileupload01")
//public String fileupload01(HttpServletRequest request) throws Exception{
//	System.out.println("文件上传");
//	String path=request.getServletContext().getRealPath("/WEB-INF/upload/");
//	File prefix=new File(path);
//	if(!prefix.exists()) {
//		prefix.mkdirs();
//	}
//	DiskFileItemFactory factory=new DiskFileItemFactory();
//	ServletFileUpload upload=new ServletFileUpload(factory);
//	List<FileItem> list = upload.parseRequest(request);
//	for(FileItem item:list) {
//		if(item.isFormField()) {
//		}else {
//			String name=item.getName();
//			item.write(new File(prefix, UUID.randomUUID().toString().substring(0,4)+name));
//		}
//	}
//			
//	return "success";
//}
//	
//	@RequestMapping("fileupload02")
//	public String fileupload02(HttpServletRequest request,@RequestParam("upload")MultipartFile upload2) throws Exception{
//		System.out.println("springmvc文件上传");
//		String path=request.getServletContext().getRealPath("/WEB-INF/upload/");
//		File prefix=new File(path);
//		if(!prefix.exists()) {
//			prefix.mkdirs();
//		}
//		String name = upload2.getOriginalFilename();
//		upload2.transferTo(new File(prefix, UUID.randomUUID().toString().substring(0,4)+name));
////		
//		return "success";
//	}
//	
//	@RequestMapping("fileupload03")
//	@ResponseBody
//	public Map<String,Object> fileupload03(HttpServletRequest request,MultipartFile file) throws Exception{
//		System.out.println("layui文件上传");
//		String path=request.getServletContext().getRealPath("/WEB-INF/upload/");
//		File prefix=new File(path);
//		if(!prefix.exists()) {
//			prefix.mkdirs();
//		}
//		String name = file.getOriginalFilename();
//		file.transferTo(new File(prefix, UUID.randomUUID().toString().substring(0,4)+name));
//		Map<String, Object> map=new HashMap<>();
//		map.put("code", 0);
//		map.put("msg", "");
//		Map<String, Object> value=new HashMap<>();
//		value.put("src", "");
//		map.put("data", value);
//		return map;
//	}
	
	
	@RequestMapping("test01")
	public String fileupload02(HttpServletRequest request) throws Exception{
		System.out.println("01");
		return "hehe.jsp";
	}
	@RequestMapping("test02")
	public String fileupload03(HttpServletRequest request) throws Exception{
		System.out.println("02");
		return "/hehe.jsp";
	}
	
}
