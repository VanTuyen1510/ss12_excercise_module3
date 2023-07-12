<%@ page import="entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: TRAN
  Date: 02/07/2023
  Time: 8:22 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <h1>Student List</h1>
    <% List<Student> students = (List<Student>) request.getAttribute("studentList"); %>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Address</th>
            <th>LastYear</th>
        </tr>
        <% for (Student s: students) { %>
            <tr>
                <td><%= s.getId()%></td>
                <td><%= s.getName()%></td>
                <td><%= s.getAge()%></td>
                <td><%= s.getAddress()%></td>
                <td>
                    <%
                        if(s.getAge() >= 22){
                            %>Năm cuối<%
                        }else {
                            %>Không phải là số<%
                        }
                    %>
                </td>
            </tr> <%
        }
        %>
    </table>

</head>
<body>

</body>
</html>
