<%--
  Created by IntelliJ IDEA.
  User: HIAPAD
  Date: 2018/10/21
  Time: 10:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <form action="register" method="post">
        <table>
            <tr>
                <td>
                    <label>登录名：</label>
                </td>
                <td>
                    <input type="text" name="fdLoginName">
                </td>
            </tr>
            <tr>
                <td>
                    <label>密码：</label>
                </td>
                <td>
                    <input type="text" name="fdPassword">
                </td>
            </tr>
            <tr>
                <td>
                   <input type="submit" value="注册">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
