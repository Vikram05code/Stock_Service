package com.vikram.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vikram.Exception.StockNotFoundException;
import com.vikram.entity.StockPrice;
import com.vikram.repository.StockRepository;

@Service
public class StockPriceServiceImpl implements IStockPriceService {

	@Autowired
	private	StockRepository stockRepository;
	
	@Override
	public Double findByCompanyName(String companyname) {
		
	    StockPrice stockPrice = stockRepository.findByCompanyName(companyname);
	    if(stockPrice == null) {
	    	throw new StockNotFoundException("Company not found");
	    }
		
		return stockPrice.getCompanyPrice();
	}

}
