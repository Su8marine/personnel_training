package com;

import java.sql.Timestamp;

/**
 * SendPaper entity. @author MyEclipse Persistence Tools
 */

public class SendPaper implements java.io.Serializable {

	// Fields

	private String stuId;
	private Timestamp sendTime;
	private Timestamp backTime;
	private String result;

	// Constructors

	/** default constructor */
	public SendPaper() {
	}

	/** minimal constructor */
	public SendPaper(String stuId) {
		this.stuId = stuId;
	}

	/** full constructor */
	public SendPaper(String stuId, Timestamp sendTime, Timestamp backTime,
			String result) {
		this.stuId = stuId;
		this.sendTime = sendTime;
		this.backTime = backTime;
		this.result = result;
	}

	// Property accessors

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public Timestamp getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public Timestamp getBackTime() {
		return this.backTime;
	}

	public void setBackTime(Timestamp backTime) {
		this.backTime = backTime;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}