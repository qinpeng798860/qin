<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/common/head.jsp"%>
    <title>Title</title>
</head>
<body>
<form action="${ctx}/book/queryBookList">
    <label>书本名称</label><input type="text" name="bookname"/>
    <input type="submit" value="提 交">
</form>

    <table border="1" cellspacing="0" cellpadding="0" style="width: 900px;">
        <tr>
            <th>id</th>
            <th>书籍名称</th>
            <th>价格</th>
            <th>类型</th>
            <th>图片</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.bookname}</td>
                <td>${book.price}</td>
                <td>${book.booktype}</td>
                <td>
                    <c:if test="${empty book.photo}">
                        暂无图片
                    </c:if>
                    <c:if test="${not empty book.photo}">
                        <img src="">
                    </c:if>
                </td>
                <td>
                    <c:if test="${empty book.photo}">
                        <a href="${ctx}/upload/fileUpload?bookId=${book.id}">文件上传</a>
                    </c:if>
                    <c:if test="${not empty book.photo}">
                        <a href="${ctx}/upload/download?fileId=${book.photo}">文件下载</a>
                    </c:if></td>
            </tr>

        </c:forEach>

    </table>

</body>
</html>
