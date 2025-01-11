<%--
  Created by IntelliJ IDEA.
  User: charithharsha
  Date: 2025-01-10
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Delete</title>
</head>
<body>
<h1>Customer Delete</h1>
<form action="customer-delete" method="post">
  <label for="id">Name</label>
  <input type="text" name="id" id="id">

  <input type="submit" value="Delete">
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
