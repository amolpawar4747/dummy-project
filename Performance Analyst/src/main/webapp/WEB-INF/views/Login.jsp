<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Registration</title>
  <!-- CORE CSS-->
  
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.1/css/materialize.min.css">

<style type="text/css">
html,
body {
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
<body class="blue">

<marquee><h3>Performance Analyst</h3></marquee>
  <div id="login-page" class="row">
    <div class="col s12 z-depth-6 card-panel">
      <form method="post" action="checkLogin" class="login-form">
        <div class="row">
          <div class="input-field col s12 center">
            <img src="‪C:\Users\Abhi\Desktop\CDAC.jpg" alt="" class="responsive-img valign profile-image-login">
           <h5> <p class="center login-form-text">Performance analyst login form</p></h5>
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
            <i class="mdi-action-lock-outline prefix"></i>
            <input id="password" type="password" class="validate" name="password" placeholder="Password" required="required" >
            
          </div>
        </div>
        
        <div class="row">
          <div class="input-field col s12">
            <input type="submit" class="btn waves-effect waves-light col s12" value="Login">
          </div>
          <div class="input-field col s12">
            <p class="margin center medium-small sign-up">New User ? <a href="login.html">Register</a></p>
          </div>
        </div>
      </form>
    </div>
  </div>
   <footer class="page-footer">
          <div class="footer-copyright">
            <div class="container">
             2018 Performance Analyst
            <a class="grey-text text-lighten-4 right" href="">HOME</a>
            </div>
          </div>
  </footer>
</body>

</html>