<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${doAtmTitle}</h1>
        <p>目前帳戶餘額: ${acc.balance}</p>
        <form action="AtmController">
            <p>
                balance:
                <input type="text" name="amount" value="1000"/>
                <input type="hidden" name="operation" value="DoAtm"/>
                <input type="submit"/>
            </p>
        </form>
    </body>
</html>
