<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%--@elvariable id="products" type="java"--%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css"/>
    <a href="/products/product-add">Добавить продукт</a>
</head>

<body>
<h1>Products ${name}</h1>

<ul>
    <c:forEach var="item" items="${products}">
        <li>ProductID=${item.id}; ProductTitle=${item.title}; ProductCost=${item.cost}</li>
    </c:forEach>

</body>
</html>