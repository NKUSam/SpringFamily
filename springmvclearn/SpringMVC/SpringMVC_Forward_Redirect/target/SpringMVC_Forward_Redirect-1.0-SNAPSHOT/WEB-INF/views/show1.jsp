<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>测试forward</title>
</head>
<body>
    <p>name:${myName}</p>
    <p>age:${myAge}</p>
</body>
</html>
