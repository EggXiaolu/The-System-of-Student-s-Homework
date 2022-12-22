<%--
  Created by IntelliJ IDEA.
  User: 86187
  Date: 2022/12/22
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
    <style>
        #frame{
            width: 400px;
            height: 200px;
            margin-left: 35%;
            margin-top: 20%;
            background: lightskyblue;
            border: black solid 2px;
        }
        #inner{
            margin-left: 20%;
            margin-top: 10%;
        }
    </style>

</head>
<body>
<div id="frame">
    <div id="inner">
        <label for="u_id">账号:</label><input type="text" id="u_id"><br><br>
        <label for="u_pwd">密码:</label><input type="password" id="u_pwd"><br><br>
        <button style="margin-left: 40px" id="bt_1">忘记密码</button><button style="margin-left: 40px" id="bt_2">登录</button>
        <span id="error"></span>
        <script>
            let bt2=document.getElementById("bt_2")
            bt2.onclick=function (){
                //检查输入是否为空
                let id_str = document.getElementById("u_id").value;
                let pwd_str = document.getElementById("u_pwd").value;
                if(id_str==null || pwd_str==null || id_str=="" || pwd_str==""){
                    alert("账号密码不能为空")
                    return;
                }
                //访问服务器
                window.location.href = "login?u_id="+id_str+"&u_pwd="+pwd_str
            }
        </script>
    </div>
</div>
</body>
</html>
