<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/2/2020
  Time: 5:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    ID<input name="id" value="${product.getId()}"><br>
    Name<input name="name" value="${product.getName()}"><br>
    Desc<input name="desc" value="${product.getDesc()}"><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>
