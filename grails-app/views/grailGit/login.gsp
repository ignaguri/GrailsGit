<%--
  Created by IntelliJ IDEA.
  User: iguri
  Date: 05/03/2018
  Time: 12:00
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>GrailsGit Login</title>
</head>

<body>

<h1 class="text-center">Login to Your Account</h1><hr><br>
<g:if test="${flash.message}">
    <div class="alert alert-danger">${flash.message}</div>
</g:if>
<form action="/grailGit/dataInput" class="center-block">
    <input class="center-block" type="text" name="user" placeholder="Username">
    <br>
    <input class="center-block" type="password" name="pass" placeholder="Password">
    <br>
    <input class="center-block" type="submit" name="login" class="submit" value="Login">
</form>

</body>
</html>