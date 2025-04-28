package com.mujeeb.barter.beans.response;

import com.mujeeb.barter.beans.ExchangeRequestBean;

public class ExchangeRequestResponseBean extends ExchangeRequestBean {

	private static final long serialVersionUID = 1L;
	
	protected int resultCode = 0;
	protected String resultDescription = "Success.";
	
	public ExchangeRequestResponseBean() {}
	
	public ExchangeRequestResponseBean(int resultCode, String resultDescription) {
		this.resultCode = resultCode;
		this.resultDescription = resultDescription;
	}
	
	public ExchangeRequestResponseBean(Long outgoingListingId, Double outgoingQuantity, Long incomingListingId, Double incomingQuantity
			, Long requestedByUserId, String requestedAt, Long acceptedByUserId, String acceptedAt) {
		
		this.outgoingListingId = outgoingListingId;
		this.outgoingQuantity = outgoingQuantity;
		this.incomingListingId = incomingListingId;
		this.incomingQuantity = incomingQuantity;
		this.requestedByUserId = requestedByUserId;
		this.requestedAt = requestedAt;
		this.acceptedByUserId = acceptedByUserId;
		this.acceptedAt = acceptedAt;
	}
	
	public ExchangeRequestResponseBean(Long id, Long outgoingListingId, Double outgoingQuantity, Long incomingListingId, Double incomingQuantity
			, Long requestedByUserId, String requestedAt, Long acceptedByUserId, String acceptedAt) {
		this(outgoingListingId, outgoingQuantity, incomingListingId, incomingQuantity, requestedByUserId, requestedAt, acceptedByUserId, acceptedAt);
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
