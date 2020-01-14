package com.myRetail.services.productservice.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myRetail.services.productservice.model.Price;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long>{

}
