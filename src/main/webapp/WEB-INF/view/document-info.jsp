<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: AlexNoutbook
  Date: 27.05.2024
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Документ</title>
</head>
<body>
<h2>Документ</h2>
<br>
<form:form action="saveDocument" modelAttribute="document">
    <from:hidden path="id"/>
    Номер <form:input path="number"/>
    <form:errors path="number"/>
    <br><br>
    Дата документа(формат ДД.ММ.ГГГГ) <form:input path="date"/>
    <form:errors path="date"/>
    <br><br>
    Департамент <form:input path="department"/>
    <form:errors path="department"/>
    <br><br>
    Тип документа <form:input path="type"/>
    <form:errors path="type"/>
    <br><br>

    <input type="submit" value="OK">
</form:form>


</body>
</html>
