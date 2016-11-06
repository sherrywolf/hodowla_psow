<%@ page import="hodowla.Pies" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dane" class="hodowla.Dane" scope="application"/>
<% int id = Integer.parseInt(request.getParameter("id"));
    Pies pies = dane.gethodowla().get(id);
    pageContext.setAttribute("pies", pies);%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HODOWLA</title>
</head>
<body>
    <h2>Szczegóły o ${pies.getimie()}!</h2>
        <img src="${pies.getzdjUrl()}"/>
            <div>
                <span> Rok urodzenia: ${pies.getrok()} </span><br>
                <span> Płeć: ${pies.getplec()} </span>
            </div>
    <a href='hodowla.jsp'>Wróć </a>
    <a href='Ed_Psa.jsp?id=${dane.gethodowla().indexOf(pies)}'>Edytuj </a>
    <a href='Us_Psa.jsp?id=${dane.gethodowla().indexOf(pies)}'>Usuń </a>
</body>
</html>
