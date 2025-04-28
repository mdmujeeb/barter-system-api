package com.mujeeb.barter.beans.mappers;



import com.mujeeb.barter.beans.response.OrderResponseBean;
import com.mujeeb.barter.entity.ExchangeRequest;
import com.mujeeb.barter.entity.Order;
import com.mujeeb.barter.util.DateUtil;

public class OrderBeanMapper {

	public static OrderResponseBean toResponseBean(Order bean, ExchangeRequest request) {
		
		return new OrderResponseBean(bean.getId()
				, request.getAcceptedBy().getId()
				, request.getId()
				, bean.getOutgoingProduct().getId()
				, bean.getOutgoingQuantity()
				, bean.getSeller().getId()
				, bean.getIncomingProduct().getId()
				, bean.getIncomingQuantity()
				, bean.getBuyer().getId()
				, DateUtil.formatDate(bean.getTransactionDate()));
	}
}
