<%--
  Created by IntelliJ IDEA.
  User: 86187
  Date: 2022/12/23
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
        <title>登陆界面</title>
        <style>
            #frame{
                width: 400px;
                height: 350px;
                margin-left: 35%;
                margin-top: 10%;
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
        <label for="u_pwd1">确认密码:</label><input type="password" id="u_pwd1"><br><br>
        <label for="u_name">姓名:</label><input type="text" id="u_name"><br><br>
        <label for="u_phone">电话:</label><input type="text" id="u_phone"><br><br>
        <form name="f_radio" method="post">
            您的身份：<br>
            <input type="radio" name="r1" value=0>教师
            <input type="radio" name="r1" value=1 checked>学生
        </form>
        <button style="margin-left: 100px" id="bt">确定</button>
        <span id="success" style="color: red">${success}</span>
        <script>
            let bt=document.getElementById("bt");
            function check_answer(){
                for(let i=0; i<document.f_radio.r1.length; i++){
                    if(document.f_radio.r1[i].checked===true) {
                        return document.value = document.f_radio.r1[i].value;
                    }
                }
            }
            bt.onclick=function() {
                let id_str = document.getElementById("u_id").value;
                let pwd_str = document.getElementById("u_pwd").value;
                let pwd1_str = document.getElementById("u_pwd1").value;
                let name_str = document.getElementById("u_name").value;
                let phone_str = document.getElementById("u_phone").value;
                let t = check_answer();
                alert(t)
                if (id_str === "" || pwd_str === "" || pwd1_str === "" || name_str === "" || phone_str === "") {
                    alert("请输入完整信息！")
                    return;
                }
                if ((pwd_str !== pwd1_str)) {
                    alert("密码不一致，请重新输入！")
                    return;
                }
                //访问服务器
                window.location.href = "register?u_id=" + id_str + "&u_pwd=" + pwd_str + "&u_name=" + name_str + "&u_phone" + phone_str+"&u_role="+t;
                if (success) {
                    alert("注册成功！")
                } else {
                    alert("账号已存在！")
                }
            }
        </script>
    </div>
</div>
</body>
</html>
