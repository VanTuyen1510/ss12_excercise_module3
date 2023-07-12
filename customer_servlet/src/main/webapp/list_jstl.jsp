<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer-List</title>
    <style>
        *{
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }
        table{

           margin: 0 auto;
           border:8px solid #81ecec;
           border-radius: 10px;

        }

        img{
            width: 100px;
            height: 100px;
        }
        tr,td{
            padding: 20px;
            border-bottom: 1px solid #b2bec3;
        }


    </style>
</head>
<body>
<div id="wrapper">
    <table>
        <caption align="top" style="text-align: center">DANH SÁCH KHÁCH HÀNG</caption>
        <tr >
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Đất nước</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach items="${customerList}" var="s">
            <tr >
                <td>${s.name}</td>
                <td>${s.dateOfBirth}</td>
                <td>${s.address}</td>
                <td><img src="${s.image}" alt=""></td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>
</html>
