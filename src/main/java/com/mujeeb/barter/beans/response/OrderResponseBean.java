package com.mujeeb.barter.beans.response;

import com.mujeeb.barter.beans.OrderBean;

public class OrderResponseBean extends OrderBean {

	private static final long serialVersionUID = 1L;
	
	protected int resultCode = 0;
	protected String resultDescription = "Success.";
	
	public OrderResponseBean() {}
	
	public OrderResponseBean(int resultCode, String resultDescription) {
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
	}
	
	public OrderResponseBean(Long userId, Long exchangeRequestId, Long outgoingProductId, Double outgoingQuantity, Long sellerUserId, Long incomingProductId, Double incomingQuantity
					, Long buyerUserId, String transactionDate) {
		this.exchangeRequestId = exchangeRequestId;
		this.outgoingProductId = outgoingProductId;
		this.outgoingQuantity = outgoingQuantity;
		this.sellerUserId = sellerUserId;
		this.incomingProductId = incomingProductId;
		this.incomingQuantity = incomingQuantity;
		this.buyerUserId = buyerUserId;
		this.transactionDate = transactionDate;
	}
	
	public OrderResponseBean(Long id, Long userId, Long exchangeRequestId, Long outgoingProductId, Double outgoingQuantity, Long sellerUserId, Long incomingProductId
					, Double incomingQuantity, Long buyerUserId, String transactionDate) {
		this(userId, exchangeRequestId, outgoingProductId, outgoingQuantity, sellerUserId, incomingProductId, incomingQuantity, buyerUserId, transactionDate);
		this.id = id;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDescription() {
		return resultDescription;
	}

	public void setResultDescription(String resultDescription) {
		this.resultDescription = resultDescription;
	}
}
