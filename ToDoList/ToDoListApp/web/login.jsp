<%-- 
    Document   : login
    Created on : Mar 9, 2017, 4:40:08 PM
    Author     : julien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login form</h1>
        <form method="POST" action="j_security_check">
            Username: <input type="text" name="j_username" />
            Password: <input type="password" name="j_password" />
            <input type="submit" value="Login"/>
            <input type="reset" value="Reset" />
        </form>
    </body>
</html>
