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
			<th width="5%">用户名</th>
			<th width="10%">商品名</th>
			<th width="10%">时间</th>

		</tr>


		<c:forEach items="${q.list }" var="u">
			<tr>
				<td><p>${u.username }</p></td>
				<td><p>${u.name }</p></td>
				<td><p>${u.looktimes }</p></td>


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