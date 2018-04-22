<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="${pageContext.request.contextPath}/css/style.css" rel="STYLESHEET" type="text/css">

<form:form action="${pageContext.request.contextPath}/signup/created" commandName="user" method="POST" cssClass="form" enctype="multipart/form-data" >

<table class="table">
	<tr align="center">
		<td colspan="3"><h2>Registration Form</h2><h6 class="required subtitle">These fields are required.</h6></td>
	</tr>
	<!-- Profile -->
	<tr class="title">
		<td colspan="3">Profile</td>
	</tr>
	<tr>
		<td><p class="subtitle  required">Name:<p></td>
		<td><div class="ansInput"><form:input path="userprofile.name" cssClass="form-control"/></div></td>
		<td><form:errors path="userprofile.name" cssStyle="color:red;"/></td>
	</tr>
	<tr>
		<td><p class="subtitle required">NRIC:<p></td>
		<td><div class="ansInput"><form:input path="userprofile.nric" cssClass="form-control"/></div></td>
		<%-- <td><form:errors path="userprofile.nric" cssStyle="color: red;" />${errorMsg}</td> --%>
		<td></td>
	</tr> 

	<!-- Contact -->
	<tr class="title">
		<td colspan="3">Contact</td>
	</tr>
	<tr>
		<td><p class="subtitle">Email:</p></td>
		<td><div class="ansInput"><form:input path="userprofile.email" cssClass="form-control"/></div></td>
		<td></td>
	</tr>
	<tr>
		<td><p class="subtitle required">Road Name:</p></td>
		<td><div class="ansInput"><form:input path="address.roadName" cssClass="form-control"/></div></td>
		<td></td>
	</tr>
	<tr>
		<td><p class="subtitle required">GPS Coordinates:</p></td>
		<td>
			<div class="ansInput">
			  <div class="row">
			    <div class="col-md-6">
					<form:input path="address.lat" cssClass="form-control"/>
			    </div>
			    <div class="col-md-6">
					<form:input path="address.longt" cssClass="form-control"/>
			    </div>
			 </div>
			</div>
		</td>
		<td></td>
	</tr>

	<!-- Photo -->
 	<tr class="title">
		<td colspan="3">Photo</td>
	</tr>
	<tr>
		<td><p class="subtitle required">NRIC:<p></td>
		<td><div class="ansInput"><input type="file" name="nricFile"  class="form-control" /></div></td>
		<td></td>	
	</tr>
	<tr>
		<td><p class="subtitle required">Face:<p></td>
		<td><div class="ansInput"><input type="file" name="faceFile"  class="form-control" /></div></td>
		<td></td>
	</tr>
	<tr>
		<td><p class="subtitle required">House:<p></td>
		<td><div class="ansInput"><input type="file" name="houseFile"  class="form-control" /></div></td>
		<td></td>	
	</tr>

	
<!-- Additional Information -->
	<tr class="title">
		<td colspan="3">Additional Information</td>
	</tr>
	<tr>
		<td><p class="subtitle">Job:<p></td>
		<td><div class="ansInput"><form:input path="userprofile.job" cssClass="form-control"/></div></td>
		<td></td>
	</tr>
	<tr>
		<td><p class="subtitle">Income:<p></td>
		<td><div class="ansInput"><form:input path="userprofile.income" cssClass="form-control"/></div></td>
		<td></td>
	</tr>
	<tr>
		<td><p class="subtitle">Education:<p></td>
		<td><div class="ansInput"><form:input path="userprofile.education" cssClass="form-control"/></div></td>
		<td></td>
	</tr>
	<tr>
		<td><p class="subtitle">Number of Adult:<p></td>
		<td><div class="ansInput"><form:input path="userprofile.adultNo" cssClass="form-control"/></div></td>
		<td></td>
	</tr>
	<tr>
		<td><p class="subtitle">Number of Child:<p></td>
		<td><div class="ansInput"><form:input path="userprofile.childNo" cssClass="form-control"/></div></td>
		<td></td>
	</tr>
	<tr>
		<td><p class="subtitle">House Type:<p></td>
		<td><div class="ansInput"><form:input path="userprofile.houseType" cssClass="form-control"/></div></td>
		<td></td>
	</tr>
	<tr>
		<td><p class="subtitle">Comments:<p></td>
		<td><div class="ansInput"><form:textarea path="userprofile.comment" cssClass="form-control"/></div></td>
		<td></td>
	</tr> 

<!-- Button -->
	<tr>
		<td colspan="3">
			<div align="right">
				<a class="btn btn-default" href="${pageContext.request.contextPath}/signup/create">Cancel</a>
				<form:button name="Submit" class="btn btn-success">Signup</form:button>	
			</div>
		</td>
	</tr>
</table>

</form:form>

