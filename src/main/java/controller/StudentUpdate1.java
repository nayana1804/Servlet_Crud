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
@WebServlet("/update1")
public class StudentUpdate1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String id=req.getParameter("id");
		int cid=Integer.parseInt(id);
		String name=req.getParameter("name");
		String number=req.getParameter("number");
		long cnumber=Long.parseLong(number);
		String gender=req.getParameter("gender");
		
	   StudentDto studentDto=new StudentDto();
	   studentDto.setStd_id(cid);
	   studentDto.setStd_name(name);
	   studentDto.setPhno(cnumber);
	   studentDto.setGender(gender);
	  
	   Studentdao dao=new Studentdao();
		  dao.update1(studentDto);
		  List<StudentDto> l1=dao.fetchall();
		  
		  req.setAttribute("studentlist", l1);
		  
		  resp.getWriter().print("<h1>data updated successfully</h1>");
		  RequestDispatcher dispatcher=req.getRequestDispatcher("download.jsp");
		  dispatcher.include(req, resp);

	} 
	  
	}