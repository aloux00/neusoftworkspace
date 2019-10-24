<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="/MyMainPage/layui/css/layui.css"
	media="all">
<title>记事本</title>
</head>
<body>
	<form class="layui-form" action="/MyMainPage/insertnote.html" method="post">

		<div class="layui-form-item">
			<label class="layui-form-label" style="width: 100px">note的种类</label>
			<div class="layui-input-inline">
				<select name="noteleibie">
					<option value=""></option>
					<option value="知识点" selected="">知识点</option>
					<option value="随记">随记</option>
					
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label" style="width: 100px">命名</label>
			<div class="layui-input-inline">
				<input style="width: 400px" type="text" name="notename"
									lay-verify="title" autocomplete="off" placeholder="请输入名称"
									class="layui-input" />
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label" style="width: 100px">内容哦</label>
			<div class="layui-input-inline">
				<textarea style="width: 400px ;height:200px" type="" name="notecontent"
									lay-verify="title" autocomplete="off" placeholder="请输入内容"
						  align="top" class="layui-input" ></textarea>
			</div>
		</div>
		
		<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" lay-submit="">立即保存</button>
								<button type="reset" class="layui-btn layui-btn-primary">重置</button>
							</div>
						</div>
	</form>


	

	<script src="/MyMainPage/layui/layui.js" charset="utf-8"></script>
	<script>
		layui.use('form', function() {
			var form = layui.form;
			form.render();
		});
	</script>
</body>
</html>