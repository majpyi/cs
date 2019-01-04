<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<body>
<a href="<c:url value='/ListenerServlet?method=contextOperation'/>">SevletContext操作属性</a>
<br/>
<a href="<c:url value='/ListenerServlet?method=sessionOperation'/>">HttpSession操作属性</a>
<br/>
<a href="<c:url value='/ListenerServlet?method=requestOperation'/>">ServletRequest操作属性</a> |
</body>
