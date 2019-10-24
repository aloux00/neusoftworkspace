<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page import="test.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% session.setAttribute("user", "hehe"); %>
欢迎<c:out value="${sessionScope.user }" default="游客"></c:out>
<c:set var="testset" value="set哦" scope="session"></c:set>
欢迎<c:out value="${sessionScope.testset }" default="游客"></c:out>
<c:remove var="testset" scope="session"/>
欢迎<c:out value="${sessionScope.testset }" default="游客"></c:out>
<br>
<hr>
<c:set var="hello" scope="request" value="hello jstl"></c:set>
<c:out value="hello" default="-"></c:out>
<% request.setAttribute("userbean", new User()); %>
<% session.setAttribute("uu", "hehe"); %>
<c:set property="name" target="${userbean }" value="shuangxi"></c:set>
<c:out value="${userbean.name }"></c:out>
</body>
</html>