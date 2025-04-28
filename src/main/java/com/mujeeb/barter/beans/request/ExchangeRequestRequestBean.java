package com.mujeeb.barter.beans.request;

import com.mujeeb.barter.beans.ExchangeRequestBean;

public class ExchangeRequestRequestBean extends ExchangeRequestBean {

	private static final long serialVersionUID = 1L;
	
	protected Long userId;
	
	public ExchangeRequestRequestBean() {}
	
	public ExchangeRequestRequestBean(Long userId, Long outgoingListingId, Double outgoingQuantity, Long incomingListingId, Double incomingQuantity
			, Long requestedByUserId, String requestedAt, Long acceptedByUserId, String acceptedAt) {
		
		this.userId = userId;
		this.outgoingListingId = outgoingListingId;
		this.outgoingQuantity = outgoingQuantity;
		this.incomingListingId = incomingListingId;
		this.incomingQuantity = incomingQuantity;
		this.requestedByUserId = requestedByUserId;
		this.requestedAt = requestedAt;
		this.acceptedByUserId = acceptedByUserId;
		this.acceptedAt = acceptedAt;
	}
	
	public ExchangeRequestRequestBean(Long id, Long userId, Long outgoingListingId, Double outgoingQuantity, Long incomingListingId, Double incomingQuantity
			, Long requestedByUserId, String requestedAt, Long acceptedByUserId, String acceptedAt) {
		this(userId, outgoingListingId, outgoingQuantity, incomingListingId, incomingQuantity, requestedByUserId, requestedAt, acceptedByUserId, acceptedAt);
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
