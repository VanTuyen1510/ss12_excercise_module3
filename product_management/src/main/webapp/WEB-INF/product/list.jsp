<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Product</h1>
<table border="1">
<%--   int id, String name, int price, String describe, String origin, Date dateRelease--%>
    <tr>
       <th>ID</th>
       <th>Name</th>
       <th>Price</th>
       <th>Describe</th>
       <th>Origin</th>
       <th>Date release</th>
    </tr>
    <c:forEach items="${products}" var="p">
        <tr>
            <td>${p.id}</td>
            <td>${p.name}</td>
            <td>${p.price}</td>
            <td>${p.describe}</td>
            <td>${p.origin}</td>
            <td>
                <fmt:formatDate value="${p.dateRelease}" pattern="dd/MM/yyyy"/>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
