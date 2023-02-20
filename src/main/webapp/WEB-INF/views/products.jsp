<%--
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
    <script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
    <link rel="stylesheet"
          href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" />
</head>
<body>
    <div class="container-md mt-3">
        <form method="post" action="products">
            <div class="mb-3">
                <label for="labelexp" class="form-label">Label</label>
                <input type="text" class="form-control" name="label" id="labelexp">
            </div>
            <div class="mb-3">
                <label for="priceexp" class="form-label">Price</label>
                <input type="number" class="form-control" name="price" id="priceexp">
            </div>
            <div class="mb-3">
                <label for="quantityexp" class="form-label">Quantity</label>
                <input type="text" class="form-control" name="quantity" id="quantityexp">
            </div>

            <button type="submit" class="btn btn-primary">Save Product</button>
        </form>

        <table class="table table-hover">
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
    </div>

</body>
</html>
