<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
TD{
 font-family: serif; font-family: serif;font-size: xx-large;font-weight: bolder;color: blue;background-color: orange;

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
<center>
<h1 style="background-color: black; color: blue;">YOUR PURCHASE LIST </h1>
<TABLE  style="width:400px; border:5px solid black; background-color: orange;">

<TR><TD>
ITEM : <%=request.getParameter("item") %><br><TD></TR>
<TR><TD>
CUSTOMER :<%=request.getParameter("customer") %><br><TD></TR>
<TR><TD>
WAREHOUSE :<%=request.getParameter("ware") %><br><TD></TR>
<TR><TD>
QUANTITY :<%=request.getParameter("qty") %><TD></TR></TABLE>
</center>
</body>
</html>