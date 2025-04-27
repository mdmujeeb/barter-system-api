package com.mujeeb.barter.beans.request;

import com.mujeeb.barter.beans.UserBean;

public class UserRequestBean extends UserBean {

	private static final long serialVersionUID = 1L;
	
	public UserRequestBean() {}
	
	public UserRequestBean(String userId, String password, String firstName, String lastName, String mobile, String email, String dateOfBirth,
					String address1, String address2, Long cityId, Long stateId, Long countryId, String pinCode,
					String latitude, String longitude) {
		
		super(userId, password, firstName, lastName, mobile, email, dateOfBirth, address1, address2, cityId, stateId, countryId, pinCode, latitude, longitude);
	}
	
	public UserRequestBean(Long id, String userId, String password, String firstName, String lastName, String mobile, String email, String dateOfBirth,
					String address1, String address2, Long cityId, Long stateId, Long countryId, String pinCode,
					String latitude, String longitude) {
		
		this(userId, password, firstName, lastName, mobile, email, dateOfBirth, address1, address2, cityId, stateId, countryId, pinCode, latitude, longitude);
		this.id = id;
	}
}
