<%-- 
    Document   : Login
    Created on : 2019/7/9, 上午 09:15:12
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>What's your name?</h1>
        <form action="ApplicationController"> 
            <p>
                Username:
                <input type="text" name="user"/>
            </p>
            <input type="hidden" name="operation" value="Login"/>
            <input type="submit" />
        </form>
    </body>
</html>
