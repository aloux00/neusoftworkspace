package com.neusoft.web.impl;


import java.util.List;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;

import com.neusoft.services.impl.EmpServicesImpl;
import com.neusoft.web.support.ServletSupport2;

@WebServlet("/tuiXiuEmp.html")
public class TuiXiuServlet extends ServletSupport2 {

	@Override
	protected String execute(Map<String, Object> dto, HttpServletRequest request) throws Exception {
		EmpServicesImpl empservices=new EmpServicesImpl(dto);
		System.out.println("???????????????????????????");
		String msg=empservices.tuixiu()?"退休成功":"退休失败";
		request.setAttribute("msg", msg);
		List<Map<String,String>> rows=empservices.queryAll();
		if(rows!=null){
			request.setAttribute("rows", rows);
		}
		return "queryEmp";
	}


}
