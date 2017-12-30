<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>My jsp 'index.jsp' start page</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/test/selectAll" method="post">
    <input type="submit" value="查询">
</form>
<%--<form action="${pageContext.request.contextPath}/test/register.do" method="post">--%>
    <%--年龄: <input type="text" name="age"><br>--%>
    <%--<input type="submit" value="登陆">--%>
<%--</form>--%>
</body>
</html>