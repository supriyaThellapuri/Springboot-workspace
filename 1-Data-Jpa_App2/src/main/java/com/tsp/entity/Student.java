package com.tsp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentinformation")
public class Student {
	@Id
	@Column(name="student_id")
	private Integer student_Id;
	
	@Column(name="studnet_name")
	private String student_Name;
	
	@Column(name="student_branch")
	private String student_Branch;
	
	@Column(name="studnet_marks")
	private Integer student_Marks;
	
	private String student_Address;

	public Integer getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(Integer student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public String getStudent_Branch() {
		return student_Branch;
	}

	public void setStudent_Branch(String student_Branch) {
		this.student_Branch = student_Branch;
	}

	public Integer getStudent_Marks() {
		return student_Marks;
	}

	public void setStudent_marks(Integer student_Marks) {
		this.student_Marks = student_Marks;
	}

	public String getStudent_Address() {
		return student_Address;
	}

	public void setStudent_Address(String student_Address) {
		this.student_Address = student_Address;
	}

	@Override
	public String toString() {
		return "Student [student_Id=" + student_Id + ", student_Name=" + student_Name + ", student_Branch="
				+ student_Branch + ", student_Marks=" + student_Marks + ", student_Address=" + student_Address + "]";
	}
	
	

}
