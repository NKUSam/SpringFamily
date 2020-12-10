<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>首页</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(
            $(function () {
                $("button").click(function () {
                    // alert("button alert...")
                    $.ajax(
                        {
                            // url:"returnVoidAjax.do",
                            // url:"mvcReturn.do",
                            // url:"mvcReturnArray.do",
                            url:"returnString.do",
                            // data:{
                            //     name:"张三",
                            //     age:23
                            // },
                            type:"post",
                            // dataType:"json",
                            success:function (resp) {
                                // alert(resp.name+"   "+resp.age);
                                // alert(resp)
                                // alert(resp[0].name+" "+resp[0].age);
                                // alert(resp[1].name+" "+resp[1].age);
                                // $.each(resp,function (i,n) {
                                //     alert(n.name+" "+n.age);
                                // })

                                alert(resp);
                            }
                        }
                    )
                })
            })
        )
    </script>
</head>
<body>
    <h2>
        <a href="/SpringMVC/one.do">Hello World!</a>
    </h2>

    <form action="/SpringMVC/one.do" method="post">
        姓名：
        <input type="text" name="name"/>
        <br/>
        密码：
        <input type="password" name="pwd">
        <br/>
        <input type="submit" value="提交">
    </form>
    <br/>
    <form action="/SpringMVC/two.do" method="post">
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
    <br/>
    <button id="btn">发起AJAX请求</button>
</body>
</html>