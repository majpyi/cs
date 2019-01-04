<%--
  Created by IntelliJ IDEA.
  User: M
  Date: 2019/1/2
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>234324234</p>
<a href="<c:url value='/show?method=query'/>">2</a><br/>
<a href="<c:url value='/AAServlet?name=张三'/>">1</a><br/>
<form action="<c:url value='/show'/>" method="post" accept-charset="UTF-8">
    用户名：<input type="text" name="method" value="query"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
