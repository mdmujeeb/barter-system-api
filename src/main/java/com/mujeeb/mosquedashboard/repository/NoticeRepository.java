package com.mujeeb.mosquedashboard.repository;

import com.mujeeb.mosquedashboard.entity.User;
import com.mujeeb.mosquedashboard.entity.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NoticeRepository extends CrudRepository<Category, Long> {

    List<Category> findByMasjidId(Integer masjidId);

    Category findById(int id);
}
