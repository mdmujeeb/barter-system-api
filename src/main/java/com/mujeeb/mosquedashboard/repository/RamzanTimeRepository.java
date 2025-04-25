package com.mujeeb.mosquedashboard.repository;

import com.mujeeb.mosquedashboard.entity.User;
import com.mujeeb.mosquedashboard.entity.ExchangeRequest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RamzanTimeRepository extends CrudRepository<ExchangeRequest, Long> {

    List<ExchangeRequest> findByMasjidId(int masjidId);

    ExchangeRequest findByDateAndMasjidId(Integer date, Integer masjidId);
}
