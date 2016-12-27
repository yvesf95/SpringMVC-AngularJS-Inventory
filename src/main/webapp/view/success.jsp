<%--
  Created by IntelliJ IDEA.
  User: Yves
  Date: 12/22/2016
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success</title>
</head>
<body>
    <h1>Successful Insert</h1>
    <p>Employee Name: ${employee.name}</p>
    <p>Employee Salary: ${employee.salary}</p>
    <p>Date Joined: ${employee.dateJoined}</p>
    <p>SSN: ${employee.ssn}</p>
    <p><a href="/home">Return to Home</a></p>
    <p><a href="/employees">View All Employees</a></p>
    <p><a href="/view/add-employee.jsp">Add New Employee</a></p>
</body>
</html>
