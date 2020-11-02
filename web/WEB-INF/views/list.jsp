<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2020
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/products?action=create">Create new</a>
List Customer
<c:forEach items="${products}" var="product">
    <c:out value="${product.getId()}"></c:out>
    <c:out value="${product.getName()}"></c:out>
    <c:out value="${product.getDesc()}"></c:out>
<a href="/products?action=edit&id=${product.getId()}"> Edit</a>
</c:forEach>
</body>
</html>
