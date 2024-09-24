package com.serveletdemo1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {
		public void service(HttpServletRequest req ,HttpServletResponse res)throws IOException,ServletException {
			int i= Integer.parseInt(req.getParameter("t1"));
			int j= Integer.parseInt(req.getParameter("t2"));
			int k=i+j;
			
			
			 
			  Cookie cookie=new Cookie("ans",k+"");
			  res.addCookie(cookie);
			  
			  Cookie cookie1=new Cookie("ans1",i+"");
			  res.addCookie(cookie1);
			  
			 res.sendRedirect("sq");
}
}
