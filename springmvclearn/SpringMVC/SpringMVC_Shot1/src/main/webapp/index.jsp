<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>主页</title>
</head>
<body>
    <div align="center">
        <p>SSM整合的例子</p>
        <img src="images/mm.jpg">
        <table>
            <tr>
                <td><a href="addstudent.jsp">注册学生</a></td>
            </tr>
            <tr>
                <td><a href="liststudents.jsp">学生列表</a></td>
            </tr>
        </table>
    </div>
</body>
</html>
