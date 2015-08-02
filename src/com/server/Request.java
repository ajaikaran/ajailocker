package com.server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Request
 */
@WebServlet("/Request")
public class Request extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Request() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//int coun=Integer.parseInt(request.getParameter("count"));
		//if(coun==1)
		String str=request.getParameter("command");
		if(str.equals("LOGIN"))
		{		
			System.out.println("request");
			String user=request.getParameter("userid");
			String pass=request.getParameter("password");
			response.sendRedirect("http://localhost:8080/ServerSide1/ProcessRequest?str="+str+"&userid="+user+"&password="+pass);
			//RequestDispatcher rd=request.getRequestDispatcher("ServerSide1/com.processRequest/ProcessRequest?user=faraz&password=bond");
			//rd.forward(request, response);
			System.out.println("request");
		}
		else if(str.equals("NEW ORDER"))
		{
			response.sendRedirect("http://localhost:8080/ServerSide1/ProcessRequest?str="+str);
		}
		else if(str.equals("ENTER"))
		{
			String item=request.getParameter("items_dropdown");
			String customer=request.getParameter("cust_dropdown");
			String ware=request.getParameter("warehouse_dropdown");
			String qty=request.getParameter("qty");
			response.sendRedirect("http://localhost:8080/ServerSide1/ProcessRequest?str="+str+"&item="+item+"&customer="+customer+"&ware="+ware+"&qty="+qty);
		}
		else if(str.equals("NEW PURCHASE"))
		{
			response.sendRedirect("http://localhost:8080/ServerSide1/ProcessRequest?str="+str);
		}
		else if(str.equals("PURCHASE"))
		{
			String item=request.getParameter("items_dropdown");
			String vendor=request.getParameter("vendor_dropdown");
			String ware=request.getParameter("warehouse_dropdown");
			String qty=request.getParameter("qty");
			response.sendRedirect("http://localhost:8080/ServerSide1/ProcessRequest?str="+str+"&item="+item+"&vendor="+vendor+"&ware="+ware+"&qty="+qty);
		}
		else if(str.equals("ITEMS"))
		{
			response.sendRedirect("http://localhost:8080/ServerSide1/ProcessRequest?str="+str);
		}
		else if(str.equals("ADD NEW ITEM"))
		{
			response.sendRedirect("http://localhost:8080/ServerSide1/ProcessRequest?str="+str);
		}
		else if(str.equals("ADD ITEM"))
		{
			String itemname=request.getParameter("itemname");
			String itemprice=request.getParameter("itemprice");
			String vendorsid=request.getParameter("vendorsid");
			String itemtype=request.getParameter("itemtype");
			String warehouseid=request.getParameter("warehouseid" );
			String quantity=request.getParameter("quantity");
			response.sendRedirect("http://localhost:8080/ServerSide1/ProcessRequest?str="+str+"&itemname="+itemname+"&itemprice="+itemprice+"&vendorsid="+vendorsid+"&itemtype="+itemtype+"&warehouseid="+warehouseid+"&quantity="+quantity);
		}
		}
	}


