<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
input {
	background-color: orange;
	font-family: sans-serif;
	font-weight:bold;  
}
</style>
</head>
<body bgcolor="silver">
<div style="background-color:grey;width:1300px;
height:75px;
position:relative;
top:0px;
left:0px;
z-index:2">
 

<img src="C:\Users\admin\Desktop\SAP_Pharmaceuticals.gif" width="200px" height="75px"; style="position:absolute; "> 
<h2 style="position: absolute; padding-left: 300PX; COLOR:navy;   font-family: sans-serif;font-size:  xx-large;  ;"> SAP INVENTORY PORTAL </h2>
</div>

<br>
<br>
<form name="frame1" action="./Request" target="FRAME2">
<center>
<table>
	<tr>
	<td style=" text-shadow:4px 4px 8px WHITE;font-family:sans-serif; background-color:black; font-size:xx-large;font-weight: bolder;font-stretch:narrower; color: blue;   ">ADMIN MENU PAGE </td></tr>
	<TR></TR><TR></TR><TR></TR>
	<tr align="center"><td><input type="submit" value="NEW ORDER" name="command"></td></tr>
	<tr align="center"><td><input type="submit" value="NEW PURCHASE" name="command"></td></tr>
	<tr align="center"><td><input type="submit" value="ITEMS" name="command"></td></tr>
	<!-- <tr align="center"><td><input type="submit" value="VENDORS" name="command"></td></tr>
	<tr align="center"><td><input type="submit" value="WAREHOUSE" name="command"></td></tr>
	<tr align="center"><td><input type="submit" value="CUSTOMERS" name="command"></td></tr>-->
	</table></center>
	</form>
 
<br>
<br>
<br>



<form name="frame1" action="./MainServlet" target="_top">
<input type="submit" value="LOGOUT" name="command"></input>
</form>
<form action="./MainServlet" target="FRAME2">
<input type="submit" value="ADMIN HOME" name="command"></input>
</form>

</body>
</html>