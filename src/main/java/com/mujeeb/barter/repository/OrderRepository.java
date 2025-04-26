package com.mujeeb.barter.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Order;
import com.mujeeb.barter.entity.Product;
import com.mujeeb.barter.entity.User;

public interface OrderRepository extends CrudRepository<Order, Long> {

	Order findById(int id);
	
	List<Order> findByOutgoingProduct(Product outgoingProduct);
	
	List<Order> findByIncomingProduct(Product incomingProduct);

	List<Order> findBySeller(User seller);
	
	List<Order> findByBuyer(User buyer);
	
	List<Order> findByTransactionDate(Date transactionDate);
}
