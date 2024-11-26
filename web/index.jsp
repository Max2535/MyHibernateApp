<%--
  Created by IntelliJ IDEA.
  User: Max
  Date: 11/26/2024
  Time: 4:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.entity.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>User Management</title>
</head>
<body>
<form action="user" method="post">
  Name: <input type="text" name="username"/>
  Email: <input type="email" name="email"/>
  <button type="submit">Add User</button>
</form>
<table border="1">
  <thead>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="user" items="${users}">
    <tr>
      <td>${user.getId()}</td>
      <td>${user.getUsername()}</td>
      <td>${user.getEmail()}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>

