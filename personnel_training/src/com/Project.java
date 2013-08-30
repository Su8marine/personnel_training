package com;

import java.util.Date;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	private String projectId;
	private String stuId;
	private String teacherId;
	private String department;
	private String protectName;
	private String sort;
	private Date year;

	// Constructors

	/** default constructor */
	public Project() {
	}

	/** minimal constructor */
	public Project(String projectId) {
		this.projectId = projectId;
	}

	/** full constructor */
	public Project(String projectId, String stuId, String teacherId,
			String department, String protectName, String sort, Date year) {
		this.projectId = projectId;
		this.stuId = stuId;
		this.teacherId = teacherId;
		this.department = department;
		this.protectName = protectName;
		this.sort = sort;
		this.year = year;
	}

	// Property accessors

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProtectName() {
		return this.protectName;
	}

	public void setProtectName(String protectName) {
		this.protectName = protectName;
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public Date getYear() {
		return this.year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

}