<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 3/6/2023
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hcn</title>
</head>
<body>
    <form action="/HcnServlet">
        <h2>Thông tin hình chữ nhật</h2>
        <label>Chiều dài: </label>
        <input name="dai" value="dai">
        <label>Chiều rộng: </label>
        <input name="rong" value="rong">
        <button>Tính</button>
    </form>
</body>
</html>
