package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher {
	
	Teacher(){
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name= "f_name")
	private String F_Name;
	
	@Column(name= "l_name")
	private String L_Name;
	
	@Column(name= "email")
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getF_Name() {
		return F_Name;
	}
	public void setF_Name(String f_Name) {
		F_Name = f_Name;
	}
	public String getL_Name() {
		return L_Name;
	}
	public void setL_Name(String l_Name) {
		L_Name = l_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", F_Name=" + F_Name + ", L_Name=" + L_Name + ", email=" + email + "]";
	}
	public Teacher(String f_Name, String l_Name, String email) {
		super();
		F_Name = f_Name;
		L_Name = l_Name;
		this.email = email;
	}
	
	

}
