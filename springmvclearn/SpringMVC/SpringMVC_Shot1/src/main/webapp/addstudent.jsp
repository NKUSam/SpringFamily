<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>注册页面</title>
</head>
<body>
    <div align="center">
        <form action="student/add.do" method="post">
            <table style="border-style: solid;">
                <tr>
                    <td>姓名</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>年龄</td>
                    <td><input type="text" name="age"></td>
                </tr>
                <tr align="center">
                    <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                    <td><input type="submit" value="提交"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
