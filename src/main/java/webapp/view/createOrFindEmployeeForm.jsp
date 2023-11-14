<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer form</title>
</head>
<body>

<form action="/employee/createOrFind" method="post" modelAttribute="employee">
    <input type="hidden" name="id" value="${employee.id}" />
    <input type="text" name="name" value="${employee.name}" />
    <input type="text" name="wage" value="${employee.wage}" />
    <input type="submit" value="submit" />     <input type="find" value="submit" />

</form>


</body>
</html>
