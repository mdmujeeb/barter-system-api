package com.mujeeb.barter.beans.mappers;

import com.mujeeb.barter.beans.response.ExchangeRequestResponseBean;
import com.mujeeb.barter.entity.ExchangeRequest;
import com.mujeeb.barter.util.DateUtil;

public class ExchangeRequestBeanMapper {

	public static ExchangeRequestResponseBean toResponseBean(ExchangeRequest bean) {
		
		String acceptedAt = null;
		if(bean.getAcceptedAt() != null) {
			acceptedAt = DateUtil.formatDate(bean.getAcceptedAt());
		}
		
		Long acceptedBy = null;
		if(bean.getAcceptedByUserId() != null) {
			acceptedBy = bean.getAcceptedByUserId();
		}
		
		return new ExchangeRequestResponseBean(bean.getOutgoingListingId()
				, bean.getOutgoingQuantity()
				, bean.getIncomingListingId()
				, bean.getIncomingQuantity()
				, bean.getRequestedByUserId()
				, DateUtil.formatDate(bean.getRequestedAt())
				, acceptedBy
				, acceptedAt);
	}
}
