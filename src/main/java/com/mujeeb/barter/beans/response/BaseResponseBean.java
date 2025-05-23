package com.mujeeb.barter.beans.response;

import java.io.Serializable;

import com.mujeeb.barter.util.Errors;

public class BaseResponseBean implements Serializable {

	private static final long serialVersionUID = 1L;

	protected int resultCode = 0;
	protected String description = "Success.";
	
	public BaseResponseBean() {}
	
	public BaseResponseBean(int errorCode) {
		this.resultCode = errorCode;
		this.description = Errors.getErrorDescription(errorCode);
	}
	
	public BaseResponseBean(int resultCode, String description) {
		this.resultCode = resultCode;
		this.description = description;
	}
	
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
