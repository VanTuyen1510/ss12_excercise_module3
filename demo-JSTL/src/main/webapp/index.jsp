<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--bắt đầu tiền tố c--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Student List</title>
  </head>
  <body>
  <h2>Student List</h2>
  <table>

      <tr>
        <th>No</th>
        <th>Id</th>
        <th>Name</th>
        <th>Date Of Birth</th>
        <th>Gender</th>
        <th>Grade</th>
      </tr>

<c:forEach var="studentObj" items="${studentListServlet}">
  <%--      var đại diện cho từng học viên , items đại diện cho 1 tập hợp,1 danh sách, dấu $ là biến của servlet gửi sang
      những cái gì lấy bên bên kia thì dùng dấu $--%>
    <tr>
      <td></td>
      <td><c:out value="${studentObj.id}"/></td>
      <td><c:out value="${studentObj.name}"/></td>
      <td><c:out value="${studentObj.dateOfBirth}"/></td>
      <td></td>
      <td></td>
    </tr>
</c:forEach>
  </table>
  </body>
</html>
