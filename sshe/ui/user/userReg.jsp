<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>欢迎注册</title>
	<link rel="stylesheet" href="<%=path%>/mystyle.css" type="text/css"></link>

<script type="text/javascript">
$(function(){
	$('#user_regDialog').dialog(
			$('#user_regForm').form({
			    url:'${pageContext.request.contextPath}/userAction!userReg.action',
			    success:function(data){
			        var obj = jQuery.parseJSON(data);
			        if(obj.success){
			        	$('#user_regDialog').dialog('close');
			        }
			        $.messager.show({
			            title:'提示',
			            msg:obj.msg,
			            timeout:5000,
			            showType:'slide'
			        });
			    }
			})
	).dialog('close');
});

$.extend($.fn.validatebox.defaults.rules, {
    eqpwd: {
        validator: function(value,param){
            return value == $(param[0]).val();
        },
        message: '两次输入密码不一致！'
    }
});

</script>

</head>
<body>
	<div id="user_regDialog" data-options="title:'注册',modal:true,buttons : [ {
		text : '注册',
		iconCls : 'icon-edit',
		handler : function() {
			$('#user_regForm').submit();
		}
	} ]">
		<form id="user_regForm" method="post">
			<table>
				<tr>
					<td class="a">用&nbsp;户&nbsp;&nbsp;名：</td>
					<td><input name="username" type="text"  class="easyui-validatebox textbox" data-options="required:true,missingMessage:'请输入用户名！',validType:'length[3,10]'" />
					</td>
				</tr>
				<tr>
					<td class="a">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</td>
					<td><input name="password" type="password"  class="easyui-validatebox textbox" data-options="required:true,missingMessage:'请输入密码！',validType:'length[3,10]'"  /></td>
				</tr>
				<tr>
					<td class="a">确认密码：</td>
					<td><input name="rpwd" type="password"  class="easyui-validatebox textbox" data-options="required:true,missingMessage:'请再次输入密码！',validType:'eqpwd[\'#user_regForm input[name=password]\']'  "  /></td>
				</tr>
			</table>
		</form>
	</div>
  </body>
</html>
