<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Practice LayUI</title>
<link rel="stylesheet" href="/TestWeb/layui/css/layui.css">
</head>
<body>
<form>
<a href="hehe">hahahahahah</a>
</form>
<script src="/TestWeb/layui/layui.js"></script>
<script>
layui.use(['layer','form'], function(){
	var layer=layui.layer
	,form=layui.form;
	
	layer.msg('hello');
	
});
</script>

</body>
</html>