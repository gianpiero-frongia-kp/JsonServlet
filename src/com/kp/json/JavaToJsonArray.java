package com.kp.json;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

/**
 * Servlet implementation class ProvaServlet
 */
public class JavaToJsonArray extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JavaToJsonArray() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			PrintWriter out = response.getWriter();
			out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
			out.println("- - - - - -          JSONArray:           - - - - -");
			out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
			out.println(" ");
			JSONArray arrayObj = new JSONArray();

			arrayObj.add("Gianpiero");
			arrayObj.add("Frongia");
			arrayObj.add("06-12-1978");
			arrayObj.add(34);
			arrayObj.add("Punteggio");
			arrayObj.add(new Double(70.30));
			out.println(arrayObj);
			
			
			out.println(" ");
			out.println(" ");
			out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
			out.println("- - - - - -          DATI:                - - - - -");
			out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
			for (int i = 0; i < arrayObj.size(); i++) {
				out.println(arrayObj.getString(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
	}

}
