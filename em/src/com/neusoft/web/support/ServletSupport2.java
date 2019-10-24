package com.neusoft.web.support;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public abstract class ServletSupport2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String toPath=null;
		try {
			Map<String,Object> dto=this.createDto(request);
			toPath=this.execute(dto,request);
		} catch (Exception e) {
			request.setAttribute("msg", "网络错误");
			e.printStackTrace();
		}
		request.getRequestDispatcher("/"+toPath+".jsp").forward(request, response);
	}

	
	protected abstract String execute(Map<String, Object> dto, HttpServletRequest request) throws Exception;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
	}
	protected final Map<String,Object>  createDto(HttpServletRequest request)
	{
		Map<String,String[]> tem=request.getParameterMap();
		int count=tem.size();
		int initSize=((int)(count/0.75))+1;
		
		Set<Entry<String,String[]>> entrySet=tem.entrySet();
		Map<String,Object> dto=new HashMap<>(initSize);
		String[] val=null;
		for(Entry<String,String[]> entry:entrySet)
		{
		
			val=entry.getValue();
			if(val.length==1)  
			{
				dto.put(entry.getKey(), val[0]);
			}
			else     
			{
				dto.put(entry.getKey(), val);
			}	
		}
		return dto;
	}

}
