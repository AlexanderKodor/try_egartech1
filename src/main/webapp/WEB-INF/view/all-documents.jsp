<%--
  Created by IntelliJ IDEA.
  User: AlexNoutbook
  Date: 27.05.2024
  Time: 19:51
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список документов</title>
</head>
<body>
<h2>Список документов</h2>

<br><br>
<table>
    <tr>
        <th>Номер</th>
        <th>Дата</th>
        <th>Тип</th>
        <th>Отдел</th>
    </tr>

    <c:forEach var="doc" items="${allDocuments}">
                <c:url var="updateButton" value="/updateInfo">
                    <c:param name="docId" value="${doc.id}"/>
                </c:url>

                <c:url var="deleteButton" value="/deleteDocument">
                    <c:param name="docId" value="${doc.id}"/>
                </c:url>
        <tr>
            <td>${doc.number}</td>
            <td>${doc.date}</td>
            <td>${doc.department}</td>
            <td>${doc.type}</td>
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
<input type="button" value="add" onclick="window.location.href = 'addNewDocument'">
    


</body>
</html>
