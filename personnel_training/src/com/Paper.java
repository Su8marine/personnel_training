package com;

import java.sql.Timestamp;

/**
 * Paper entity. @author MyEclipse Persistence Tools
 */

public class Paper implements java.io.Serializable {

	// Fields

	private PaperId id;
	private Timestamp submitTime;
	private Timestamp replyTime;
	private String rewardSort;
	private Boolean isCheck;

	// Constructors

	/** default constructor */
	public Paper() {
	}

	/** minimal constructor */
	public Paper(PaperId id) {
		this.id = id;
	}

	/** full constructor */
	public Paper(PaperId id, Timestamp submitTime, Timestamp replyTime,
			String rewardSort, Boolean isCheck) {
		this.id = id;
		this.submitTime = submitTime;
		this.replyTime = replyTime;
		this.rewardSort = rewardSort;
		this.isCheck = isCheck;
	}

	// Property accessors

	public PaperId getId() {
		return this.id;
	}

	public void setId(PaperId id) {
		this.id = id;
	}

	public Timestamp getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(Timestamp submitTime) {
		this.submitTime = submitTime;
	}

	public Timestamp getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Timestamp replyTime) {
		this.replyTime = replyTime;
	}

	public String getRewardSort() {
		return this.rewardSort;
	}

	public void setRewardSort(String rewardSort) {
		this.rewardSort = rewardSort;
	}

	public Boolean getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(Boolean isCheck) {
		this.isCheck = isCheck;
	}

}