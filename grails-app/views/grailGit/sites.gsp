<%--
  Created by IntelliJ IDEA.
  User: iguri
  Date: 05/03/2018
  Time: 11:59
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sitios</title>

    %{--<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">--}%
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.16/css/jquery.dataTables.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/responsive/2.2.1/css/responsive.bootstrap.min.css">


    <script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>

    <style>
    .highlightRed {
        background-color: #FF6347;
    }

    .highlightGreen {
        background-color: #9ACD32;
    }
    </style>

</head>

<body>

<section class="row colset-2-its">
    <table id="agenciesTable" class="table table-bordered" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
        </tr>
        </thead>
        <tbody>
        <g:each in="${sitesToReturn}" var="mySite">
            <tr data-url="/sites/${mySite.idSite}/categories" class="${(mySite.active == false) ? 'highlightRed' : 'highlightGreen'}">
                <td style="font-size: 15px"><strong>${mySite.idSite}</strong></td>
                <td style="font-size: 15px">${mySite.name}</td>
            </tr>
        </g:each>
        </tbody>
    </table>

</section>

<script type="text/javascript">
    $(document).ready(function () {
        $(function () {
            $('table.table tr').click(function () {
                window.location.href = $(this).data('url');
            });
        })
    });
</script>

</body>
</html>