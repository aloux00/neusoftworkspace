<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>双喜的搜索页面</title>
<link rel="stylesheet" href="/MyMainPage/layui/css/layui.css"
	media="all">
	
</head>
<body style="background-color: #F7F7F7">
	<div class="layui-carousel" id="test1">
		<div carousel-item="">
			<div>
				<img src="img/m1.png">
			</div>
		</div>
	</div>

	<div>
		<div class="layui-input-block"></div>
		<table>
			<tr>
				<td>
					<form target="_blank" class="layui-form"
						action="http://www.baidu.com/s">
						<div class="layui-inline">
							<label style="width: 100px" class="layui-form-label">是百度搜索啊</label>
							<div class="layui-input-inline">
								<input autofocus style="width: 400px" type="text" name="wd"
									lay-verify="title" autocomplete="off" placeholder="请输入内容啊"
									class="layui-input">
							</div>
						</div>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" type="submit">立即提交</button>
								<button type="reset" class="layui-btn layui-btn-primary">重置</button>
							</div>
						</div>
					</form>
				</td>
				<td>
					<form target="_blank" class="layui-form" action="yinghua.do">
						<div class="layui-inline">
							<label style="width: 100px" class="layui-form-label">樱花动漫搜索</label>
							<div class="layui-input-inline">
								<input style="width: 400px" type="text" name="searchword"
									lay-verify="title" autocomplete="off" placeholder="请输入关键字"
									class="layui-input" />
							</div>

						</div>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" lay-submit="">立即提交</button>
								<button type="reset" class="layui-btn layui-btn-primary">重置</button>
							</div>
						</div>
					</form>
				</td>
			</tr>
			<!-- #####################################################################第二行############################################################### -->
			<tr>
				<td>
					<form target="_blank" class="layui-form"
						action="https://www.sogou.com/web">
						<div class="layui-inline">
							<label style="width: 100px" class="layui-form-label">搜狗搜索</label>
							<div class="layui-input-inline">
								<input autofocus style="width: 400px" type="text" name="query"
									lay-verify="title" autocomplete="off" placeholder="请输入内容啊"
									class="layui-input">
							</div>
						</div>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" type="submit">立即提交</button>
								<button type="reset" class="layui-btn layui-btn-primary">重置</button>
							</div>
						</div>
					</form>
				</td>
				<td>
					<form target="_blank" class="layui-form"
						action="http://search.bilibili.com/all">
						<div class="layui-inline">
							<label style="width: 100px" class="layui-form-label">哔哩哔哩搜索</label>
							<div class="layui-input-inline">
								<input style="width: 400px" type="text" name="keyword"
									lay-verify="title" autocomplete="off" placeholder="请输入关键字"
									class="layui-input" />
							</div>

						</div>
						<div class="layui-form-item">
							<div class="layui-input-block">
								<button class="layui-btn" lay-submit="">立即提交</button>
								<button type="reset" class="layui-btn layui-btn-primary">重置</button>
							</div>
						</div>
					</form>
				</td>
			</tr>
		</table>
	</div>
	<div class="layui-input-block"></div>
	<div >
		<table style="display: inline-block;">
			<tr><td>
				<a target="_blank" href="https://jwch.sdut.edu.cn/"><img
					width="100px" alt="山东理工大学" src="/MyMainPage/img/sdlg.jpg"></a>
			</td>
			</tr>
			<tr align="center"><td>山东理工大学教务处</td></tr>
		</table>
		<form action="upload" method="post" enctype="multipart/form-data" style="display: inline-block;margin: 0px 40px auto 40px">
				<table >
			<tr><td>
			
			<input type="file" name="uploadfile" />
			
			
			</td>
			</tr>
			<tr align="center"><td><input type="submit" value="上传文件到服务器"/></td></tr>
		</table>
		</form>
	<table style="display: inline-block;">
			<tr><td>
				<a target="_blank" href="down.jsp"><img
					width="100px" alt="点击下载" src="/MyMainPage/img/yzq.png"></a>
			</td>
			</tr>
			<tr align="center"><td>从服务器下载文件</td></tr>
		</table>
	</div>

	<script src="/MyMainPage/layui/layui.js"></script>
	<script>
		layui.use('carousel', function() {
			var carousel = layui.carousel;
			//建造实例
			carousel.render({
				elem : '#test1',
				width : '100%' //设置容器宽度
				,
				height : '150px',
				indicator : 'none',
				arrow : 'none' //始终显示箭头
				,
				anim : 'fade' //切换动画方式
			});
		});
	</script>


</body>
</html>