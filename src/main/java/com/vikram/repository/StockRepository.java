package com.vikram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.entity.StockPrice;

public interface StockRepository extends JpaRepository<StockPrice, Integer>{

	  public StockPrice findByCompanyName(String companyName);
}
