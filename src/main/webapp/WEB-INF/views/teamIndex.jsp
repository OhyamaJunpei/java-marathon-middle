<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
プロ野球セントラル・リーグ一覧<br>

<c:forEach var="team" items="${teamList}">
  <a href="/team/detail/?id=${team.id}">
  <c:out value="${team.teamName}"/> <br>
  </a>
</c:forEach>

</body>
</html>