<%-- 
    Document   : Welcome
    Created on : 2019/7/9, 上午 09:39:44
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Wellcome
            <br>
            <c:if test="${user != null}">
                ${user}
            </c:if>
            !
        </h1>
        <a href="index.jsp">回首頁</a>
    </body>
</html>
