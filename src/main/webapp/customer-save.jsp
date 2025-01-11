<%--
  Created by IntelliJ IDEA.
  User: charithharsha
  Date: 2025-01-10
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer-Save</title>
</head>
<body>
<h1>Customer Save</h1>
<form action="customer-save" method="post">
    <label for="name">Name</label>
    <input type="text" name="name" id="name">

    <label for="address">Address</label>
    <input type="text" name="address" id="address">

    <label for="email">Email</label>
    <input type="text" name="email" id="email">

    <input type="submit" value="Save">
</form>
<%
    String message = request.getParameter("message");
    String error = request.getParameter("error");
%>

<%
    if (message != null) {
        %>
        <h1 style="color: greenyellow"><%= message %></h1>
        <%
            }
            if (error != null) {
        %>
        <h1 style="color: red"><%= error %></h1>
        <%
            }
        %>
</body>
</html>
