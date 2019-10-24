<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://org.wangxg/jsp/extl" prefix="e" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<% String path=request.getContextPath(); %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>Insert title here</title>
<style type="text/css">
     td{
         height:30px;
     }
   </style>
   <script type="text/javascript">
   function onEdit(obj){
	   var f=document.getElementById("myform");
	   f.action="<%=path%>/findByIdEmp.html?eid="+obj;
	   f.submit();  
   }
   
   </script>
   <script type="text/javascript">
   function onDel(obj){	 
	   var f=document.getElementById("myform");
	   f.action="<%=path%>/delByIdEmp.html?eid="+obj;
	   f.submit();
   }
   var count=0;
   function onSelect(obj){
	   obj?count++:count--;
	   document.getElementById("next2").disabled=(count==0);
	   document.getElementById("next3").disabled=(count==0);
	   document.getElementById("next4").disabled=(count==0);
   }
   </script>
   
</head>
<body>
${msg }
<form action="<%=path%>/queryEmp.html" method="post" id="myform">
<table border="1" align="center" width="98%">
<caption>
员工管理
</caption>

<tr>
<td colspan="4">查询条件</td>
</tr>
<tr>
<td>姓名</td><td><e:text name="qename" autofocus="true"/></td>
</tr>
<tr>
<td>身份证</td><td><e:text name="qenumber"/></td>
</tr>
<tr>
<td>薪资[B]</td><td><e:number step="0.1" name="besal"/></td>
<td>薪资[E]</td><td><e:number step="0.1" name="eesal"/></td>
</tr>
<tr>
    <td>性别</td>
    <td>
      <e:radio name="qesex" value="男:1,女:2,不限:''" defval=""/>
    </td>
    <td>民族</td>
    <td>
      <e:select value="汉族:1,满族:2,蒙族:3,藏族:4,维族:5" name="qmz"  
                header="true" style="height:26px;width:153px" />
    </td>
  </tr> 
</table>
<!-- 数据迭代区-->
<table border="1" align="center" width="98%">
<tr>
    <td></td>
    <td>序号</td>
    <td>姓名</td>
    <td>身份证</td>
    <td>性别</td>
    <td>生日</td>
    <td>薪资</td>
    <td>民族</td>
    <td></td>
  </tr> 
  
  
  <c:choose>
    <c:when test="${rows!=null }"> 
  
       <c:forEach items="${rows }" var="ins" varStatus="vs">
          <tr>
		    <td><input type="checkbox" name="idlist" value="${ins.eid }" onclick="onSelect(this.checked)"></td>
		    <td>${vs.count }</td>
		    <td><a href=# onclick="onEdit('${ins.eid}')">${ins.ename }</a></td>
		    <td>${ins.enumber }</td>
		    <td>${ins.cnesex }</td>
		    <td>${ins.esr }</td>
		    <td>${ins.esal }</td>
		    <td>${ins.cnmz }</td>
		    <td> <a href="#" onclick="onDel('${ins.eid}')">【删除】</a></td>
		  </tr> 
       </c:forEach>
       <!-- 补充空行 -->
       <c:forEach begin="${fn:length(rows) +1}" step="1" end="10">
		  <tr>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		  </tr> 
       </c:forEach>
    </c:when>  
    <c:otherwise>  <!-- else -->
       <c:forEach begin="1" step="1" end="10">   <!-- for -->
		  <tr>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		    <td></td>
		  </tr> 
       </c:forEach>
    </c:otherwise>  
  </c:choose>
  
  
</table>

<table border="1" align="center" width="98%">
<tr>
<td align="center">
<input type="submit" name="next" value="查询" id="next0"/>
<input type="submit" name="next" value="添加" id="next1" formaction="<%=path%>/addEmp.jsp">
<input type="submit" name="next" value="删除" id="next2" disabled="disabled" formaction="<%=path%>/batchDeleteEmp.html">
<input type="submit" name="next" value="退休" id="next3" disabled="disabled" formaction="<%=path%>/tuiXiuEmp.html">
<input type="submit" name="next" value="退休加钱" id="next4" disabled="disabled" formaction="<%=path%>/tuiXiuEmp2.html?money=500">
</td>
</tr>
</table>
</form>

</body>
</html>