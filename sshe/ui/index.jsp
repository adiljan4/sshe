<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>欢迎使用本系统</title>

<link rel="stylesheet" href="ui/easyui143/themes/bootstrap/easyui.css" type="text/css"></link>
<link rel="stylesheet" href="ui/easyui143/themes/icon.css" type="text/css"></link>

<script type="text/javascript" src="ui/easyui143/jquery.min.js"></script>
<script type="text/javascript" src="ui/easyui143/jquery.easyui.min.js"></script>
<script type="text/javascript" src="ui/easyui143/locale/easyui-lang-zh_CN.js"></script>

<link rel="stylesheet" href="<%=path%>/mystyle.css" type="text/css"></link>

</head>
<body >
<jsp:include page="user/userReg.jsp"></jsp:include>
<jsp:include page="user/userLogin.jsp"></jsp:include>
</body>
</html>
