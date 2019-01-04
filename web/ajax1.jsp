<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: M
  Date: 2018/12/7
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script>
        window.onload = function () {
            var b = document.getElementById("mjy");
            b.onclick = function () {
                var xmlHttp = new XMLHttpRequest();
                xmlHttp.open("GET", "<c:url value='/AServlet?username=小明'/>", true);
                xmlHttp.send(null);
                xmlHttp.onreadystatechange = function () {
                    if (xmlHttp.readyState === 4 && xmlHttp.status === 200) {
                        var text = xmlHttp.responseText;
                        var h1 = document.getElementById("h1");
                        h1.innerHTML = text;
                    }
                }
            }
        }
    </script>


</head>
<body>
<button id="mjy">mjy</button>
<h1 id="h1"></h1>
</body>
</html>
