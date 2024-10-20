package com.tsp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@Column(name = "stu_id")
	private Integer stuId;
	
	@Column(name = "stu_name")
	private String stuName;
	
	@Column(name = "stu_marks")
	private Integer stuMarks;
	
	@Column(name = "stu_loc")
	private String stuLocation;

}
