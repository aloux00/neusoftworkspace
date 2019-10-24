package com.neusoft.web.impl;


import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import com.neusoft.services.impl.EmpServicesImpl;
import com.neusoft.web.support.ServletSupport2;

@WebServlet("/tuiXiuEmp2.html")
public class TuiXiuServlet2 extends ServletSupport2 {

	@Override
	protected String execute(Map<String, Object> dto, HttpServletRequest request) throws Exception {
		EmpServicesImpl empservices=new EmpServicesImpl(dto);
		String msg=empservices.tuixiu2()?"退休加钱成功":"退休加钱失败";
		request.setAttribute("msg", msg);
		List<Map<String,String>> rows=empservices.queryAll();
		if(rows!=null){
			request.setAttribute("rows", rows);
		}
		return "queryEmp";
	}


}
