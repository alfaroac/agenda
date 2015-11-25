<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<jsp:useBean id="now" class="java.util.Date" scope="request" />

<!DOCTYPE html>   

<head>
	<meta charset="utf-8">
	
	<script type="text/javascript" src="<%=request.getContextPath()%>/index/js/libs/jquery.min.js"></script>
	
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>Agenda Ugel</title>
	<link rel="icon" href="images/favicon.ico" type="image/x-icon" />
	<link rel="stylesheet" href="<%=request.getContextPath()%>/index/css/isr-screen.css?v=1">	
	<link rel="stylesheet" href="css/css/base.css">
	<link rel="stylesheet" href="css/css/layout.css">
	<link rel="stylesheet" href="css/css/akeleton.css">
	<style>
	#pw_hint {
	position: absolute;
	top: 13px;
	left: 210px;
	}
	.ie7 #pw_hint {left: 215px;}
  </style>

</head>
<!-- !Body -->
<body class="login" >
	<div class="wrapper-header">
				
	<div class="container">		
	<div class="form-bg">
		<form class="row-fluid form-signin" id="form-login" action="<%=request.getContextPath() %>/j_spring_security_check" method="post" AUTOCOMPLETE="off">
			<h2>Login</h2>
			<p><input type="text" placeholder="Username"></p>
			<p><input type="password" placeholder="Password"></p>
			<label for="remember">
			  <input type="checkbox" id="remember" value="remember" />
			  <span>Remember me on this computer</span>
			</label>
			<button type="submit"></button>
		<form>
	</div>


	<p class="forgot">Forgot your password? <a href="">Click here to reset it.</a></p>


	</div><!-- container -->
	<script type="text/javascript" src="js/app.js"></script>		
</div><!--/ div.wrapper-header /-->
		
</body>
</html>

