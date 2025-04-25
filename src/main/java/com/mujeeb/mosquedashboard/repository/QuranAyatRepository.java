package com.mujeeb.mosquedashboard.repository;

import com.mujeeb.mosquedashboard.entity.User;
import com.mujeeb.mosquedashboard.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface QuranAyatRepository extends CrudRepository<Order, Long> {

    Order findById(int id);
}
