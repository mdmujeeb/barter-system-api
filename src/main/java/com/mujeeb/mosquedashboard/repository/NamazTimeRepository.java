package com.mujeeb.mosquedashboard.repository;

import com.mujeeb.mosquedashboard.entity.User;
import com.mujeeb.mosquedashboard.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NamazTimeRepository extends CrudRepository<Product, Long> {

    Product findByNameAndMasjidId(String name, Integer masjidId);

    List<Product> findByMasjidId(Integer masjidId);

    Product findById(int id);
}
