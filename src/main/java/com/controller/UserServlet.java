package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserJDBC;
import com.model.User;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			User u = new User();
			List<User> ls = new ArrayList<User>();
			u.setUno(Integer.parseInt(request.getParameter("uno")));
			u.setName(request.getParameter("name"));
			u.setPass(request.getParameter("pass"));
			ls.add(u);
			
			UserJDBC db = new UserJDBC();
			int i = db.saveData(ls);
			
			if(i>0) {
				response.sendRedirect("success.jsp");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
