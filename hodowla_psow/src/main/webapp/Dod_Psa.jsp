<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="dane" class="com.example.hodowla.service.Dane" scope="application"/>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="static/style.css">
    <title>HODOWLA</title>
</head>

<body>

<article>
    <h1 class="nagl">Dodaj psa:</h1>

        <form action="dodaj.jsp" class="index">
            <div>
                <label for="imie">Imie:</label><br>
                <input id="imie" type="text" name="imie" class="pole" required/>
            </div>
            <div>
                <label for="rok">Rok urodzenia:</label><br>
                <input id="rok" type="number" name="rok" class="pole" value="" min="1990" max="2017" required/>
            </div>
                <label for="plec">Płeć:</label><br>
                <select id="plec" name="plec" class="pole">
                    <option>samica</option>
                    <option>samiec</option>
                </select>
            <div>
                <label for="zdjUrl">Link zdjęcia:</label><br>
                <input id="zdjUrl" type="url" name="zdjUrl" value="" class="pole" required/>
            </div>
            <div>
                <a href="hodowla.jsp" class="button">Wróć</a>
                <input type="submit" class="button2" value="Dodaj">
            </div>
        </form>

</article>
</body>
</html>