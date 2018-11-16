<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registeration Form</title>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="wrapper">
	<center><div class="col-md-6" style="float:left; ">
	
	<form action="UserServlet">
	<h1 style="color: white">Registration Form</h1>
	<table style="text-align: center;">
			<tr>
				<th>User Number  <i class="far fa-user"></i> : </th>
				<td><input type="text" class="form-control form-rounded" name="uno"  placeholder="Enter User Number" required autofocus="autofocus"></td>
			</tr>
			<tr>
				<th>User Name <i class="far fa-envelope-open"></i> : </th>
				<td><input type="text" class="form-control form-rounded" name="name" placeholder="Enter Name" required></td>
			</tr>
			<tr>
				<th>Password  <i class="fas fa-lock-open"></i> : </th>
				<td><input type="password" class="form-control form-rounded" name="pass" minlength="8" maxlength="20" placeholder="Minimum 8 characters" required></td>
			</tr>
			<tr>
				
	</table>
		<input type="submit" name="submit" class="btn btn-success" style="border-radius: 10px; box-shadow: 0px;">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
			</form>	
	</div>
</body>
</html>