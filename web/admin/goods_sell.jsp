<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>客户浏览记录</title>
	<meta charset="utf-8"/>
	<link rel="stylesheet" href="css/bootstrap.css"/>
</head>
<body>
<div class="container-fluid">
	<jsp:include page="header.jsp"></jsp:include>



	<table class="table table-bordered table-hover">

		<tr>
			<th width="5%">商品名</th>
			<th width="10%">销售数量</th>
			<th width="12%">销售价格</th>
			<th width="14%">销售额</th>
			<th width="16%">销售时间</th>

		</tr>


		<c:forEach items="${w.sellhuoList }" var="u">
			<tr>
				<td><p>${u.name }</p></td>
				<td><p>${u.amount }</p></td>
				<td><p>${u.price }</p></td>
				<td><p>${u.amount*u.price*u.total }</p></td>
				<td><p>${u.datetime}</p></td>


			</tr>
		</c:forEach>


	</table>

	<br>
	<jsp:include page="/page.jsp">
		<jsp:param value="/admin/user_list" name="url"/>
	</jsp:include>
	<br>
</div>
</body>
</html>