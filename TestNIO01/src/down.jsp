<%@page import="java.io.File"%>
<%@page import="java.io.InputStream"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>这个就是下载目录咯</title>
</head>
<body>
<% 
String filePath = request.getSession().getServletContext().getRealPath("/"); 
File file=new File(filePath+"down");
File[] ff=file.listFiles();
%>

<% 
for(int i=0;i<ff.length;i++){ 
%>
<a href=<%="down/"+ff[i].getName() %>><%=ff[i].getName() %></a><br/>
<% 
} 
%>

</body>
</html>