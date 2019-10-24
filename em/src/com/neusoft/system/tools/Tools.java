package com.neusoft.system.tools;

public class Tools
{
	private Tools() {}
	
	public static void main(String[] args) 
	{
	    String arr[]={"1","2","5","8","0"};
	    String str=Tools.joinArray(arr);
	    System.out.println(str);
	}
	
	public static String joinArray(Object val)
	{
		if(val==null)
		{
			return "";
		}
		
		if(val instanceof java.lang.String[])
		{
			String array[]=(String[])val;
			int len=array.length;
			StringBuilder text=new StringBuilder(array[0]);
			for(int i=1;i<len;i++)
			{
				text.append(",").append(array[i]);
			}
			return text.toString();
		}
		else
		{
			return val.toString();
		}	
	}
	

}
