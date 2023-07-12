<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: TRAN--%>
<%--  Date: 02/07/2023--%>
<%--  Time: 8:12 CH--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student list</title>
</head>
<body>
<h1>Student list - JSTL</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
        <th>LastYear</th>
    </tr>
    <c:forEach items="${studentList}" var="s">
        <tr>
            <td><c:out value="${s.id}"></c:out></td>
            <td>${s.name}</td>
            <td>${s.age}</td>
            <td>${s.address}</td>
            <td>
                <c:if test="${s.age >= 22}">
                    Năm cuối
                </c:if>
                <c:if test="${s.age < 22}">
                    Không phải năm cuối
                </c:if>
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>

