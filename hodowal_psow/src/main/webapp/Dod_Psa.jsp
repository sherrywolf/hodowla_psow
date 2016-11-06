<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="dane" class="hodowla.Dane" scope="application"/>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>HODOWLA</title>
</head>

<body>

<article>
    <h1>Dodaj psa:</h1>

        <form action="dodaj.jsp">
            <div>
                <label for="imie">Imie</label>
                <input id="imie" type="text" name="imie" required/>
            </div>
            <div>
                <label for="rok">Rok urodzenia:</label>
                <input id="rok" type="number" name="rok" value="" min="1990" max="2017" required/>
            </div>
                <label for="plec">Płeć</label>
                <select id="plec" name="plec">
                    <option>samica</option>
                    <option>samiec</option>
                </select>
            <div>
                <label for="zdjUrl">Link zdjęcia</label>
                <input id="zdjUrl" type="url" name="zdjUrl" value="" required/>
            </div>
            <div>
                <a href="hodowla.jsp">Wróć</a>
                <input type="submit" value="Dodaj">
            </div>
        </form>

</article>
</body>
</html>