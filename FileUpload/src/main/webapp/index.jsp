<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="layui/css/layui.css" rel="stylesheet">
</head>
<body>
<h3>文件上传</h3>
<form action="user/fileupload01"  method="post"  enctype="multipart/form-data">
<input type="file" name="upload" /><br>
<input type="submit" value="提交" />

</form>
<form action="user/fileupload02"  method="post"  enctype="multipart/form-data">
<input type="file" name="upload" /><br>
<input type="submit" value="提交" />
</form>

<!-- ##################################### -->






<div class="layui-upload">
  <button type="button" class="layui-btn" id="test1">上传图片</button>
  <div class="layui-upload-list">
    <img class="layui-upload-img" id="demo1">
    <p id="demoText"></p>
  </div>
</div>   


<!-- ##################################### -->
<a href="user/test01">01</a>
<a href="user/test02">02</a>
</body>
<script src="layui/layui.js" charset="utf-8"></script>
<script type="text/javascript">
layui.use('upload', function(){
	  var $ = layui.jquery
	  ,upload = layui.upload;
	 var uploadInst = upload.render({
		    elem: '#test1'
		    ,url: 'user/fileupload03'
		    ,before: function(obj){
		      //预读本地文件示例，不支持ie8
		      obj.preview(function(index, file, result){
		        $('#demo1').attr('src', result); //图片链接（base64）
		      });
		    }
		    ,done: function(res){
		      //如果上传失败
		      if(res.code > 0){
		        return layer.msg('上传失败');
		      }
		      //上传成功
		    }
		    ,error: function(){
		      //演示失败状态，并实现重传
		      var demoText = $('#demoText');
		      demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
		      demoText.find('.demo-reload').on('click', function(){
		        uploadInst.upload();
		      });
		    }
		  });
});
</script>

</html>