<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All Tasks</title>
</head>
<body>
<h2> All Tasks </h2>
<br>
<table>
    <tr>
        <th>Name</th>
        <th>Info</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="tsk" items="${tasks}">

        <c:url var="updateButton" value="/updateTask">
            <c:param name="taskId" value="${tsk.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/deleteTask">
            <c:param name="taskId" value="${tsk.id}"/>
        </c:url>

        <tr>
            <td>${tsk.name}</td>
            <td>${tsk.info}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href = '${updateButton}'">
                <input type="button" value="Delete" onclick="window.location.href = '${deleteButton}'">
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Add" onclick="window.location.href = 'addNewTask'"/>
</body>
</html>
