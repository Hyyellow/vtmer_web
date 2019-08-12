<%--
  Created by IntelliJ IDEA.
  User: huang
  Date: 2019/8/12
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="user/selectAll">查找全部</a>
<form action="/interview/selectInterviewById" method="post">
    用户id：<input type="text" name="id"/><br/>
    <input type="submit" value="保存"/><br/>
</form>
</body>
</html>
