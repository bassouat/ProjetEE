<%@ page import="java.time.LocalDate" %><%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 16/11/2021
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% LocalDate date = LocalDate.now();
%>

<div>La date d'aujourd'hui est <%=date %>
</div>
<form action="${pageContext.request.contextPath}/PremiereServlet" method="post">
    <p><font color="red">${errorMessage}</font></p>
    Enter your name :<label>
    <input type="text" name="name"/>
</label> password :
    <input type="password" value="password"/><input type="submit" value="LOGIN"/>

</form>
</body>
</html>
