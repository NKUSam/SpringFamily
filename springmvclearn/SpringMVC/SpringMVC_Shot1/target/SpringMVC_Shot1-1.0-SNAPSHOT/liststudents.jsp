<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>学生列表</title>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            loadStudentInfo();


            $("#btn").click(function () {
                loadStudentInfo();
            })

            function loadStudentInfo() {
                $.ajax({
                        url:"student/selectStudents.do",
                        type:"get",
                        dataType:"json",
                        success:function (data) {
                            //清楚已有的数据
                            $("#info").html("");

                            // alert("data="+data);
                            $.each(data,function (i,n) {
                                $("#info").append("<tr>").
                                append("<td>"+n.id+"</td>").
                                append("<td>"+n.name+"</td>").
                                append("<td>"+n.age+"</td>").
                                append("</tr>")
                            })
                        }
                    }
                )
            }
        })
    </script>
</head>
<body>
    <div align="center">
        <table>
            <thead>
                <tr>
                    <td>学号：</td>
                    <td>姓名：</td>
                    <td>年龄：</td>
                </tr>
            </thead>
            <tbody id="info">
            </tbody>
            <tr>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </table>
        <input type="button" id="btn" value="查询数据">
    </div>
</body>
</html>
