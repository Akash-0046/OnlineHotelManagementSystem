package com.Department.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Department Details")
public class Department {
	
	@Id
	private long deptID;
	private String deptName;
	private String description;
	private int numOfEmp;
	
	public long getDeptID() {
		return deptID;
	}
	public void setDeptID(long deptID) {
		this.deptID = deptID;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNumOfEmp() {
		return numOfEmp;
	}
	public void setNumOfEmp(int numOfEmp) {
		this.numOfEmp = numOfEmp;
	}
	public Department(long deptID, String deptName, String description, int numOfEmp) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
		this.description = description;
		this.numOfEmp = numOfEmp;
	}
	public Department() {
		super();
	}
	
	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptName=" + deptName + ", description=" + description
				+ ", numOfEmp=" + numOfEmp + "]";
	}
	
	

}
