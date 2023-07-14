package com.hiden;

import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FromFieldA extends HttpServlet
{
  
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest req,HttpServletResponse res)
  {
	try
	{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	
	String s=req.getParameter("userName");
	 out.print("Welcome "+s);  
	 
		System.out.println("login HttpServlet called");
	 //creating form that have invisible  
     out.print("<form action=' FromFieldB'>");  
     out.print("<input type='hidden' name='uname' value='"+s+"'>");  
     out.print("<input type='submit' value='go'>");  
     out.print("</form>");  
     out.close();  
		
		
		
	}
	catch(Exception e) 
	{
		System.out.println(e);
	}
	
	    
	  
  }
}
