<%--
  Created by IntelliJ IDEA.
  User: hungt
  Date: 8/28/2020
  Time: 12:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index </title>
</head>
<body>
<form action="calculate" method="post">
    <input type="number" id="firstNumb" name="firstnNumb">
    <select name="operand">
        <option>+</option>
        <option>-</option>
        <option>*</option>
        <option>/</option>
    </select>
    <input type="number" id="secondNumb" name="secondNumb">
    <input type="submit">
</form>
</body>
</html>