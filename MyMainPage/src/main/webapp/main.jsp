<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="/MyMainPage/layui/css/layui.css">
  <title>主页</title>
<script type="text/javascript"  src="js/L2Dwidget.min.js"></script>
<script type="text/javascript"  src="js/L2Dwidget.0.min.js"></script>

</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">双喜的练习页面</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="/MyMainPage/search.jsp" target="VIEW">双喜的搜索界面</a></li>
      <li class="layui-nav-item"><a href="">看直播~</a></li>
      <li class="layui-nav-item"><a>My书签</a>
      <dl class="layui-nav-child">
          <dd><a href="/MyMainPage/Address.jsp?0">全部</a></dd>
          <dd><a href="/MyMainPage/Address.jsp?1">游戏</a></dd>
          <dd><a href="/MyMainPage/Address.jsp?2">动漫</a></dd>
          <dd><a href="/MyMainPage/Address.jsp?3">科技</a></dd>
          <dd><a href="/MyMainPage/Address.jsp?4">学习</a></dd>
          <dd><a href="/MyMainPage/Address.jsp?5">其他</a></dd>
         
        </dl>
      </li>
      <li class="layui-nav-item">
        <a href="javascript:;">以后再想</a>
        <dl class="layui-nav-child">
          <dd><a href="">呵呵</a></dd>
          <dd><a href="">嘿嘿</a></dd>
          <dd><a href="">哈哈</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="login.do">
          后台管理登录
        </a>
      </li>
      <li class="layui-nav-item"><font color="red" size="2">${loginuser }</font></li>
      <li class="layui-nav-item"><a href="logout.do">退了</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
  
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">书签</a>
          <dl class="layui-nav-child">
            <dd><a target="_blank" href="http://www.bilibili.com">哔哩哔哩</a></dd>
            <dd><a href="/MyMainPage/addAddress.jsp">添加书签</a></dd>
            <dd><a href="/MyMainPage/mynote.jsp">我的随记</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
          <a href="javascript:;">以后再想</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">列表一</a></dd>
            <dd><a href="javascript:;">列表二</a></dd>
            <dd><a href="">超链接</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <iframe src="search.jsp" width="1700" height="100%" name="VIEW" ></iframe>
  </div>
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © 双喜拿来练习^(*￣(oo)￣)^
  </div>
</div>
<script src="/MyMainPage/layui/layui.js"></script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
});
</script>
<div id="live2d-widget">
<canvas id="live2dcanvas" width="300px" height="500px">
</canvas>
<script type="text/javascript">
L2Dwidget.init();
</script>
<script type="text/javascript">getFollowStatus('df91d846-448f-4c9a-c764-08d6b94b3063')</script>
</div>
</body>
</html>