package com.mujeeb.barter.beans.request;

import com.mujeeb.barter.beans.OrderBean;

public class OrderRequestBean extends OrderBean {

	private static final long serialVersionUID = 1L;
	
	Long userId;
	
	public OrderRequestBean() {}
	
	public OrderRequestBean(Long userId, Long exchangeRequestId, Long outgoingProductId, Double outgoingQuantity, Long sellerUserId, Long incomingProductId, Double incomingQuantity
					, Long buyerUserId, String transactionDate) {
		this.userId = userId;
		this.exchangeRequestId = exchangeRequestId;
		this.outgoingProductId = outgoingProductId;
		this.outgoingQuantity = outgoingQuantity;
		this.sellerUserId = sellerUserId;
		this.incomingProductId = incomingProductId;
		this.incomingQuantity = incomingQuantity;
		this.buyerUserId = buyerUserId;
		this.transactionDate = transactionDate;
	}
	
	public OrderRequestBean(Long id, Long userId, Long exchangeRequestId, Long outgoingProductId, Double outgoingQuantity, Long sellerUserId, Long incomingProductId
					, Double incomingQuantity, Long buyerUserId, String transactionDate) {
		this(userId, exchangeRequestId, outgoingProductId, outgoingQuantity, sellerUserId, incomingProductId, incomingQuantity, buyerUserId, transactionDate);
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
