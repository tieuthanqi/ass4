package Assigment3;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Validate")
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "";  
		String name = request.getParameter("customerName");
	    String email = request.getParameter("customerEmail");
	    String quantity = request.getParameter("quantity");

	    if (name.equals("") || email.equals("") || quantity.equals("")) {
	          url = "/error.jsp";
	      }
	      else {
	    	  double pricePerUnit =9.95;
	    	  int quantityNumber= Integer.parseInt(quantity);
	    	  double totalCost= pricePerUnit* quantityNumber;
	    	  request.setAttribute("pricePerUnit", ""+pricePerUnit);
	    	  request.setAttribute("cost", ""+totalCost);
	    	  url = "/reciept.jsp";
	      }
	    
	    RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
	     dispatcher.forward(request, response);

	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
