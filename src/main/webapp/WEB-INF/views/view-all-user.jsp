<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<a href="${pageContext.request.contextPath}/signup/create">Create New User</a>
<table class="table table-hover">
	<tr bgcolor="#80acf2">
		<th>UserId</th>
		<th>UserName</th>
		<th>NRIC</th>
		<th>RoadName</th>
		<th>#</th>
	</tr>
	<c:if test="${!empty userList}">	
	<c:forEach var="user" items="${userList}" varStatus="counter">	
		<tr>
			<td>${user.userprofile.userId}</td>
			<td>${user.userprofile.name}</td>
			<td>${user.userprofile.nric}</td>
			<td>${user.address.roadName}</td>
			<td><a href="${pageContext.request.contextPath}/view/user/${user.userprofile.userId}">Details</a></td>
		</tr>
	</c:forEach>
	</c:if>
</table>
