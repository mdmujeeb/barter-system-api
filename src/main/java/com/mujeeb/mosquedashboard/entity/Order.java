package com.mujeeb.mosquedashboard.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column
    private Product outgoingProduct;
    
    @Column
    private double outgoingQuantity;
    
    @Column
    private User seller;

    @Column
    private Product incomingProduct;
    
    @Column
    private double incomingQuantity;
    
    @Column
    private User buyer;
    
    @Column
    private Date transactionDate;

    public Order() {
    }

    public Order(Product outgoingProduct, double outgoingQuantity, User seller, Product incomingProduct, double incomingQuantity, User buyer, Date transactionDate) {
        this.outgoingProduct = outgoingProduct;
        this.outgoingQuantity = outgoingQuantity;
        this.seller = seller;
        this.incomingProduct = incomingProduct;
        this.incomingQuantity = incomingQuantity;
        this.buyer = buyer;
        this.transactionDate = transactionDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", outgoingProduct='" + outgoingProduct + '\'' +
                ", outgoingQuantity='" + outgoingQuantity + '\'' +
                ", seller='" + seller + '\'' +
                ", incomingProduct='" + incomingProduct + '\'' +
                ", incomingQuantity='" + incomingQuantity + '\'' +
                ", buyer='" + buyer + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                '}';
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Product getOutgoingProduct() {
		return outgoingProduct;
	}

	public void setOutgoingProduct(Product outgoingProduct) {
		this.outgoingProduct = outgoingProduct;
	}

	public double getOutgoingQuantity() {
		return outgoingQuantity;
	}

	public void setOutgoingQuantity(double outgoingQuantity) {
		this.outgoingQuantity = outgoingQuantity;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public Product getIncomingProduct() {
		return incomingProduct;
	}

	public void setIncomingProduct(Product incomingProduct) {
		this.incomingProduct = incomingProduct;
	}

	public double getIncomingQuantity() {
		return incomingQuantity;
	}

	public void setIncomingQuantity(double incomingQuantity) {
		this.incomingQuantity = incomingQuantity;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
}
