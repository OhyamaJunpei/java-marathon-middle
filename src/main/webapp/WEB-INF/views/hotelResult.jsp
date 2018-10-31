<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/hotel/result" method="post">

ホテル検索<br>
一泊料金:
<input type="text" name="price">
円以下<br>
<input type="submit" value="検索">
<br>

<c:forEach var="hotel" items="${hotelList}">
<table border="1">
	<tr>
		<td>名前：</td>
		<td><c:out value="${hotel.hotelName}"/></td>
  	</tr>
  	<tr>
  		<td>最寄り駅：</td>
  		<td><c:out value="${hotel.nearestStation}"/></td>
 	</tr>
 	<tr>
 		<td>価格：</td>
 		<td><c:out value="${hotel.price}"/></td>
 	</tr>
 </table>  
</c:forEach>


</form>
</body>
</html>