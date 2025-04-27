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
    private Listing outgoingListing;
    
    @Column
    private double outgoingQuantity;

    @Column
    private Listing incomingListing;
    
    @Column
    private double incomingQuantity;
    
    @Column
    private User requestedBy;

    @Column
    private Date requestedAt;

    @Column
    private User acceptedBy;
    
    @Column
    private Date acceptedAt;

    public ExchangeRequest() {
    }

    public ExchangeRequest(Listing outgoingListing, double outgoingQuantity, Listing incomingListing, double incomingQuantity
    		, User requestedBy, Date requestedAt, User acceptedBy, Date acceptedAt) {
        this.outgoingListing = outgoingListing;
        this.outgoingQuantity = outgoingQuantity;
        this.incomingListing = incomingListing;
        this.incomingQuantity = incomingQuantity;
        this.requestedBy = requestedBy;
        this.requestedAt = requestedAt;
        this.acceptedBy = acceptedBy;
        this.acceptedAt = acceptedAt;
    }

    @Override
    public String toString() {
        return "ExchangeRequest{" +
                "id=" + id +
                ", outgoingListing=" + outgoingListing +
                ", outgoingQuantity='" + outgoingQuantity + '\'' +
                ", incomingListing='" + incomingListing + '\'' +
                ", incomingQuantity=" + incomingQuantity +
                ", requestedBy=" + requestedBy +
                ", requestedAt=" + requestedAt +
                ", acceptedBy=" + acceptedBy +
                ", acceptedAt=" + acceptedAt +
                '}';
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Listing getOutgoingListing() {
		return outgoingListing;
	}

	public void setOutgoingListing(Listing outgoingListing) {
		this.outgoingListing = outgoingListing;
	}

	public double getOutgoingQuantity() {
		return outgoingQuantity;
	}

	public void setOutgoingQuantity(double outgoingQuantity) {
		this.outgoingQuantity = outgoingQuantity;
	}

	public Listing getIncomingListing() {
		return incomingListing;
	}

	public void setIncomingListing(Listing incomingListing) {
		this.incomingListing = incomingListing;
	}

	public double getIncomingQuantity() {
		return incomingQuantity;
	}

	public void setIncomingQuantity(double incomingQuantity) {
		this.incomingQuantity = incomingQuantity;
	}

	public User getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(User requestedBy) {
		this.requestedBy = requestedBy;
	}

	public Date getRequestedAt() {
		return requestedAt;
	}

	public void setRequestedAt(Date requestedAt) {
		this.requestedAt = requestedAt;
	}

	public User getAcceptedBy() {
		return acceptedBy;
	}

	public void setAcceptedBy(User acceptedBy) {
		this.acceptedBy = acceptedBy;
	}

	public Date getAcceptedAt() {
		return acceptedAt;
	}

	public void setAcceptedAt(Date acceptedAt) {
		this.acceptedAt = acceptedAt;
	}
}
