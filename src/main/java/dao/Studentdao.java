package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletResponse;

import dto.StudentDto;

public class Studentdao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public String create(StudentDto studentDto) {
		entityTransaction.begin();
		entityManager.persist(studentDto);
		entityTransaction.commit();
		return "data inserted successfully";
	}


public String delete(int d1) {
	StudentDto std=entityManager.find(StudentDto.class,d1);
			if(std!=null) {

	entityTransaction.begin();
	entityManager.remove(std);
	entityTransaction.commit();
	return "data is deleted";
			}
			else
				return"no data found";
}


  public void update(int id,long phno ) {
	StudentDto d1=entityManager.find(StudentDto.class,id);
			d1.setPhno(phno);

	entityTransaction.begin();
	entityManager.merge(d1);
	entityTransaction.commit();
	
		
}

  public String Fetch(int id) {
	StudentDto d1=entityManager.find(StudentDto.class,id);
String s=d1.getStd_id()+" "+d1.getStd_name()+" "+d1.getGender()+ " "+d1.getPhno();
return s;
}
  
  public StudentDto fetchstd(int id) {
	  StudentDto d1=entityManager.find(StudentDto.class,id);
	return d1;
	  
  }


   public List<StudentDto> fetchall()
   {
	   Query q1 =entityManager.createQuery("select data from StudentDto data");
	   List<StudentDto> list =q1.getResultList();
	   return list;
   }
   
   public void delete1(int id) {
	   StudentDto s1=entityManager.find(StudentDto.class,id);
	   entityTransaction.begin();
	   entityManager.remove(s1);
	   entityTransaction.commit();
   }
   
   public void update1(StudentDto dto) {
	   entityTransaction.begin();
	   entityManager.merge(dto);
	   entityTransaction.commit();
	  
   }
   
}

  