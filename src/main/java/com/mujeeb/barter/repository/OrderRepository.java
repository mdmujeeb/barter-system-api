package com.mujeeb.barter.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Orders;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

	Orders findById(Long id);
	
	List<Orders> findAll();
	
	List<Orders> findByOutgoingProductId(Long outgoingProductId);
	
	List<Orders> findByIncomingProductId(Long incomingProductId);

	List<Orders> findBySellerId(Long sellerId);
	
	List<Orders> findByBuyerId(Long buyerId);
	
	List<Orders> findByTransactionDate(Date transactionDate);
}
