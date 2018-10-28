<%--
  Created by IntelliJ IDEA.
  User: HIAPAD
  Date: 2018/10/21
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试接受和返回json数据</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery.js"></script>
</head>
<body>
<script type="text/javascript">
    $(function(){
        $.ajax("${pageContext.request.contextPath}/user/json",{
            dataType : "json",
            contentType : "application/json",
            type : "post",
            data : JSON.stringify({fdId : 1,fdLoginName:"liwenchang"}),
            async : true,
            success : function(data){
                console.log(data);
            },
            error : function(){
                console.log("获取数据失败！");
            }
        });
    });
</script>
</body>
</html>
