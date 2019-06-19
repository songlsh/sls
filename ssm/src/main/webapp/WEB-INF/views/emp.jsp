<%--
  Created by IntelliJ IDEA.
  User: LJ
  Date: 2019/6/16
  Time: 13:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--${emplist}--%>
<html>
<head>
    <title>员工列表</title>
</head>
<body>
    <table>
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>email</td>
            <td>性别</td>
        </tr>
        <c:forEach items="${emplist}" var="empss">
            <tr>
                <td>${empss.id}</td>
                <td>${empss.empname}</td>
                <td>${empss.email}</td>
                <td>
                    <c:if test="${empss.general eq '0'}">女</c:if>
                    <c:if test="${empss.general eq '1'}">男</c:if>
                </td>
            </tr>

        </c:forEach>

    </table>
</body>
</html>
