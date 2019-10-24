<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="tt.jsp">
<table>
<tr><td>姓名</td><td><input name="name" type="text" /></td></tr>
<tr><td>密码</td><td><input name="pwd" type="text" /></td></tr>
<tr><td>确认密码</td><td><input name="rpwd" type="text" /></td></tr>
<tr><td>E-mail</td><td><input name="email" type="text" /></td></tr>
<tr><td>性别</td><td>男<input name="sex" type="radio" value="男"/>女<input name="sex" type="radio" value="女"/><td></tr>
<tr><td>爱好</td>
<td>
 游泳<input name="hobbies" type="checkbox" value="游泳"/>
 看书<input name="hobbies" type="checkbox" value="看书"/>
 旅游<input name="hobbies" type="checkbox" value="旅游"/>
 唱歌<input name="hobbies" type="checkbox" value="唱歌"/>
</td>
</tr>
<tr><td>备注</td><td><textarea rows="3" cols="20" name="textarea"></textarea></td></tr>
<tr><td><button type="submit">注册</button></td><td><button type="reset">重置</button></td></tr>
</table>
</form>
<% session.setAttribute("uu", "hehe"); %>
</body>
</html>