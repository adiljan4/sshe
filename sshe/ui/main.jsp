<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎使用本系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
  <link rel="stylesheet" href="ui/easyui143/themes/bootstrap/easyui.css" type="text/css"></link>
  <link rel="stylesheet" href="ui/easyui143/themes/icon.css" type="text/css"></link>

<script type="text/javascript" src="ui/easyui143/jquery.min.js"></script>
<script type="text/javascript" src="ui/easyui143/jquery.easyui.min.js"></script>
<script type="text/javascript" src="ui/easyui143/locale/easyui-lang-zh_CN.js"></script>

  </head>
  
  <body >
   
    <div class="easyui-layout" style="width:100%;height:100%;">
        <div data-options="region:'north'" style="height:50px"></div>
        <div data-options="region:'south',split:true" style="height:25px;"></div>
        <div data-options="region:'east',split:true" title="East" style="width:200px;"></div>
        <div data-options="region:'west',split:true" title="West" style="width:200px;"></div>
        <div data-options="region:'center',title:'Main Title',iconCls:'icon-ok'">
            <table class="easyui-datagrid"
                    data-options="url:'datagrid_data1.json',method:'get',border:false,singleSelect:true,fit:true,fitColumns:true">
                <thead>
                    <tr>
                        <th data-options="field:'itemid'" width="80">Item ID</th>
                        <th data-options="field:'productid'" width="100">Product ID</th>
                        <th data-options="field:'listprice',align:'right'" width="80">List Price</th>
                        <th data-options="field:'unitcost',align:'right'" width="80">Unit Cost</th>
                        <th data-options="field:'attr1'" width="150">Attribute</th>
                        <th data-options="field:'status',align:'center'" width="60">Status</th>
                    </tr>
                </thead>
            </table>
        </div>
    </div>
   
  </body>
</html>
