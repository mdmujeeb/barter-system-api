package com.mujeeb.barter.beans.mappers;

import com.mujeeb.barter.beans.response.ListingResponseBean;
import com.mujeeb.barter.entity.Listing;
import com.mujeeb.barter.util.DateUtil;

public class ListingBeanMapper {

	public static ListingResponseBean toResponseBean(Listing bean) {
		return new ListingResponseBean(bean.getId()
				, bean.getUser().getId()
				, DateUtil.formatDate(bean.getListedAt())
				, bean.getProduct().getId()
				, bean.getCategory().getId()
				, bean.getSubcategory().getId()
				, bean.getDescription()
				, bean.getQuantity());
	}
}
