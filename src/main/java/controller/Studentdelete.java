package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.StudentDto;
@WebServlet("/delete")
public class Studentdelete extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		
		Studentdao studentdao=new Studentdao();
		studentdao.delete(cid);
		
         List<StudentDto> l1=studentdao.fetchall();
		  
		  req.setAttribute("studentlist", l1);
		  
		  resp.getWriter().print("<h1>data deleted successfully</h1>");
		  RequestDispatcher dispatcher=req.getRequestDispatcher("download.jsp");
		  dispatcher.include(req, resp);

	}
 
}
