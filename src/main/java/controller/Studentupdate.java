package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;
import dto.StudentDto;
@WebServlet("/update")
public class Studentupdate extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String std_id=req.getParameter("sid");
	int id=Integer.parseInt(std_id);
	String phno=req.getParameter("phno");
	long num=Long.parseLong(phno);
	
	Studentdao studentdao=new Studentdao();
	studentdao.update(id,num);
	
	StudentDto dto=new StudentDto();
	}

}



