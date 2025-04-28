package com.mujeeb.barter.beans;

import java.io.Serializable;

public class OrderBean implements Serializable {

	private static final long serialVersionUID = 1L;
    protected Long id;
    protected Long exchangeRequestId;
    protected Long outgoingProductId;
    protected Double outgoingQuantity;
    protected Long sellerUserId;
    protected Long incomingProductId;
    protected Double incomingQuantity;
    protected Long buyerUserId;
    protected String transactionDate;
	
	public OrderBean() {};
	
	public OrderBean(Long exchangeRequestId, Long outgoingProductId, Double outgoingQuantity, Long sellerUserId, Long incomingProductId, Double incomingQuantity
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
	
	public OrderBean(Long id, Long exchangeRequestId, Long outgoingProductId, Double outgoingQuantity, Long sellerUserId, Long incomingProductId
			, Double incomingQuantity, Long buyerUserId, String transactionDate) {
		this(exchangeRequestId, outgoingProductId, outgoingQuantity, sellerUserId, incomingProductId, incomingQuantity, buyerUserId, transactionDate);
		this.id = id;
	}
	
	@Override
	public String toString() {
        return "ProductBean{" +
                "id=" + id +
                ", exchangeRequestId='" + exchangeRequestId + '\'' +
                ", outgoingProductId='" + outgoingProductId + '\'' +
                ", outgoingQuantity='" + outgoingQuantity + '\'' +
                ", incomingProductId='" + incomingProductId + '\'' +
                ", incomingQuantity='" + incomingQuantity + '\'' +
                ", buyerUserId='" + buyerUserId + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                '}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getExchangeRequestId() {
		return exchangeRequestId;
	}

	public void setExchangeRequestId(Long exchangeRequestId) {
		this.exchangeRequestId = exchangeRequestId;
	}

	public Long getOutgoingProductId() {
		return outgoingProductId;
	}

	public void setOutgoingProductId(Long outgoingProductId) {
		this.outgoingProductId = outgoingProductId;
	}

	public Double getOutgoingQuantity() {
		return outgoingQuantity;
	}

	public void setOutgoingQuantity(Double outgoingQuantity) {
		this.outgoingQuantity = outgoingQuantity;
	}

	public Long getSellerUserId() {
		return sellerUserId;
	}

	public void setSellerUserId(Long sellerUserId) {
		this.sellerUserId = sellerUserId;
	}

	public Long getIncomingProductId() {
		return incomingProductId;
	}

	public void setIncomingProductId(Long incomingProductId) {
		this.incomingProductId = incomingProductId;
	}

	public Double getIncomingQuantity() {
		return incomingQuantity;
	}

	public void setIncomingQuantity(Double incomingQuantity) {
		this.incomingQuantity = incomingQuantity;
	}

	public Long getBuyerUserId() {
		return buyerUserId;
	}

	public void setBuyerUserId(Long buyerUserId) {
		this.buyerUserId = buyerUserId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
}
