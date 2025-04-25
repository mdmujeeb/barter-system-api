package com.mujeeb.mosquedashboard.repository;

import com.mujeeb.mosquedashboard.entity.User;
import com.mujeeb.mosquedashboard.entity.Listing;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OccasionRepository extends CrudRepository<Listing, Long> {

    List<Listing> findByMasjidId(Integer masjidId);

    Listing findById(int id);
}
