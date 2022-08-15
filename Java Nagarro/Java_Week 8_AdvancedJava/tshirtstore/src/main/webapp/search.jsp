<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Search</title>
  </head>
  <body>
  <div style="margin-top:10px">
    <form action="search" method="post">
	  	<div class="form-group">
		  <div class="col-md-12 mb-3" style="display:flex; flex-direction: row">
	      	  <label for="color" class="col-sm-2">Color</label>
	      	  <div class="col-sm-2">
	          <input type="text" style="height:27px; border-color:black" class="form-control" placeholder="Color" name = "color" required >
	          </div>
		  </div>
		</div>	      
	      
	  <div class="form-group">
	    <div class="col-md-12 mb-3" style="display:flex; flex-direction: row">
	    <label for="size" class="col-sm-2">Size</label>
	    <div class="col-sm-2">
		  <select id="size" name="size">
			 <option value="S">S</option>
			 <option value="M">M</option>
			 <option value="L">L</option>
			 <option value="XL">XL</option>
			 <option value="XXL">XXL</option>
		  </select>
		 </div> 
		 </div> 
	  </div>
	  <div class="form-group">
	   <div class="col-md-12 mb-3" style="display:flex; flex-direction: row">
	    <label for="size" class="col-sm-2">Gender</label>
	    <div class="col-sm-2">
		  <select id="size" name="gender">
			 <option value="M">Male</option>
			 <option value="F">Female</option>
			 <option value="U">Unisex</option>
		  </select>
		</div>  
		</div>
	  </div>
	  
	  <div class="form-group">
	   <div class="col-md-12 mb-3" style="display:flex; flex-direction: row">
	    <label for="size" class="col-sm-2">Sort Preference</label>
	    <div class="col-sm-2">
		  <select id="size" name="preference">
			 <option value="Price">Price</option>
			 <option value="Rating">Rating</option>
			 <option value="Both">Both</option>
		  </select>
		</div>  
		</div>  
	  </div>
	  <div class="col-md-12 mb-3" style="display:flex; ">
	  	<div class="col-sm-2">
	  	  <button type="submit" class="btn btn-primary">Submit</button>
	  	</div>  
	  </div>
	</form>
	</div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>    
    
    