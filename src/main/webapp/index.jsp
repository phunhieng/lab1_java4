<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<%--<h1>${an}</h1>--%>

    <form action="hello-servlet">
        <input value="name" name="ten">
        <button> Submit</button>
    </form>
</body>
</html>