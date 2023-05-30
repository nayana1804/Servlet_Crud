package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;
@WebServlet("/fetch")
public class StudentfetchbyId extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String s1=req.getParameter("sid");
		int s2=Integer.parseInt(s1);
		
		Studentdao sdao=new Studentdao();
		String s3=sdao.Fetch(s2);
	
		res.getWriter().print(s3);
		
	}
}