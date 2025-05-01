package com.mujeeb.barter.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExchangeRequest {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private Long outgoingListingId;
    
    @Column
    private double outgoingQuantity;

    @Column
    private Long incomingListingId;
    
    @Column
    private double incomingQuantity;
    
    @Column
    private Long requestedByUserId;

    @Column
    private Date requestedAt;

    @Column
    private Long acceptedByUserId;
    
    @Column
    private Date acceptedAt;

    public ExchangeRequest() {
    }

    public ExchangeRequest(Long outgoingListingId, double outgoingQuantity, Long incomingListingId, double incomingQuantity
    		, Long requestedByUserId, Date requestedAt, Long acceptedByUserId, Date acceptedAt) {
        this.outgoingListingId = outgoingListingId;
        this.outgoingQuantity = outgoingQuantity;
        this.incomingListingId = incomingListingId;
        this.incomingQuantity = incomingQuantity;
        this.requestedByUserId = requestedByUserId;
        this.requestedAt = requestedAt;
        this.acceptedByUserId = acceptedByUserId;
        this.acceptedAt = acceptedAt;
    }

    @Override
    public String toString() {
        return "ExchangeRequest{" +
                "id=" + id +
                ", outgoingListingId=" + outgoingListingId +
                ", outgoingQuantity='" + outgoingQuantity + '\'' +
                ", incomingListingId='" + incomingListingId + '\'' +
                ", incomingQuantity=" + incomingQuantity +
                ", requestedByUserId=" + requestedByUserId +
                ", requestedAt=" + requestedAt +
                ", acceptedByUserId=" + acceptedByUserId +
                ", acceptedAt=" + acceptedAt +
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

	public double getOutgoingQuantity() {
		return outgoingQuantity;
	}

	public void setOutgoingQuantity(double outgoingQuantity) {
		this.outgoingQuantity = outgoingQuantity;
	}

	public Long getIncomingListingId() {
		return incomingListingId;
	}

	public void setIncomingListingId(Long incomingListingId) {
		this.incomingListingId = incomingListingId;
	}

	public double getIncomingQuantity() {
		return incomingQuantity;
	}

	public void setIncomingQuantity(double incomingQuantity) {
		this.incomingQuantity = incomingQuantity;
	}

	public Long getRequestedByUserId() {
		return requestedByUserId;
	}

	public void setRequestedByUserId(Long requestedByUserId) {
		this.requestedByUserId = requestedByUserId;
	}

	public Date getRequestedAt() {
		return requestedAt;
	}

	public void setRequestedAt(Date requestedAt) {
		this.requestedAt = requestedAt;
	}

	public Long getAcceptedByUserId() {
		return acceptedByUserId;
	}

	public void setAcceptedByUserId(Long acceptedByUserId) {
		this.acceptedByUserId = acceptedByUserId;
	}

	public Date getAcceptedAt() {
		return acceptedAt;
	}

	public void setAcceptedAt(Date acceptedAt) {
		this.acceptedAt = acceptedAt;
	}
}
