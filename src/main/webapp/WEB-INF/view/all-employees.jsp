<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All Employees</h2>
<br>

<table>
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Департамент</th>
        <th>Зарплата</th>
        <th>Операции</th>
    </tr>

    <c:forEach var="emp" items="${allEmps}">
<%--        <c:url var="updateButton" value="/updateInfo">--%>
<%--            <c:param name="empId" value="${emp.id}"/>--%>
<%--        </c:url>--%>

<%--        <c:url var="deleteButton" value="/deleteEmployee">--%>
<%--            <c:param name="empId" value="${emp.id}"/>--%>
<%--        </c:url>--%>
        <tr>
            <td>${emp.number}</td>
            <td>${emp.date}</td>
            <td>${emp.department}</td>
            <td>${emp.type}</td>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>
        </tr>
    </c:forEach>


</table>
<br>
<input type="button" value="add" onclick="window.location.href = 'addNewEmployee'">

</body>
</html>
