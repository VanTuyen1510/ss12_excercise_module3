<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student List </title>
</head>
<body>
<h2>Student List</h2>
<a href="/student_servlet?actionUser=create">Create new Student</a>
<table border="1">
    <tr>
        <th>No</th>
        <th>Id</th>
        <th>Name</th>
        <th>Date of birth</th>
        <th>Gender</th>
        <th>Grade</th>
    </tr>
    <c:forEach var="studentObj" items="${studentListServlet}" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
                <%-- index bắt đầu từ 0, count là +1 --%>
            <td><c:out value="${studentObj.id}"></c:out></td>
            <td><c:out value="${studentObj.name}"></c:out></td>
            <td><c:out value="${studentObj.dateOfBirth}"></c:out></td>
            <td>
                <c:if test="${studentObj.gender == 1}">
                    Male
                </c:if>
                <c:if test="${studentObj.gender == 0}">
                    Female
                </c:if>
            </td>
            <td>
                <c:choose>
                    <%--choose giống switch case--%>
                    <c:when test="${studentObj.grade < 5}">
                        Bad
                    </c:when>
                    <c:when test="${studentObj.grade < 8}">
                        Good
                    </c:when>
                    <c:otherwise>
                        Very Good
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>




</table>
</body>
</html>