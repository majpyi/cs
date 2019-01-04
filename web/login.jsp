<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: M
  Date: 2018/12/19
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<h1>login</h1>
${msg }
<form action="<c:url value="/Login"/>" method="post">
    <input type="text" name="username"/>
    <input type="submit" value="login"/>
</form>
</body>
</html>
