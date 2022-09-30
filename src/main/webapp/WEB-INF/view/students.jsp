<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>

<body>
<h1>Students page</h1>

<ul>
    <c:forEach var="item" items="${students.students}">
        <li>${item.firstName}</li>
        <li>${item.lastName}</li>
    </c:forEach>
</ul>

</body>
</html>