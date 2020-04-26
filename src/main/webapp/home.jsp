<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home.jsp</title>
</head>
    <body>
    Hello Spring Boot REST/ World Name=${name}
    <br>
<%--    <form action = "addAlien">--%>
<%--        aid: <input type = "text" name = "aid">--%>
<%--        <br>--%>
<%--        name: <input type = "text" name = "aname">--%>
<%--        <br>--%>
<%--        language: <input type = "text" name = "tech">--%>
<%--        <input type = "submit" value = "Submit">--%>
<%--        <br>--%>
<%--    </form>--%>
<%--    <form action = "getAlien">--%>
<%--        aid: <input type = "text" name = "aid">--%>
<%--        <br>--%>
<%--        <input type = "submit" value = "Submit">--%>
<%--        <br>--%>
<%--    </form>--%>
    <form action = "getManyAlien">
        technology: <input type = "text" name = "tech">
        <br>
        <input type = "submit" value = "Submit">
        <br>
    </form>
    </body>
</html>