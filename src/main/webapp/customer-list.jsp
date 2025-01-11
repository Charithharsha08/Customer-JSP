<%@ page import="lk.ijse.customerjsp.CustomerDTO" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: charithharsha
  Date: 2025-01-10
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List </title>
</head>
<body>

<h1>Customer List</h1>

<% List<CustomerDTO> customerList = (List<CustomerDTO>) request.getAttribute("customerList"); %>

<table>
  <style>
    table{
      border-collapse: collapse;
      width: 100%;
    }
    table, th, td {
      border: 1px solid black;
    }
    th, td {
      padding: 8px;
      text-align: left;
    }
  </style>
  <thead>
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Address</th>
      <th>Email</th>
    </tr>
  </thead>
<tbody>
  <% for (CustomerDTO customer : customerList) { %>
    <tr>
      <td><%= customer.getId() %></td>
      <td><%= customer.getName() %></td>
      <td><%= customer.getAddress() %></td>
      <td><%= customer.getEmail() %></td>
    </tr>
  <% } %>
</tbody>
</table>
</body>
</html>
