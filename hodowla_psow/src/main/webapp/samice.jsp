<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="pies" class="com.example.hodowla.domain.Pies" scope="session"/>
<jsp:useBean id="dane" class="com.example.hodowla.service.Dane" scope="application"/>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HODOWLA</title>
</head>
<body>
<h2>Oto Twoje samice:</h2>

<div>

    <c:forEach items="${dane.gethodowla()}" var="pies">
    <c:if test="${pies.getplec() == 'samica' }">
        <a href="pokazpies.jsp?id=${dane.gethodowla().indexOf(pies)}">
            <h2>${pies.getimie()}</h2>
        </a>
    </c:if>
    </c:forEach>

</div>
    <a href="hodowla.jsp">Wróć</a>
</body>
</html>
