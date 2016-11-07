<%@ page import="com.example.hodowla.domain.Pies" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="dane" class="com.example.hodowla.service.Dane" scope="application"/>
<% int id = Integer.parseInt(request.getParameter("id"));
    Pies pies = dane.gethodowla().get(id);
    pageContext.setAttribute("pies", pies);
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="static/style.css">
    <title>HODOWLA</title>
</head>

<body>

<article>
    <h1 class="nagl">Edycja psa:</h1>

    <form action="edytuj.jsp" class="index">
        <input type="hidden" name="id" value="${dane.gethodowla().indexOf(pies)}"/>
        <div>
            <label for="imie">Imie:</label><br>
            <input id="imie" type="text" name="imie" value="${pies.getimie()}" class="pole" required/>
        </div>
        <div>
            <label for="rok">Rok urodzenia:</label><br>
            <input id="rok" type="number" name="rok" value="${pies.getrok()}" min="1990" max="2017" class="pole" required/>
        </div>
        <label for="plec">Płeć:</label><br>
        <select id="plec" name="plec" class="pole">
            <option>${pies.getplec()}</option>
        </select>
        <div>
            <label for="zdjUrl">Link zdjęcia:</label><br>
            <input id="zdjUrl" type="url" name="zdjUrl" value="${pies.getzdjUrl()}" class="pole" required/>
        </div>
        <div>
            <a href="pokazpies.jsp?id=${dane.gethodowla().indexOf(pies)}" class="button">Wróć</a>
            <input type="submit" value="Edytuj" class="button2">
        </div>
    </form>

</article>
</body>
</html>
