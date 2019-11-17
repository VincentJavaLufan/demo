<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="js/easyui/themes/bootstrap/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
	
	<!-- jquery要在easyui之前加载 -->
	<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript">
		$(function(){
			var url="${url}";
			var title="${title}";
			if(url != "" && title != ""){
				add_tab(url,title);
			}
		})
		
		function add_tab(url,title){
			// add a new tab panel  
			var b = $('#tt').tabs('exists',title);
			if(!b){
				$('#tt').tabs('add',{    
				    title:title,    
				    href:url,    
				    closable:true,    
				    tools:[{    
				        iconCls:'icon-mini-refresh',    
				        handler:function(){    
				            alert('refresh');    
				        }    
				    }]    
				});
			}else{
				$('#tt').tabs('select',title);
			}
		}
		
		function add_tab2(url,title){//异步加载
			// add a new tab panel    
			$.post(url,function(data){
				$('#tt').tabs('add',{    
				    title:title,    
				    content:data,    
				    closable:true,    
				    tools:[{    
				        iconCls:'icon-mini-refresh',    
				        handler:function(){    
				            alert('refresh');    
				        }    
				    }]    
				});
			});
		}
	</script>
<title>硅谷商城</title>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',title:'North',border:true" style="height:100px;background:green;padding:10px">硅谷商城</div>
	<div data-options="region:'west',title:'West',split:true,title:'West'" style="width:280px;padding:10px;">
		<div class="easyui-accordion" style="width:260px;height:300px">
			<div title="商品管理菜单" data-options="iconCls:'icon-ok'" >
				<ul>
					<li><a href="javascript:add_tab('goto_spu.do','商品信息管理')"><b>商品信息管理</b></a></li><br>
					<li><a href="javascript:add_tab('goto_attr.do','商品属性管理')"><b>商品属性管理</b></a></li><br>
					<li><a href="javascript:add_tab('goto_sku.do','商品库存单元管理')"><b>商品库存单元管理</b></a></li><br>
				</ul>
			</div>
			<div title="About" data-options="iconCls:'icon-ok'">
				<ul>
					<li>商品缓存管理</li>
				</ul>
			</div>
		</div>
	</div>
	<div data-options="region:'east',title:'East',split:true,collapsed:false,title:'East'" style="width:200px;padding:10px;">east region</div>
	<div data-options="region:'south',title:'South',border:false" style="height:150px;background:#A9FACD;padding:10px;">south region</div>
	<div data-options="region:'center',title:'Center'">
		<div id="tt" class="easyui-tabs" style="height:500px">

		</div>
	</div>
</body>
</html>