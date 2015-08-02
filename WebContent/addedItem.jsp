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
<h1  style="background-color: black; color: blue;">YOUR ADDED ITEM </h1>
<TABLE  style="width:400px; border:5px solid black; background-color: orange;">
<tr><td>ITEM NAME : <%=request.getParameter("itemname") %> </td></tr>
<tr><td>ITEM PRICE : <%=request.getParameter("itemprice") %></td></tr> 
<tr><td>VENDOR : <%=request.getParameter("vendorsid") %> </td></tr>
<tr><td>ITEM TYPE : <%=request.getParameter("itemtype") %> </td></tr>
<tr><td>WAREHOUSE : <%=request.getParameter("warehouseid") %> </td></tr>
<tr><td>QUANTITY : <%=request.getParameter("quantity") %></td></tr>
</TABLE>
</center>
</body>
</html>