<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resource/layui/css/layui.css">
<style type="text/css">
html,body{
            height: 100%;
            margin: 0;
            padding: 0;
        }
</style>
</head>
<body>

<table id="userTable" lay-filter="userTable">
  <div class="layui-btn-group layui-hide" id="edit">
    <button type="button" class="layui-btn layui-btn-sm" lay-event="add">增加</button>
     <button type="button" class="layui-btn layui-btn-sm " lay-event="batchDelete">批量删除</button>
  </div>
</table>

<script src="resource/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript">
layui.use(['table','jquery'],function(){
	var $=layui.jquery;
	var table=layui.table;
	

	
	
	
	  table.render({
		    elem: '#userTable'
		    ,height: 312
		    ,toolbar: "#edit"
		    ,defaultToolbar: ['filter','print']
		    ,url: 'data.json' //数据接口
		    ,page: true //开启分页
		    ,text:{none:'真的没有了'}
		    ,cols: [[ //表头
		    	{type: 'checkbox', fixed: "left"}
		      ,{field: 'id', title: 'ID', width:80, sort: true, fixed: 'left'}
		      ,{field: 'username', title: '用户名', width:80,edit:true}
		      ,{field: 'sex', title: '性别', width:80, sort: true,templet: function(d){
		    	  return d.sex=='男'?'汉子':'妹子'
		      }}
		      ,{field: 'city', title: '城市', width:80} 
		      ,{field: 'sign', title: '签名', width: 177}
		    ]]
		  });
//头部工具事件
	  table.on("toolbar(userTable)",function(obj){
		  switch(obj.event){
		  case 'add': layer.msg('添加');
		  break;
		  case 'batchDelete': layer.msg('批量删除');
		  break;
		  }
		  
	  });
	  
	  table.on('row(userTable)', function(obj){
		});
	  
		});

</script>
</body>

</html>
