package com.mujeeb.mosquedashboard.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.mosquedashboard.entity.ExchangeRequest;
import com.mujeeb.mosquedashboard.entity.Listing;
import com.mujeeb.mosquedashboard.entity.User;

public interface ExchangeRequestRepository extends CrudRepository<ExchangeRequest, Long> {

    ExchangeRequest findById(int id);
    
    List<ExchangeRequest> findByOutgoingListing(Listing outgoingListing);
    
    List<ExchangeRequest> findByIncomingListing(Listing incomingListing);
    
    List<ExchangeRequest> findByRequestedBy(User requestedBy);
    
    List<ExchangeRequest> findByAcceptedBy(User acceptedBy);
    
    List<ExchangeRequest> findByRequestedAt(Date requestedAt);
    
    List<ExchangeRequest> findByAcceptedAt(Date acceptedAt);
}
