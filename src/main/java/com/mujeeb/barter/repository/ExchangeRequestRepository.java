package com.mujeeb.barter.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.ExchangeRequest;

public interface ExchangeRequestRepository extends CrudRepository<ExchangeRequest, Integer> {

    ExchangeRequest findById(Long id);
	
	List<ExchangeRequest> findAll();
    
    List<ExchangeRequest> findByOutgoingListingId(Long outgoingListingId);
    
    List<ExchangeRequest> findByIncomingListingId(Long incomingListingId);
    
    List<ExchangeRequest> findByRequestedByUserId(Long requestedByUserId);
    
    List<ExchangeRequest> findByAcceptedByUserId(Long acceptedByUserId);
    
    List<ExchangeRequest> findByRequestedAt(Date requestedAt);
    
    List<ExchangeRequest> findByAcceptedAt(Date acceptedAt);
}
