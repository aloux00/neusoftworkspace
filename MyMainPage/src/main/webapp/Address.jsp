<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="/MyMainPage/layui/css/layui.css"  media="all">
<title>书签界面哦</title>
</head>
<body>

<table class="layui-hide" id="shuqian"></table>
<script src="/MyMainPage/layui/layui.js" charset="utf-8"></script>

<script>
var a=location.href;
var s=a.indexOf("?"); 
var t=a.substring(s+1);// t就是?后面的东西了
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
	  elem: '#shuqian'
	,url:'/MyMainPage/shuqian.do?fenlei='+t
    ,page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
      layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'] //自定义分页布局
      //,curr: 5 //设定初始在第 5 页
      ,groups: 1 //只显示 1 个连续页码
      ,first: false //不显示首页
      ,last: false //不显示尾页
      
    }
    ,cols: [[
        {field:'fenleistr', width:80, title: '分类',width: '10%',sort: true}
        ,{field:'mingcheng', title: '名称',width: '30%',templet: '#lianjie'}
       ,{field:'webaddress', title: '网站', width: '60%', minWidth: 200} //minWidth：局部定义当前单元格的最小宽度，layui 2.2.1 新增
       
     ]]
    ,page: true
    ,limit:10
  });
});
</script>
<script type="text/html" id="lianjie">
  <a target="_blank" href="{{d.webaddress}}" class="layui-table-link">{{d.mingcheng}}</a>
</script>
</body>
</html>