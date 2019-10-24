<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://org.wangxg/jsp/extl" prefix="e" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
${msg }   <!-- EL语言 -->
<br>
<br>
<form action="/em/addEmp.html" method="post">
  <table border="1" width="55%" align="center">
    <caption>
                员工${empty param.eid?'添加':'修改' }
       <hr width="160">           
    </caption>
    <tr>
      <td colspan="2">员工信息</td>
    </tr>
    <tr>
      <td>姓名</td>
      <td>
      <e:text defval="${ins.ename }" name="ename" autofocus="true" required="true"/>
      </td>
    </tr>
    <tr>
      <td>身份证</td>
      <td>
<e:text defval="${ins.enumber }" name="enumber" autofocus="true" required="true"/>
      </td>
    </tr>
    <tr>
      <td>性别</td>
      <td>
       <e:radio defval="${empty param.eid?'1':ins.esex }" name="esex" value="男:1,女:2" />
      </td>
    </tr>
    <tr>
      <td>生日</td>
      <td>
<e:date defval="${ins.esr }" name="esr" required="true"/>
    </tr>
    <tr>
    <td>民族</td>
    <td>
    <e:select defval="${ins.mz }" value="汉族:1,满族:2,蒙古族:3,藏族:4,维吾尔族:5" name="mz" style="height:26px;width:153px"/>
    </td>
    </tr>
    <tr>
      <td>薪资</td>
      <td>
        <e:number defval="${ins.esal }" step="0.1" name="esal" required="true"/>
      </td>
    </tr>
    <tr>
      <td>爱好</td>
      <td>
<e:groupbox defval="${ins.ah }" name="ah" value="琴:1,棋:2,书:3,画:4"/>
      </td>
    </tr>
    <tr>
      <td>备注</td>
      <td>
<e:textarea defval="${ins.ememo }" rows="5" cols="45" name="ememo"/>
      </td>
    </tr>
    <tr>
      <td colspan="2" align="center">
        <input type="submit" name="next" value="${empty param.eid?'添加':'修改' }" formaction="${pageContext.request.contextPath }/${empty param.eid?"add":"modify"}Emp.html">
         <input type="submit" name="next" value="返回" formaction="${pageContext.request.contextPath }/queryEmp.html" formnovalidate="formnovalidate">
      </td>
    </tr>
  </table>
 <input type="hidden" name="eid" value="${param.eid }">
 <e:hidden name="qename"/>
 <e:hidden name="qenumber"/>
 <e:hidden name="besal"/>
 <e:hidden name="eesal"/>
 <e:hidden name="qesex"/>
 <e:hidden name="qzm"/>
</form>
</body>
</html>