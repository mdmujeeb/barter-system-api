package com.mujeeb.barter.beans;

import java.io.Serializable;

public class ExchangeRequestBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
    protected Long id;
    protected Long outgoingListingId;
    protected Double outgoingQuantity;
    protected Long incomingListingId;
    protected Double incomingQuantity;
    protected Long requestedByUserId;
    protected String requestedAt;
    protected Long acceptedByUserId;
    protected String acceptedAt;
	
	public ExchangeRequestBean() {};
	
	public ExchangeRequestBean(Long outgoingListingId, Double outgoingQuantity, Long incomingListingId, Double incomingQuantity
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
	
	public ExchangeRequestBean(Long id, Long outgoingListingId, Double outgoingQuantity, Long incomingListingId, Double incomingQuantity
			, Long requestedByUserId, String requestedAt, Long acceptedByUserId, String acceptedAt) {
		this(outgoingListingId, outgoingQuantity, incomingListingId, incomingQuantity, requestedByUserId, requestedAt, acceptedByUserId, acceptedAt);
		this.id = id;
	}
	
	@Override
	public String toString() {
        return "ProductBean{" +
                "id=" + id +
                ", outgoingListingId='" + outgoingListingId + '\'' +
                ", outgoingQuantity='" + outgoingQuantity + '\'' +
                ", incomingListingId='" + incomingListingId + '\'' +
                ", incomingQuantity='" + incomingQuantity + '\'' +
                ", requestedByUserId='" + requestedByUserId + '\'' +
                ", requestedAt='" + requestedAt + '\'' +
                ", acceptedByUserId='" + acceptedByUserId + '\'' +
                ", acceptedAt='" + acceptedAt + '\'' +
                '}';
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOutgoingListingId() {
		return outgoingListingId;
	}

	public void setOutgoingListingId(Long outgoingListingId) {
		this.outgoingListingId = outgoingListingId;
	}

	public Double getOutgoingQuantity() {
		return outgoingQuantity;
	}

	public void setOutgoingQuantity(Double outgoingQuantity) {
		this.outgoingQuantity = outgoingQuantity;
	}

	public Long getIncomingListingId() {
		return incomingListingId;
	}

	public void setIncomingListingId(Long incomingListingId) {
		this.incomingListingId = incomingListingId;
	}

	public Double getIncomingQuantity() {
		return incomingQuantity;
	}

	public void setIncomingQuantity(Double incomingQuantity) {
		this.incomingQuantity = incomingQuantity;
	}

	public Long getRequestedByUserId() {
		return requestedByUserId;
	}

	public void setRequestedByUserId(Long requestedByUserId) {
		this.requestedByUserId = requestedByUserId;
	}

	public String getRequestedAt() {
		return requestedAt;
	}

	public void setRequestedAt(String requestedAt) {
		this.requestedAt = requestedAt;
	}

	public Long getAcceptedByUserId() {
		return acceptedByUserId;
	}

	public void setAcceptedByUserId(Long acceptedByUserId) {
		this.acceptedByUserId = acceptedByUserId;
	}

	public String getAcceptedAt() {
		return acceptedAt;
	}

	public void setAcceptedAt(String acceptedAt) {
		this.acceptedAt = acceptedAt;
	}
}
