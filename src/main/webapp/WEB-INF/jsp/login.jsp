<%--
  Created by IntelliJ IDEA.
  User: HIAPAD
  Date: 2018/10/20
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form action="login" method="post">
        <table>
            <tr>
                <td>
                    <label>登录名：</label>
                </td>
                <td>
                    <input type="text" name="loginName">
                </td>
            </tr>
            <tr>
                <td>
                    <label>密码：</label>
                </td>
                <td>
                    <input type="text" name="password">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="登录">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
