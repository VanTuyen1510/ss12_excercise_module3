<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
     <form action="/productServlet" method="post">
         <div>List Price</div>
         <div>
             <input type="text" name="listPrice">
         </div>
         <div>Discount Percent</div>
         <div>
             <input type="text" name="discountPercent">
         </div>
         <input type="submit" value="discountAmount">
     </form>
</body>
</html>