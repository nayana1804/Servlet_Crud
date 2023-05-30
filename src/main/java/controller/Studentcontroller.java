package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;
import dto.StudentDto;

@WebServlet("/insert")
public class Studentcontroller extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String std_id=req.getParameter("sid");
		int sid=Integer.parseInt(std_id);
		String std_name=req.getParameter("sname");
		
		String gender=req.getParameter("gender");
		String phno=req.getParameter("phno");
		
		long num=Long.parseLong(phno);
		
		StudentDto studentDto=new StudentDto();
		studentDto.setStd_id(sid);
		studentDto.setStd_name(std_name);
		studentDto.setGender(gender);
		studentDto.setPhno(num);
		
		Studentdao studentdao=new Studentdao();
	   String msg= studentdao.create(studentDto);
	   res.getWriter().println(msg);
	}



}
