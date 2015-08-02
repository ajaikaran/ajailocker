package com.server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayResponse
 */
@WebServlet("/DisplayResponse")
public class DisplayResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayResponse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int flag=Integer.parseInt(request.getParameter("FLAG"));
		if(flag==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/frame1.jsp");
			rd.forward(request, response);
			//response.sendRedirect("http://localhost:8092/ClientSide1/Request?count=2");
		}
		if(flag==0)
		{
			RequestDispatcher rd1=request.getRequestDispatcher("/frame3.jsp");
			rd1.forward(request, response);
		}
		if(flag==2)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/newOrder.jsp");
			rd.forward(request, response);
		}
		if(flag==3)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/orderlist.jsp");
			rd.forward(request, response);
		}
		if(flag==4)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/newPurchase.jsp");
			rd.forward(request, response);
		}
		if(flag==5)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/purchaseList.jsp");
			rd.forward(request, response);
		}
		if(flag==6)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/items.jsp");
			rd.forward(request, response);
		}
		if(flag==7)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/add_items.jsp");
			rd.forward(request, response);
		}
		if(flag==8)
		{
			RequestDispatcher rd=request.getRequestDispatcher("/addedItem.jsp");
			rd.forward(request, response);
		}

	}
}
