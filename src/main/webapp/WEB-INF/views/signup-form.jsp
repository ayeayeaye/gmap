<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<style>
.title{
	background-color: #99bffc;
}
.subtitle{
	left: 100px;
	float: right;
}
.ansInput{
	width: 500px;;
}
</style>

<form:form action="${pageContext.request.contextPath}/signup/created" commandName="user" method="POST" cssClass="form" enctype="multipart/form-data" >

<!-- Profile -->
<table class="table">
	<tr class="title">
		<td colspan="3">Profile</td>
	</tr>
	<tr>
		<td><p class="subtitle">Name:<p></td>
		<td><div class="ansInput"><form:input path="userprofile.name" cssClass="form-control"/></div></td>
		<td><form:errors path="userprofile.name" cssStyle="color:red;"/></td>
		<%-- <td><h6 style="color: red">${errorMsg}</h6></td> --%>
		<!-- <td></td> -->
	</tr>
	<tr>
		<td><p class="subtitle">NRIC:<p></td>
		<td><div class="ansInput"><form:input path="userprofile.nric" cssClass="form-control"/></div></td>
		<%-- <td><form:errors path="userprofile.nric" cssStyle="color: red;" />${errorMsg}</td> --%>
		<td><h6 style="color: red">${errorMsg}</h6></td>
	</tr> 

	<!-- Contact -->
	<tr class="title">
		<td colspan="3">Contact</td>
	</tr>
	<tr>
		<td><p class="subtitle">Email:</p></td>
		<td><div class="ansInput"><form:input path="userprofile.email" cssClass="form-control"/></div></td>
		<td><h6 style="color: red">${errorMsg}</h6></td>
	</tr>
	<tr>
		<td><p class="subtitle">Road Name:</p></td>
		<td><div class="ansInput"><form:input path="address.roadName" cssClass="form-control"/></div></td>
		<td><h6 style="color: red">${errorMsg}</h6></td>
	</tr>
	<tr>
		<td><p class="subtitle">GPS Coordinates:</p></td>
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
			 <input type="text" placeholder="Enter Postal Code">
			 <a class="btn btn-default btn-sm">Get GPS Cordinates</a>
		</td>
		<td><h6 style="color: red">${errorMsg}</h6></td>
	</tr>

	<!-- Photo -->
 	<tr class="title">
		<td colspan="3">Photo</td>
	</tr>
	<tr>
		<td><p class="subtitle">NRIC:<p></td>
		<td><div class="ansInput"><input type="file" name="nricFile"  class="form-control" /></div></td>
		<td><h6 style="color: red">${errorMsg}</h6></td>	
	</tr>
	<tr>
		<td><p class="subtitle">Face:<p></td>
		<td><div class="ansInput"><input type="file" name="faceFile"  class="form-control" /></div></td>
		<td><h6 style="color: red">${errorMsg}</h6></td>
	</tr>
	<tr>
		<td><p class="subtitle">House:<p></td>
		<td><div class="ansInput"><input type="file" name="houseFile"  class="form-control" /></div></td>
		<td><h6 style="color: red">${errorMsg}</h6></td>	
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
				<a class="btn btn-warning" href="">Cancel</a>
				<form:button name="Submit" class="btn btn-success">Signup</form:button>	
			</div>
		</td>
	</tr>
</table>

</form:form>

