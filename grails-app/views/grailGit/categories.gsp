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
    <title>Categorías</title>
</head>

<body>
<div class="row">
    <div class="page-header">
        <h1>Categorías</h1>
    </div>
    <div class="col-md-12">
        <ul>
            <g:each var="c" in="${categories}">
                <li><a href="/grailGit/category/${c.id}">${c.name}</a</li>
            </g:each>
        </ul>
    </div>
</div>
</body>
</html>