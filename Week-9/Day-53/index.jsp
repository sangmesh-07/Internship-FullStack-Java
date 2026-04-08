<%@ page language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>

<h2>JSTL Example</h2>

<c:set var="num" value="10"/>

<c:if test="${num > 5}">
    Number is greater than 5
</c:if>

<br><br>

<c:forEach var="i" begin="1" end="3">
    Value: <c:out value="${i}"/><br>
</c:forEach>

</body>
</html>