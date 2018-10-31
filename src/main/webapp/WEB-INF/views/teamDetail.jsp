<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/team/index" method="post">
球団名<br>
<c:out value="${team.teamName}"/><br>
本拠地<br>
<c:out value="${team.headquarters}"/><br>
発足<br>
<c:out value="${team.inauguration}"/><br>
歴史<br>
<pre><c:out value="${team.history}"/></pre><br>


<input type="submit" value="戻る">
</form>
</body>
</html>