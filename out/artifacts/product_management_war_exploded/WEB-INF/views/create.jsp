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
<p>
    <a href="/products">Back to customer list</a>
</p>
<c:out value="${message}"></c:out>
<form method="post">
    ID<input name="id" value=""><br>
    Name<input name="name" value=""><br>
    Desc<input name="desc" value=""><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
