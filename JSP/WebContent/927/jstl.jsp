<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl的标签迭代</title>
<style type="text/css">
p{
display: inline;
}
</style>
</head>
<body>
<% request.setAttribute("str","a,b,c,d,e"); 
request.setAttribute("stuNames","ZhangSan;LiSi;WangWu;ZhaoLiu");
%>
<c:forEach var="ch" items="${requestScope.str }">
<p>${ch }</p>
</c:forEach>

<c:forTokens items="${requestScope.stuNames }" delims=";" var="name">
${name }<br/>
</c:forTokens>
</body>
</html>