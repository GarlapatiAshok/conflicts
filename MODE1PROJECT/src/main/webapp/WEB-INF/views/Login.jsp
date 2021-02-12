
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Login PAGE</title>


</head>

<body style="color: green">
	
	<pre></pre>
	<form action="validate" method="post">
		<div align="center">
			<h2 style="color: orange">Admin Login Page</h2>
			<fieldset style="border: solid 1px; width: 300px;">

				<pre></pre>
				<label class="mandatory">*</label><label><b>Username:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="text" name="username" /><br>
				<pre></pre>
				<label class="mandatory">*</label><label><b>Password:</b></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type="password" name="password" /><br>
				<br>
				<pre></pre>
				<input type=submit value="Login" />&nbsp;&nbsp;&nbsp; <input
					type="reset" value="Clear" /> <br>
				<br>
				<pre></pre>


			</fieldset>





		</div>
	</form>
	<span style="color:blue">${error}</span>
	<span style="color:blue">${logout}</span>
<pre></pre>
	
</body>
</html>