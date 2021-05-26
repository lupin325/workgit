<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<script type="text/javascript">
    window.location.href = "${pageContext.request.contextPath}/main";
</script>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello=== Servlet</a>
</body>
</html>