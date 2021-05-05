<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ include file="header.jsp" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
            crossorigin="anonymous"></script>
</head>

<body>

<table class="table table-dark container">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Şəkil</th>
        <th scope="col">Məhsulun linki</th>
        <th scope="col">Qiymət</th>
        <th scope="col">Sayı</th>
        <th scope="col">Rəng</th>
        <th scope="col">Ölçü</th>
        <th scope="col">status</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="order" items="${orders}">
        <tr>
            <td>${order.orderNumber}</td>
            <td><img src="${order.link}" class="img-fluid img-thumbnail"></td>
            <td style=" font-size: xx-small;width: 20px;line-break: anywhere;"><a href="${order.link}"
                                                                                  target="_blank"></a>${order.link}</td>
            <td>${order.orderdetailDTO.price}</td>
            <td>${order.orderdetailDTO.count}</td>
            <td>${order.orderdetailDTO.color}</td>
            <td>${order.orderdetailDTO.size}</td>
            <td>${order.status}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>

</html>
