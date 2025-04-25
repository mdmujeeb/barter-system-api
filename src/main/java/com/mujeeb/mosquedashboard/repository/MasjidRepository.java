package com.mujeeb.mosquedashboard.repository;

import com.mujeeb.mosquedashboard.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface MasjidRepository extends CrudRepository<User, Long> {

    User findById(int id);
}
