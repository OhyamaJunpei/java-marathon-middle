<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form modelAttribute="clothesForm" action="${pageContext.request.contextPath}/clothes/search">

<form:radiobutton path="gender" label="Man" value="0"/><br>
<form:radiobutton path="gender" label="Woman" value="1"/>


<form:select path="color" items="${colorMap}" />

<input type="submit" value="検索">

</form:form>
</body>
</html>