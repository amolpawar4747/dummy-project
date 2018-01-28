<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Performance Analyst Sign Up</title>
<!-- CORE CSS-->

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/css/materialize.min.css">

<style type="text/css">
html, body {
	height: 100%;
}

html {
	display: table;
	margin: auto;
}

body {
	display: table-cell;
	vertical-align: middle;
}

.margin {
	margin: 0 !important;
}
</style>

</head>
<a href="" style="color: white">Performance Analyst Sign Up</a>
<body class="blue">


	<div id="login-page" class="row">
		<div class="col s12 z-depth-6 card-panel">
			<form method="post" action="registration" class="login-form">
				<div class="row">
					<div class="input-field col s12 center">
						<h5><p class="center login-form-text">Performance Analyst Sign Up Form</p></h5>
							
					</div>
				</div>
				<div class="row margin">
					<div class="input-field col s12">
						<i class="mdi-social-person-outline prefix"></i> 
						<input id="username" type="text" class="validate" name="userName" placeholder="User Name" required="required">
					</div>
				</div>
				<div class="row margin">
					<div class="input-field col s12">
						<i class="mdi-communication-email prefix"></i> 
						<input id="email" type="email" name="email" class="validate" placeholder="Email" required="required">
					</div>
				</div>
				
	
	
				<div class="row margin">
					<div class="input-field col s12">
						<i class="mdi-action-settings-phone prefix"></i>
						 <input	id="username" type="text" name="userMobile" class="validate" placeholder="Mobile Number" required="required"> 
							
					</div>
				</div>
				<div class="row margin">
					<div class="input-field col s12">
						<i class="mdi-action-lock-outline prefix"></i> 
						<input id="password" name="userPass" type="password" class="validate" placeholder="Password" required="required" required="required">
					</div>
				</div>
				<div class="row margin">
					<div class="input-field col s12">
						<i class="mdi-action-lock-outline prefix"></i> 
						<input id="password-again" name="reUserPass" type="password" placeholder="Re-type Password" required="required">
					</div>
					
					
					<div class="row margin">
					<div class="input-field col s12">
						
						  <select name="userType"
								class="browser-default" id="sel1" required="required">
								<option value="">User Type</option>
								<option value=0>Admin</option>
								<option value=1>Faculty</option>
								<option value=2>Guest</option>
							</select>
							 <label for="username" class="center-align"></label>
					</div>
				</div>
					<div class="row margin">
					<div class="input-field col s12">
						
						  <select name="centerName"
								class="browser-default" id="sel1" required="required">
								<option value="">Center Name</option>
								<option value=0>Kharghar</option>
								<option value=1>Juhu</option>
								
							</select>
							 <label for="username" class="center-align"></label>
					</div>
				</div>
				</div>
				<div class="row">
					<div class="input-field col s12">
						<input type="submit" class="btn waves-effect waves-light col s12" value="Register Now">
					</div>
					<div class="input-field col s12">
						<p class="margin center medium-small sign-up">
							Already have an account? <a href="login.html">Login</a>
						</p>
					</div>
				</div>
			</form>
		</div>
	</div>

	<footer class="page-footer">
		<div class="footer-copyright">
			<div class="container">
				2018 Performance Analyst <a class="grey-text text-lighten-4 right"
					href="http://w3lessons.info">HOME</a>
			</div>
		</div>
	</footer>
</body>

</html>