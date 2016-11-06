<%@ page import="com.example.hodowla.domain.Pies" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dane" class="com.example.hodowla.service.Dane" scope="application"/>
<% int id = Integer.parseInt(request.getParameter("id"));
    Pies pies = dane.gethodowla().get(id);
    pageContext.setAttribute("pies", pies);%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="static/style.css">
    <title>HODOWLA</title>
</head>
<body>
    <h2 class="nagl">Szczegóły o ${pies.getimie()}!</h2>
            <div class="index">
                <img src="${pies.getzdjUrl()}"/><br>
                <span> Rok urodzenia: ${pies.getrok()} </span><br>
                <span> Płeć: ${pies.getplec()} </span>

                <br><br><br><a href='hodowla.jsp' class="button">Wróć </a>
                <a href='Ed_Psa.jsp?id=${dane.gethodowla().indexOf(pies)}' class="button">Edytuj </a>
                <a href='Us_Psa.jsp?id=${dane.gethodowla().indexOf(pies)}' class="button">Usuń </a>
            </div></body>
</html>
