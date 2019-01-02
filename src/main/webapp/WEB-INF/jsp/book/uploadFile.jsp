<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp"%>
</head>
<body>
${bookId}

    <form action="${ctx}/upload/insertUpload" method="post" enctype="multipart/form-data">
        <input type="hidden" name="id" value="${bookId}">
        <input type="file" name="MultipartFile">
        <input type="submit" value="提 交">
    </form>
</body>
</html>
