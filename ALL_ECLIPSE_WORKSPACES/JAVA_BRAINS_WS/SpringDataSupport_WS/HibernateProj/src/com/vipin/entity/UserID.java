package com.vipin.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UserID  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int ssnID;
	private int uniqueNum;

	public int getUniqueNum() {
		return uniqueNum;
	}

	public void setUniqueNum(int uniqueNum) {
		this.uniqueNum = uniqueNum;
	}

	public int getSsnID() {
		return ssnID;
	}

	public void setSsnID(int ssnID) {
		this.ssnID = ssnID;
	}

	@Override
	public String toString() {
		return "UserID [ssnID=" + ssnID + ", uniqueNum=" + uniqueNum + "]";
	}
}