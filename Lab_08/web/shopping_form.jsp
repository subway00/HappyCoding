<%-- 
    Document   : shopping_form
    Created on : 2019/7/9, 下午 01:14:11
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
        <c:choose>
            <c:when test="${user != null}">
                <h1>歡迎光臨<br>${user},需要買點什麼?</h1>
                <form action="shopping_cart_view.jsp" method="POST">
                    <input type="checkbox" name="fruit" value="蘋果"/>蘋果
                    <input type="checkbox" name="fruit" value="香蕉"/>香蕉
                    <input type="checkbox" name="fruit" value="芭樂"/>芭樂
                    <input type="checkbox" name="fruit" valut="鳳梨"/>鳳梨
                    <br><br>
                    <input type="submit" value="送出"/>
                    <input type="reset" value="重製"/>
                </form>
            </c:when>
                <c:otherwise>
                尚未登入
                <br>
                <br>
                <a href="index.jsp">回首頁</a>
                </c:otherwise>
        </c:choose>
    </body>
</html>
