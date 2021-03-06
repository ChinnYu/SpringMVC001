<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2018/7/25
  Time: 上午 04:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html >
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>用戶管理</title>
</head>
<body>
<h2>
    用戶管理
</h2>
<table width="100%" border="1">
    <tr>
        <th>編號</th><th>姓名</th><th>地址</th><th>電話</th><th>操作</th>
    </tr>

    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.address}</td>
            <td>${user.phone}</td>
            <td><a href="delete/${user.id}" class="del">刪除</a> </td>
        </tr>
    </c:forEach>

</table>
<p>
    <a href="add">新增</a>
</p>
<script>
    var items = document.querySelectorAll(".del");
    //console.log()
    for(var i = 0;i<items.length;i++){
        items[i].onclick = function () {
            return confirm("你確定要刪除嗎?");
        }
    }
</script>
</body>
</html>
