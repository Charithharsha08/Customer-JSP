<%--
  Created by IntelliJ IDEA.
  User: charithharsha
  Date: 2025-01-10
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Update</title>
</head>
<body>
<h1>Customer Update</h1>
<form action="customer-update" method="post">
  <label for="id">id</label>
  <input type="text" name="id" id="id">

  <label for="name">Name</label>
  <input type="text" name="name" id="name">

  <label for="address">Address</label>
  <input type="text" name="address" id="address">

  <label for="email">Email</label>
  <input type="text" name="email" id="email">

  <input type="submit" value="Update">
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
