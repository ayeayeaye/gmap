 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="${pageContext.request.contextPath}/css/style.css" rel="STYLESHEET" type="text/css">


<label id="lat" hidden="">${user.address.lat}</label>
<label id="longt" hidden="">${user.address.longt}</label>
<label id="roadName" hidden="">${user.address.roadName}</label>

<a href="${pageContext.request.contextPath}/view/all/user">Back to all user list</a>

<div class="container">
	<div id="map" ></div> 
</div>

<hr>

<div class="container"><h3><b>User Info</b></h3></div>
<div class="row col-lg-12">

	<div class="col-lg-3">
		<c:set value="${user.photo.facePhoto}" var="img"></c:set>
		<img src="<%= request.getContextPath()%>/photo/${img}" width="180px" height="160px">	
	</div>
	<div class="col-lg-9">
<!-- 	User Profile Start-->
			<div class="panel panel-default" >
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle collapsed" data-toggle="collapse" data-parent="#accordion" href="#collapse1">
						User Profile						 
						</a>
					</h4>	
				</div>
						    
				<div id="collapse1" class="panel-collapse collapse in">			      	      
					<div class="panel-body">
						<table class="table">
							<tr><td>Name</td><td>:${user.userprofile.name}</td></tr>
							<tr><td>NRIC</td><td>:${user.userprofile.nric}</td></tr>
						</table>			 						
					</div>
				</div>
			</div>
<!-- 	Contact  Start-->
			<div class="panel panel-default" >
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapse2">
						Contact						 
						</a>
					</h4>	
				</div>
						    
				<div id="collapse2" class="panel-collapse collapse">			      	      
					<div class="panel-body">
						<table class="table">
							<tr><td>Name</td><td>:${user.userprofile.name}</td></tr>
							<tr><td>NRIC</td><td>:${user.userprofile.nric}</td></tr>
						</table>			 						
					</div>
				</div>
			</div>
<!-- 	Photo  Start-->
			<div class="panel panel-default" >
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapse3">
						Photo						 
						</a>
					</h4>	
				</div>
						    
				<div id="collapse3" class="panel-collapse collapse">			      	      
					<div class="panel-body">
						<table class="table">
							<tr>
								<c:set value="${user.photo.nricPhoto}" var="nricpt"></c:set>
								<c:set value="${user.photo.housePhoto}" var="houpt"></c:set>								
								<td><img src="<%= request.getContextPath()%>/photo/${nricpt}" width="150px" height="120px"></td>
								<td><img src="<%= request.getContextPath()%>/photo/${houpt}" width="150px" height="120px"></td>
							</tr>
						</table>			 						
					</div>
				</div>
			</div>
	
<!-- 	Addational  Start-->
			<div class="panel panel-default" >
				<div class="panel-heading">
					<h4 class="panel-title">
						<a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#collapse4">
						Addational Information						 
						</a>
					</h4>	
				</div>
						    
				<div id="collapse4" class="panel-collapse collapse">			      	      
					<div class="panel-body">
						<table class="table">
							<tr><td>Job</td><td>:${user.userprofile.job}</td></tr>
							<tr><td>Income</td><td>:${user.userprofile.income}</td></tr>
							<tr><td>Education</td><td>:${user.userprofile.education}</td></tr>
							<tr><td>Number of Adult</td><td>:${user.userprofile.adultNo}</td></tr>
							<tr><td>Number of Child</td><td>:${user.userprofile.childNo}</td></tr>
							<tr><td>House Type</td><td>:${user.userprofile.houseType}</td></tr>
							<tr><td>Comment</td><td>:${user.userprofile.comment}</td></tr>
						</table>			 						
					</div>
				</div>
			</div>
</div>

</div>
	
		
	
   


<script>
/* Get Map */
function initMap() {
	var latitude = document.getElementById("lat").innerHTML;
	var longtitude = document.getElementById("longt").innerHTML; 
    var mapCanvas = document.getElementById("map");
    var mapOptions = {
        center: new google.maps.LatLng(latitude, longtitude),
        zoom: 15
    };
/*Add Marker */
    var map = new google.maps.Map(mapCanvas, mapOptions);
    var marker = new google.maps.Marker({
        position: mapOptions.center,
        map: map
      });
/* Show popup when click marker    */
    var contentString = document.getElementById("roadName").innerHTML;
    var infowindow = new google.maps.InfoWindow({
        content: contentString
      });
    marker.addListener('click', function() {
        infowindow.open(map, marker);
      })
}
</script>

 <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBMQGhiJ_V6WM8SjeAm8bZIJVceWoEzmn0&callback=initMap"></script>