<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
    form{
        margin-top:100px;
    	width: 300px;
    	display: inline-block;
    	border: 1px solid #ccc;
    }
</style>
<script type="text/javascript">
function regist() {
	 window.location.href="toregist";
}
</script>
</head>
<body>
<div  style="text-align: center;" >
<form id="form"  action="login" >
<table>
<tr>
<td>用户名：</td><td><input type="text" name="username"/></td></tr>
<tr><td>密码：</td><td><input type="password" name="password"/></td> </tr>
<tr><td><button type="submit">登录</button></td><td><button type="button" onclick="regist();">注册</button></td> </tr>
</table>
</form>
</div>
</body>
</html>