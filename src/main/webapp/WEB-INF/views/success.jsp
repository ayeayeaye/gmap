<link href="${pageContext.request.contextPath}/css/style.css" rel="STYLESHEET" type="text/css">

		<div class="container successcenter" align="center">
			<h1> Registration successful</h1>
			<br><br>
				<img src="<%= request.getContextPath()%>/logo/mark.png" width="150px" height="120px">
			<br><br>
				<h4>You have successfully completed the registration for user <b>${userName}</b>.</h4>
				<h4>Please check your email and we have been sent you all registration details.</h4>
				Click <a href="${pageContext.request.contextPath}/signup/create" >here</a> to sign up another user. 
				OR<a href="${pageContext.request.contextPath}/view/all/user" class="footer">View</a>all user.
		</div>	

		

