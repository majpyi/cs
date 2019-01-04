<%--
  Created by IntelliJ IDEA.
  User: M
  Date: 2018/12/19
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>a</title>
</head>
<body>
<%
    request.getRequestDispatcher("/b.jsp").forward(request,response);
%>
<h1>a</h1>
</body>
</html>
