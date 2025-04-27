package com.mujeeb.barter.beans.mappers;

import com.mujeeb.barter.beans.response.UserResponseBean;
import com.mujeeb.barter.entity.User;
import com.mujeeb.barter.util.DateUtil;

public class UserBeanMapper {

	public static UserResponseBean toResponseBean(User user) {
		return new UserResponseBean(user.getId(), user.getUserId(), user.getPassword(), user.getFirstName(), user.getLastName(), user.getMobile()
				, user.getEmail(), DateUtil.formatDate(user.getDateOfBirth()), user.getAddress1(), user.getAddress2(), user.getCity().getId()
				, user.getState().getId(), user.getCountry().getId(), user.getPinCode()
				, user.getCity().getLatitude().toString(), user.getCity().getLongitude().toString());
	}
}
