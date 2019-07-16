<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${doAtmTitle}</h1>
        <p>amount:${amount}</p>
        <p>new balance:${acc.balance}</p>
        
        <a href="index.jsp">回首頁</a>
    </body>
</html>
