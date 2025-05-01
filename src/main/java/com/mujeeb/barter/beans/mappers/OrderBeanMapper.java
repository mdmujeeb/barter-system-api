package com.mujeeb.barter.beans.mappers;



import com.mujeeb.barter.beans.response.OrderResponseBean;
import com.mujeeb.barter.entity.ExchangeRequest;
import com.mujeeb.barter.entity.Orders;
import com.mujeeb.barter.util.DateUtil;

public class OrderBeanMapper {

	public static OrderResponseBean toResponseBean(Orders bean, ExchangeRequest request) {
		
		return new OrderResponseBean(bean.getId()
				, request.getAcceptedByUserId()
				, request.getId()
				, bean.getOutgoingProductId()
				, bean.getOutgoingQuantity()
				, bean.getSellerId()
				, bean.getIncomingProductId()
				, bean.getIncomingQuantity()
				, bean.getBuyerId()
				, DateUtil.formatDate(bean.getTransactionDate()));
	}
}
