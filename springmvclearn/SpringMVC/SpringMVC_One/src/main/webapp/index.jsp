<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>首页</title>
</head>
<body>
    <h2>
        <a href="/SpringMVC/test/one.do">Hello World!</a>
    </h2>

    <form action="/SpringMVC/test/param.do" method="post">
        姓名：
        <input type="text" name="name"/>
        <br/>
        密码：
        <input type="password" name="pwd">
        <br/>
        <input type="submit" value="提交">
    </form>

    <br/>
    <br/>
    <form action="/SpringMVC/test/objectparam.do" method="post">
        姓名：
        <input type="text" name="name"/>
        <br/>
        密码：
        <input type="password" name="pwd">
        <br/>
        <input type="submit" value="提交">
    </form>
</body>
</html>