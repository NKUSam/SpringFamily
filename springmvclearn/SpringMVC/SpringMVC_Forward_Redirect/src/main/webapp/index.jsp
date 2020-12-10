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
    <div align="center">
        <form action="student/testForward.do" method="post">
            姓名：<input type="text" name="name"/><br/>
            年龄：<input type="text" name="age"/><br/>
            <input type="submit" value="开始测试">
        </form>
    </div>
    <br/>
    <hr/>
    <br/>
    <div align="center">
        <form action="student/testRedirect.do" method="get">
            姓名：<input type="text" name="name"/><br/>
            年龄：<input type="text" name="age"/><br/>
            <input type="submit" value="开始测试">
        </form>
    </div>
</body>
</html>