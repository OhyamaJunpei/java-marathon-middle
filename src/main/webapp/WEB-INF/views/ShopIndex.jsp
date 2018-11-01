<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>洋服ショップ</h1>

<form:form modelAttribute="clothesForm" action="${pageContext.request.contextPath}/clothes/search">

<form:radiobutton path="gender" label="Man" value="1"/><br>
<form:radiobutton path="gender" label="Woman" value="0"/>

<form:select path="color" items="${colorMap}" />

<input type="submit" value="検索">

</form:form>

<!-- 検索結果 -->

<c:forEach var="clothes" items="${clothesList}">
<table border="1">
	<tr>
		<td>ジャンル</td>
		<td><c:out value="${clothes.genre}"/></td>
  	</tr>
  	<tr>
  		<td>サイズ</td>
  		<td><c:out value="${clothes.size}"/></td>
 	</tr>
 	<tr>
 		<td>価格</td>
 		<td><c:out value="${clothes.price}"/></td>
 	</tr>
 </table>  
</c:forEach>

</body>
</html>