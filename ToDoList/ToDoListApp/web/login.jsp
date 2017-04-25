<%--
    Document   : login
    Created on : Mar 9, 2017, 4:40:08 PM
    Author     : julien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="/ToDoListApp/faces/javax.faces.resource/css/app.css" />
    </head>
    <body>
        <div class="container">
            <form class="form-signin" action="j_security_check" method="POST">
                <h2 class="form-signin-heading">Please sign in</h2>
                <label for="j_username" class="sr-only">Email address</label>
                <input type="text" name="j_username" id="j_username" class="form-control" placeholder="username" required autofocus>
                <label for="j_password" class="sr-only">Password</label>
                <input type="password" name="j_password" id="j_password" class="form-control" placeholder="Password" required>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </form>
        </div>
    </body>
</html>
