<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Task info</title>
</head>
<body>
<h2> Task info </h2>
<br>
<form:form action="saveTask" modelAttribute="task">

    <form:hidden path="id"/>

    Name <form:input path="name"/>
    <br><br>
    Info <form:input path="info"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>
