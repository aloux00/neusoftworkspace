<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="test">
<table>
<tr><td>用户名：</td><td><input name="name" type="text"/></td></tr>
<tr><td>密码：</td><td><input name="password" type="password"/></td></tr>
<tr><td><input type="submit" value="提交" /></td></tr>
</table>
</form>
<% application.setAttribute("attr", "hehe"); %>
${ applicationScope.attr }
${tttt }
${param.tttt }
</body>
</html>