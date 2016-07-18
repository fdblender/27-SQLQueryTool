<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Get SQL Statement</title>
<jsp:include page="bootstrap.jsp"></jsp:include>
</head>
<body>

	<h2>Enter your SQL query:</h2>

	<form action="ProcessSQL" method="get">
		<input type="text" name="query" id="query" value=""></input> 		
		<input type="submit" name="submit" id="submit" value="Submit"></input>
	</form>

</body>
</html>