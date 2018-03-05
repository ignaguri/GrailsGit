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
    <title>Categoría</title>
</head>

<body>
<div class="row">
    <div class="page-header">
        <h1>Categoría</h1>
    </div>
    <div class="col-md-12">
        <ul>
            <li>Nombre: ${category.name}</li>
            <li>Site: ${category.site}</li>
            <li>Image: <a href="${category.urlImage}">${category.urlImage}</a></li>
            <li>Visits: ${category.visits}</li>
        </ul>
    </div>
</div>
</body>
</html>