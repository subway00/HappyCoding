<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${user}, 歡迎光臨 ATM</h1>
        <form action="AtmController">
            <p>
                Select an operation:
                <select name="operation">
                    <option>Deposit</option>
                    <option>Withdraw</option>
                </select>
            </p>
            <p><input type="submit"/></p>
        </form>
    </body>
</html>
