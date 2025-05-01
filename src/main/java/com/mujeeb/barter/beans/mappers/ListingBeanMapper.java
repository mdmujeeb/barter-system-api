package com.mujeeb.barter.beans.mappers;

import com.mujeeb.barter.beans.response.ListingResponseBean;
import com.mujeeb.barter.entity.Listing;
import com.mujeeb.barter.util.DateUtil;

public class ListingBeanMapper {

	public static ListingResponseBean toResponseBean(Listing bean) {
		return new ListingResponseBean(bean.getId()
				, bean.getUserId()
				, DateUtil.formatDate(bean.getListedAt())
				, bean.getProductId()
				, bean.getCategoryId()
				, bean.getSubcategoryId()
				, bean.getDescription()
				, bean.getQuantity());
	}
}
