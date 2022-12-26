<%--
  Created by IntelliJ IDEA.
  User: 86187
  Date: 2022/12/22
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>主界面</title>
    <style>
        #head_{
            height: 100px;
            width: 100%;
            background-color: slategray;
        }
        #personFile{
            width: 80%;
            height: 90%;
            padding-top: 25px;
            margin-left: 85%;
        }
        #search{
            height: 70px;
            width: 100%;
            background-color: cornflowerblue;
        }
        #inner_s{
            /*width: 200px;
            height: 40px;
            padding-right: 70%;
            padding-top: 50%;*/
            width: 30%;
            padding-top:25px;
            padding-left: 45%;
        }
        #table{
            margin-left: 30%;
            margin-top: 30px;
        }
        td{
            text-align: center;
            height: 20px;
            width: 150px;
            border: black 1px solid;
            padding:1px;
        }
    </style>
    <script>
        function search(){
            let v = document.getElementById("fileId").value;
            window.location.href="stu_mainServlet?v=\""+v+"\"&id=${user.getU_id()}"
        }
    </script>
</head>
<body>

<div id="head_">
    <div id="personFile">
        学生姓名:<span>${user.getU_name()}</span><br>
        学生学号:<span>${user.getU_id()}</span>
    </div>
</div>


<div id="search">
    <div id="inner_s">
        <input type="text" style="font-size: 20px; height: 26px;width: 190px" id="fileId">&nbsp;&nbsp;
        <button  style="font-size: 18px; height: 28px;" onclick="search()">查询</button>
    </div>
</div>

<div>
    <table id="table" style="height: 30px;width: 700px;border: black 1px solid;border-collapse:collapse;">
        <tr >
            <td>课程id</td>
            <td>课程名称</td>
            <td>任教老师</td>
            <td>查看成绩</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${arr}" var="item">
            <tr>
                <td>${item.getC_id()}</td>
                <td>${item.getC_name()}</td>
                <td>${item.getC_teacher()}</td>
                <td><button style="color: chocolate">查看成绩</button></td>
                <td><button style="color: chocolate">提交</button>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

<div>


</div>


</body>
</html>


