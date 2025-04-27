package com.mujeeb.barter.beans.response;

import com.mujeeb.barter.beans.UserBean;

public class UserResponseBean extends UserBean {

	private static final long serialVersionUID = -359413069975991280L;
	
	protected int resultCode = 0;
	protected String resultDescription = "Success.";

	public UserResponseBean() {}
	
	public UserResponseBean(String userId, String password, String firstName, String lastName, String mobile, String email, String dateOfBirth,
					String address1, String address2, Long cityId, Long stateId, Long countryId, String pinCode,
					String latitude, String longitude) {
		
		super(userId, password, firstName, lastName, mobile, email, dateOfBirth, address1, address2, cityId, stateId, countryId, pinCode, latitude, longitude);
	}
	
	public UserResponseBean(Long id, String userId, String password, String firstName, String lastName, String mobile, String email, String dateOfBirth,
					String address1, String address2, Long cityId, Long stateId, Long countryId, String pinCode,
					String latitude, String longitude) {
		
		this(userId, password, firstName, lastName, mobile, email, dateOfBirth, address1, address2, cityId, stateId, countryId, pinCode, latitude, longitude);
		this.id = id;
	}
	
	public int getResultCode() {
		return resultCode;
	}
	
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	
	public String getResultDescription() {
		return resultDescription;
	}
	
	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}
}
