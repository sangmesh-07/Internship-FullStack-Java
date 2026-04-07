<%@ page language="java" %>
<html>
<body>

<h2>JSP Scriptlet & Expression</h2>

<%
    int a = 10;
    int b = 20;
    int sum = a + b;
%>

<p>Sum is: <%= sum %></p>

</body>
</html>