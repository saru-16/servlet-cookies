package com.serveletdemo1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class squareservlet extends HttpServlet {
	public void service(HttpServletRequest req ,HttpServletResponse res)throws IOException{
		int k=0;
		Cookie[] c= req.getCookies();
		for(Cookie c1:c)
			{
			if(c1.getName().equals("ans"))
			{
				k=Integer.parseInt(c1.getValue());
			}
			}
		 
	 	k=k * k;
		PrintWriter out=res.getWriter();
		out.print("square: "+k );
	}
}
