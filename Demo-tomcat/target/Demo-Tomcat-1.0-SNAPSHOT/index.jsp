<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 3/23/2021
  Time: 9:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/sum_servlet">
<%--<form action="sum_servlet.jsp">--%>
<%--    <input type="hidden" name="flag" value="sum2Number">--%>
    <div>Number 1:</div>
    <div>
        <input type="text" name="numberOne">
    </div>
    <div>Number 2:</div>
    <div>
        <input type="text" name="numberTwo">
    </div>
    <input type="submit" value="Sum">

</form>
</body>
</html>