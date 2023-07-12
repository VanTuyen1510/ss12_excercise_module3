<%--
  Created by IntelliJ IDEA.
  User: TRAN
  Date: 09/07/2023
  Time: 1:38 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<form action="/student_servlet" method="post">--%>
<%--    tạo action ghi đè đường link hiện tại và ko cần tạo input= hidden ,nó lấy đường link action=create--%>
<form method="post" action="/student_servlet">

    <table border="1">
        <tr>
            <th>Name</th>
            <th>Date of birth</th>
        </tr>
        <td><input type="text" name="name" id="name" ></td>
        <td><input type="text" name="dateOfBirth"  id="dateOfBirth" > </td>
        </tr>


            <input type="hidden" name="actionUser" value="create">
        <%--Gán actionUser vào input=hidden--%>
<%--        <input type="text" name="nameStudent">--%>
        <input type="submit" value="Register">

    </table>
</form>
</body>
</html>
