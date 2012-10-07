package com.kp.json;
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import net.sf.json.JSONObject;

public class JavaToJsonObj extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2972097910851676743L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			PrintWriter out = response.getWriter();
			out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
			out.println("- - - - - -          JSONObject:          - - - - -");
			out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
			
			
			JSONObject obj = new JSONObject();

			obj.element("Boolean", false);
			obj.element("double", new Double(66.67));
			obj.element("int", new Integer(2));
			
			out.println(obj);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	

}