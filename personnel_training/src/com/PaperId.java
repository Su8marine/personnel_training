package com;

/**
 * PaperId entity. @author MyEclipse Persistence Tools
 */

public class PaperId implements java.io.Serializable {

	// Fields

	private String stuId;
	private String paperName;

	// Constructors

	/** default constructor */
	public PaperId() {
	}

	/** full constructor */
	public PaperId(String stuId, String paperName) {
		this.stuId = stuId;
		this.paperName = paperName;
	}

	// Property accessors

	public String getStuId() {
		return this.stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getPaperName() {
		return this.paperName;
	}

	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PaperId))
			return false;
		PaperId castOther = (PaperId) other;

		return ((this.getStuId() == castOther.getStuId()) || (this.getStuId() != null
				&& castOther.getStuId() != null && this.getStuId().equals(
				castOther.getStuId())))
				&& ((this.getPaperName() == castOther.getPaperName()) || (this
						.getPaperName() != null
						&& castOther.getPaperName() != null && this
						.getPaperName().equals(castOther.getPaperName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getStuId() == null ? 0 : this.getStuId().hashCode());
		result = 37 * result
				+ (getPaperName() == null ? 0 : this.getPaperName().hashCode());
		return result;
	}

}