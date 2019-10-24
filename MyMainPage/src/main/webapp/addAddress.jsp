<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="/MyMainPage/layui/css/layui.css"
	media="all">
<title>Insert title here</title>
</head>
<body>
	<form class="layui-form" action="/MyMainPage/insertaddress.do" method="post">

		<div class="layui-form-item">
			<label class="layui-form-label" style="width: 100px">书签的种类哦</label>
			<div class="layui-input-inline">
				<select name="addressclass" lay-filter="aihao">
					<option value=""></option>
					<option value="5" selected="">默认</option>
					<option value="1">游戏</option>
					<option value="2">动漫</option>
					<option value="3">科技</option>
					<option value="4">学习</option>
				</select>
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label" style="width: 100px">给书签命个名</label>
			<div class="layui-input-inline">
				<input style="width: 400px" type="text" name="addressname"
									lay-verify="title" autocomplete="off" placeholder="请输入书签名称"
									class="layui-input" />
			</div>
		</div>
		<div class="layui-form-item">
			<label class="layui-form-label" style="width: 100px">书签的网址呢</label>
			<div class="layui-input-inline">
				<input style="width: 400px" type="text" name="webaddress"
									lay-verify="title" autocomplete="off" placeholder="请输入网址"
									class="layui-input" />
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