package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class StudentDto {
	@Id
	private int std_id;
	private String std_name;
	private String gender;
	private long phno;
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "StudentDto [std_id=" + std_id + ", std_name=" + std_name + ", gender=" + gender + ", phno=" + phno
				+ "]";
	}
}
