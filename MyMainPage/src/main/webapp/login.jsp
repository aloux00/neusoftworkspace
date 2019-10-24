<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/MyMainPage/layui/css/layui.css">
</head>
<body background="${pageContext.request.contextPath }/img/bg1.png">

<div style="width: 300px; position: relative; left:35%; top:200px;">
<form class="layui-form" action="canlogin.do" >
<div class="layui-block">
 <div class="layui-form-item">
  <div class="layui-inline" >
 
   
    <div class="layui-input-block">
      <input type="text" name="username" lay-verify="title" autocomplete="off" placeholder="请输入管理账号" class="layui-input">
    </div>
    </div>
  </div>
 <div class="layui-form-item">
  <div class="layui-inline">

    <div class="layui-input-block">
      <input type="password" name="password" placeholder="请输入密码" autocomplete="off" class="layui-input">
    </div>
  </div>
  </div>
  
  <div class="layui-item">
							<div class="layui-input-block">
							<div class="layui-form-item">
								<button class="layui-btn" type="submit">立即提交</button>
								<button type="reset" class="layui-btn layui-btn-primary">重置</button>
							</div>
							</div>
						</div>
  </div>
  </form>
  <div  style="text-align: center;">  <font color="red" size="4">${msg }</font></div>
  </div>


					
  
  <!-- <script src="/MyMainPage/layui/layui.js">
  </script>

 <script type="text/javascript">
  layui.use('element', function(){
	  var element = layui.element;
	});
  </script> -->
</body>
</html>