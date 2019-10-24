<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="test.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table td{
 border-style: solid;

 border-color: red;
 }
 table{
  border-collapse: collapse;
 }
</style>
</head>
<body>
<table >
<tr><td>姓名</td><td>${param.name }</td></tr>
<tr><td>密码</td><td>${param.pwd }</td></tr>
<tr><td>确认密码</td><td>${param.rpwd }</td></tr>
<tr><td>E-mail</td><td>${param.email }</td></tr>
<tr><td>性别</td><td>${param.sex }</td></tr>
<tr><td>爱好</td>
<td>
${paramValues.hobbies[0] }
${paramValues.hobbies[1] }
${paramValues.hobbies[2] }
${paramValues.hobbies[3] }
</td>
</tr>
<tr><td>备注</td><td>${param.textarea }</td></tr>
</table>

</body>
</html>