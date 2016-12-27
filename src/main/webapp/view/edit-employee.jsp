<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Yves
  Date: 12/26/2016
  Time: 5:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Employee</title>
</head>
<body>
    <h1>Edit Employee Details</h1>
    <form action="/update-employee" method="post">
        <p>
            Name: <input type="text" name="name" value="${employee.name}" placeholder="john" required>
            <form:errors path="name" cssClass="error"/>
        </p>
        <p>
            Salary: <input type="text" name="salary" value="${employee.salary}" placeholder="1000.00" required>
            <form:errors path="salary" cssClass="error"/>
        </p>
        <p>
            SSN: <input type="text" name="ssn" value="${employee.ssn}" placeholder="123" required>
            <form:errors path="ssn" cssClass="error"/>
        </p>
        <p>
            Date Joined: <input type="date" name="dateJoined" value="${employee.dateJoined}" placeholder="2016/12/26" required>
            <form:errors path="dateJoined" cssClass="error"/>
        </p>
        <p>
            <input type="submit" value="Submit">
            <input type="reset">
        </p>
    </form>
</body>
</html>
