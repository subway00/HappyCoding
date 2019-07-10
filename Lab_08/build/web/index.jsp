<%-- 
    Document   : index
    Created on : 2019/7/9, 上午 09:09:04
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
        <form action="ApplicationController1">
            <p>Select an operation:
                <select name="operation">
                    <option>Login</option>
                    <option>Shoppint</option>
                    <option>LogOut</option>
                </select>
            </p>
            <p><input type="submit"/></p>
        </form>
    </body>
</html>
