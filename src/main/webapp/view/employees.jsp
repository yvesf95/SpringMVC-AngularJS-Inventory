<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yves
  Date: 12/22/2016
  Time: 12:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List of Employees</title>
</head>
<body>
    <h1>List of Employees</h1>
    <p><a href="/home">Home</a></p>
    <a href="/view/add-employee.jsp">Add new Employee</a>
    <c:if test="${empty employees}">
        <h2>No Employees found.</h2>
    </c:if>
    <c:if test="${!empty employees}">
        <table>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Employee Name</th>
                    <th>Employee Salary</th>
                    <th>Employee SSN</th>
                    <th>Date Joined</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${employees}" var="employee">
                    <tr>
                        <td>${employee.id}</td>
                        <td>${employee.name}</td>
                        <td>${employee.salary}</td>
                        <td>${employee.ssn}</td>
                        <td>${employee.dateJoined}</td>
                        <td><a href="/edit-employee/${employee.id}">Edit</a></td>
                        <td><a href="/delete-employee/${employee.id}">Delete</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</body>
</html>
