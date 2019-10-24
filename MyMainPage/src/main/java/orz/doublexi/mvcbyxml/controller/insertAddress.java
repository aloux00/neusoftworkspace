package orz.doublexi.mvcbyxml.controller;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import orz.doublexi.mvcbyxml.dao.ShuqianDao;
import orz.doublexi.mvcbyxml.projo.ShuQian;


public class insertAddress extends AbstractController {
	SqlSession sqlsession;


	public SqlSession getSqlsession() {
		return sqlsession;
	}


	public void setSqlsession(SqlSession sqlsession) {
		this.sqlsession = sqlsession;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		System.out.println(request.getParameter("addressclass"));
		Map<String, String[]> dto=request.getParameterMap();
		Set<Entry<String, String[]>> entryset=dto.entrySet();
		String[] value=null;
ShuQian shuqian=new ShuQian();
ShuqianDao dao=sqlsession.getMapper(ShuqianDao.class);
		for(Entry<String,String[]> entry:entryset){
			
			if(entry.getKey().equals("addressclass")) {
				value=entry.getValue();
		
				shuqian.setFenlei(Integer.parseInt(value[0]));
			}else if(entry.getKey().equals("addressname")) {
				value=entry.getValue();
				shuqian.setMingcheng(value[0]);
			}else if(entry.getKey().equals("webaddress")) {
				value=entry.getValue();
				shuqian.setWebaddress(value[0]);
			}
		}
dao.insertShuQian(shuqian);
return new ModelAndView("/addAddress.jsp");
	}



	
}
