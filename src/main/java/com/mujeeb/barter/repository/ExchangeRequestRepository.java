package com.mujeeb.barter.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.ExchangeRequest;
import com.mujeeb.barter.entity.Listing;
import com.mujeeb.barter.entity.User;

public interface ExchangeRequestRepository extends CrudRepository<ExchangeRequest, Integer> {

    ExchangeRequest findById(Long id);
    
    List<ExchangeRequest> findByOutgoingListing(Listing outgoingListing);
    
    List<ExchangeRequest> findByIncomingListing(Listing incomingListing);
    
    List<ExchangeRequest> findByRequestedBy(User requestedBy);
    
    List<ExchangeRequest> findByAcceptedBy(User acceptedBy);
    
    List<ExchangeRequest> findByRequestedAt(Date requestedAt);
    
    List<ExchangeRequest> findByAcceptedAt(Date acceptedAt);
}
