<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file="head.jsp" %>
<table>
<tr><td><%= request.getParameter("name") %></td></tr>
<tr><td><%= request.getParameter("password") %></td></tr>

</table>
<%@ include file="tail.jsp" %>
</body>
</html>