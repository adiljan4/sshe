<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

<title>欢迎登陆</title>
<link rel="stylesheet" href="<%=path%>/mystyle.css" type="text/css"></link>

<script type="text/javascript">
$(function(){
	$('#user_loginForm').form({
	    url:'${pageContext.request.contextPath}/userAction!userLogin.action',
	    success:function(data){
	        var obj = jQuery.parseJSON(data);
	        if(obj.success){
	        	$('#user_loginDialog').dialog('close');
	        }
	        $.messager.show({
	            title:'提示',
	            msg:obj.msg,
	            timeout:5000,
	            showType:'slide'
	        });
	    }
	}); //user_loginForm end
	
});
</script>


</head>

<body>
     <div style="margin: 200px 0" >
  <div id="user_loginDialog"  class="easyui-dialog"  data-options ="title:'欢迎登陆',modal:true,buttons: [{
		    text:'登陆',
		    iconCls:'icon-ok',
		    handler:function(){
				$('#user_loginForm').submit();
		    }
	},{
		    text:'注册',
		    iconCls:'icon-edit',
		    handler:function(){
		       $('#user_regDialog').dialog('open');
		    }
	}]">
        <form id= "user_loginForm" method="post" >
  		<table>
  			<tr>
  				<td class="a" >用户名：</td>
  				<td><input name="username" type="text"  class="easyui-validatebox textbox" data-options="required:true,missingMessage:'请输入用户名！',validType:'length[3,10]'"  /></td>
  			</tr>
			<tr>
				<td class="a" >密&nbsp;&nbsp;&nbsp;码：</td>
				<td><input name="password" type="password"  class="easyui-validatebox textbox" data-options="required:true,missingMessage:'请输入密码！',validType:'length[3,10]'" />
				</td> 
			</tr>
		</table>
		</form>
  </div>
</div>
  </body>
</html>
