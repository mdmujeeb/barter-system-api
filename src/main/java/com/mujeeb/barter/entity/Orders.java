package com.mujeeb.barter.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private Long outgoingProductId;
    
    @Column
    private double outgoingQuantity;
    
    @Column
    private Long sellerId;

    @Column
    private Long incomingProductId;
    
    @Column
    private double incomingQuantity;
    
    @Column
    private Long buyerId;
    
    @Column
    private Date transactionDate;

    public Orders() {
    }

    public Orders(Long outgoingProductId, double outgoingQuantity, Long sellerId, Long incomingProductId, double incomingQuantity, Long buyerId, Date transactionDate) {
        this.outgoingProductId = outgoingProductId;
        this.outgoingQuantity = outgoingQuantity;
        this.sellerId = sellerId;
        this.incomingProductId = incomingProductId;
        this.incomingQuantity = incomingQuantity;
        this.buyerId = buyerId;
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", outgoingProductId='" + outgoingProductId + '\'' +
                ", outgoingQuantity='" + outgoingQuantity + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", incomingProductId='" + incomingProductId + '\'' +
                ", incomingQuantity='" + incomingQuantity + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                '}';
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOutgoingProductId() {
		return outgoingProductId;
	}

	public void setOutgoingProductId(Long outgoingProductId) {
		this.outgoingProductId = outgoingProductId;
	}

	public double getOutgoingQuantity() {
		return outgoingQuantity;
	}

	public void setOutgoingQuantity(double outgoingQuantity) {
		this.outgoingQuantity = outgoingQuantity;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getIncomingProductId() {
		return incomingProductId;
	}

	public void setIncomingProductId(Long incomingProductId) {
		this.incomingProductId = incomingProductId;
	}

	public double getIncomingQuantity() {
		return incomingQuantity;
	}

	public void setIncomingQuantity(double incomingQuantity) {
		this.incomingQuantity = incomingQuantity;
	}

	public Long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
}
