<%@ page import="java.util.List" %>
<%@ page import="entities.Product" %><%--
  Created by IntelliJ IDEA.
  User: chebihifaycal
  Date: 20/2/2023
  Time: 12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List of Products</title>
</head>
<body>
    <table>
        <tr>
            <th>Label</th>
            <th>Price</th>
            <th>Quantity</th>
        </tr>
        <c:forEach items="${products}" var="p">
            <tr>
                <td>${p.label}</td>
                <td>${p.price}</td>
                <td>${p.quantity}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
