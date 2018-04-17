<!DOCTYPE html>
<html>
  <head>
    <style>
       #map {
        height: 300px;
        width: 100%;
       }
    </style>
  </head>
  <body>
    <h3>My Google Maps Demo</h3>
    <div id="map"></div>
    <script>
      function initMap() {
        var uluru = {lat: 1.338249, lng: 103.85849099999996};
        var map = new google.maps.Map(document.getElementById('map'), {
          zoom: 4,
          center: uluru
        });
        var marker = new google.maps.Marker({
          position: uluru,
          map: map
        });
      }
    </script>
    <script async defer src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBMQGhiJ_V6WM8SjeAm8bZIJVceWoEzmn0&callback=initMap">
    </script>
  </body>
</html>