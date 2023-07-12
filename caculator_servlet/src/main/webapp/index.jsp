
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <h1>
    <form method="post" action="/calculate">
         <fieldset>
           <legend>Caculator</legend>
           <table>
             <tr>
               <td>First operand :</td>
               <td><input name="first-operand" type="text"></td>
             </tr>
             <tr>
               <td>Operator: </td>
               <td>
                 <select name="operator">
                   <option value="+">Addition</option>
                   <option value="-">Subtraction</option>
                   <option value="*">Multiplication</option>
                   <option value="/">Division</option>
                 </select>
               </td>
             </tr>
             <tr>
               <td>Second operand:</td>
               <td><input name ="second-operand" type="text"/></td>
             </tr>
             <tr>
               <td></td>
               <td><input type="submit" value="Caculate"/></td>
             </tr>
           </table>
         </fieldset>
    </form>
  </h1>
  </body>
</html>
