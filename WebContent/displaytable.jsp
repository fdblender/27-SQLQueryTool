<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="en_US" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JDBC Query</title>
<jsp:include page="bootstrap.jsp"></jsp:include>
</head>
<body>
<h2>SQL Results</h2>
<table class="table table-bordered table-hover table-striped">
  <thead>
    <tr>
      <c:forEach items="${rows[0]}" var="column">
        <td><c:out value="${column.key}" /></td>
      </c:forEach>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${rows}" var="columns">
      <tr>
        <c:forEach items="${columns}" var="column">
          <td><c:out value="${column.value}" /></td>
        </c:forEach>
      </tr>
    </c:forEach>
  </tbody>
</table>

</body>
</html>