package orz.doublexi.mvcbyxml.controller;

import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.fasterxml.jackson.databind.ObjectMapper;

import orz.doublexi.mvcbyxml.dao.ShuqianDao;
import orz.doublexi.mvcbyxml.projo.ShuQian;

public class queryShuQian  extends AbstractController {
	SqlSession sqlsession;


	public SqlSession getSqlsession() {
		return sqlsession;
	}


	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}

	
	

ObjectMapper mapper=new ObjectMapper();
protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {	response.setContentType("text/html;charset=utf-8");
int limit=0;
int page=0;
int count=0;
ShuqianDao shuqiandao=sqlsession.getMapper(ShuqianDao.class);
int fenlei=Integer.parseInt(request.getParameter("fenlei"));
limit=Integer.parseInt(request.getParameter("limit"));
page=Integer.parseInt(request.getParameter("page"));
List<ShuQian> all = shuqiandao.queryAll(fenlei,(page-1)*10,10);
count = shuqiandao.selectCount(fenlei);
response.setCharacterEncoding("utf-8");
Writer out=response.getWriter();
JsonObject json=new JsonObject();
json.setData(all);
json.setCode(0);
json.setCount(count);
System.out.println(count);
json.setMsg("test");;
String string = mapper.writeValueAsString(json);
System.out.println(string);
out.write(string);
out.flush();
out.close();
return null;
}
}

class JsonObject{
	private int code;
	private String msg;
	private int count;


	private List<ShuQian> data;
	

	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public List<ShuQian> getData() {
		return data;
	}


	public void setData(List<ShuQian> data) {
		this.data = data;
	}


	public JsonObject() {
	}
}
