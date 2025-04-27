package com.mujeeb.barter.beans;

import java.io.Serializable;

public class UserBean implements Serializable {

	private static final long serialVersionUID = 168967263564525193L;
	
	protected Long id;
	protected String userId;
	protected String password;
	protected String firstName;
	protected String lastName;
	protected String mobile;
	protected String email;
	protected String dateOfBirth; // yyyy-MM-dd
	protected String address1;
	protected String address2;
	protected Long cityId;
	protected Long stateId;
	protected Long countryId;
	protected String pinCode;
	protected String latitude;
	protected String longitude;
	
	public UserBean() {}
	
	public UserBean(String userId, String password, String firstName, String lastName, String mobile, String email, String dateOfBirth,
					String address1, String address2, Long cityId, Long stateId, Long countryId, String pinCode,
					String latitude, String longitude) {
		this.userId = userId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.address1 = address1;
		this.address2 = address2;
		this.cityId = cityId;
		this.stateId = stateId;
		this.countryId = countryId;
		this.pinCode = pinCode;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public UserBean(Long id, String userId, String password, String firstName, String lastName, String mobile, String email, String dateOfBirth,
					String address1, String address2, Long cityId, Long stateId, Long countryId, String pinCode,
					String latitude, String longitude) {
		
		this(userId, password, firstName, lastName, mobile, email, dateOfBirth, address1, address2, cityId, stateId, countryId, pinCode, latitude, longitude);
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}	
}
