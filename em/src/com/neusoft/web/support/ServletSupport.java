package com.neusoft.web.support;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class ServletSupport extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	
		this.doGet(req, resp);
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
