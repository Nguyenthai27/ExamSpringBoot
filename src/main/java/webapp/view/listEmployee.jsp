<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer form</title>
</head>
<body>
<h1> List Customer</h1>

<table border="1">
    <tr>
        <th>STT</th>
        <th>Name</th>
        <th>Age</th>
        <th>Address</th>
    </tr>
    <c:forEach var="employee" items="${employee}" varStatus="loop">
        <tr>
            <td>${loop.index + 1}</td>
            <td>${employee.name}</td>
            <td>${employee.wage}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
