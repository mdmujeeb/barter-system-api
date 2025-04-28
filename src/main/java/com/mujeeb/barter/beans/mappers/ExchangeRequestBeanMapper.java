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
		if(bean.getAcceptedBy() != null) {
			acceptedBy = bean.getAcceptedBy().getId();
		}
		
		return new ExchangeRequestResponseBean(bean.getOutgoingListing().getId()
				, bean.getOutgoingQuantity()
				, bean.getIncomingListing().getId()
				, bean.getIncomingQuantity()
				, bean.getRequestedBy().getId()
				, DateUtil.formatDate(bean.getRequestedAt())
				, acceptedBy
				, acceptedAt);
	}
}
