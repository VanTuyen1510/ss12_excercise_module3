
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
</head>
<body>
<center>


    <h1>User Management</h1>
    <h2>
        <a href="/users?action=create">Add New User</a><br>
        <h2><a href="/users?action=sort">Sort User</a></h2>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <form method="post" action="/users">
                <label>Country Users:</label>
                <input type="text" name="country">
                <%-- name="name" là lấy thuộc tính--%>
                <input type="submit" value="SEARCH">
                <input type="hidden" name="action" value="search">
                <%--hidden là ẩn khi truyền action vào thì vào value "search" vào search để gọi hàm--%>
            </form>
        </tr>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>

                </td>
            </tr>
        </c:forEach>
        <br>

    </table>
</div>
</body>
</html>
