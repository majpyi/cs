<%--
  Created by IntelliJ IDEA.
  User: M
  Date: 2018/12/19
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>error</title>
</head>
<body>
<%
    if (true)
        throw new RuntimeException("~~~~");
%>
</body>
</html>
