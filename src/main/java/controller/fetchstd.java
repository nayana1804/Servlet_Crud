package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Studentdao;
import dto.StudentDto;
@WebServlet("/fetchid")
public class fetchstd  extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String s1=req.getParameter("id");
		int id=Integer.parseInt(s1);
		
		Studentdao dao=new Studentdao();
		StudentDto dto=dao.fetchstd(id);
	resp.getWriter().print(dto);
		
		
	}
	

}
