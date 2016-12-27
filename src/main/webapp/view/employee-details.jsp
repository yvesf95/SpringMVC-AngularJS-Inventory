<%--
  Created by IntelliJ IDEA.
  User: Yves
  Date: 12/26/2016
  Time: 6:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee Details</title>
</head>
<body>
    <h1>Employee Details</h1>
    <p>Employee Name: ${employee.name}</p>
    <p>Employee Salary: ${employee.salary}</p>
    <p>Date Joined: ${employee.dateJoined}</p>
    <p>SSN: ${employee.ssn}</p>
    <p><a href="/home">Return to Home</a></p>
    <p><a href="/edit-employee/${employee.id}">Edit</a></p>
    <p><a href="/delete-employee/${employee.id}">Delete</a></p>
    <p><a href="/employees">View All Employees</a></p>
</body>
</html>
