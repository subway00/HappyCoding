<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<!--        尚未登入時el是空，不顯示-->
        <h1>${welcome}</h1>
        <form action="ApplicationController">
            <p>Select an operation:
                <select name="operation">
                    <c:choose>
                        <c:when test="${user==null}">
                            <option>Login</option>
                        </c:when>
                        <c:otherwise>
                            <option>ATM</option>
                            <option>Logout</option>
                        </c:otherwise>
                    </c:choose>
                </select>
            </p>
            <p><input type="submit"/></p>
        </form>
    </body>
</html>
