package com.mujeeb.barter.beans.mappers;

import com.mujeeb.barter.beans.response.UserResponseBean;
import com.mujeeb.barter.entity.User;
import com.mujeeb.barter.util.DateUtil;

public class UserBeanMapper {

	public static UserResponseBean toResponseBean(User user) {
		return new UserResponseBean(user.getId(), user.getUserId(), user.getPassword(), user.getFirstName(), user.getLastName(), user.getMobile()
				, user.getEmail(), DateUtil.formatDate(user.getDateOfBirth()), user.getAddress1(), user.getAddress2(), user.getCityId()
				, user.getStateId(), user.getCountryId(), user.getPinCode()
				, "-1", "-1");
	}
}
