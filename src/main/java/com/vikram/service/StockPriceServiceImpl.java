package com.vikram.service;



import com.vikram.Exception.StockNotFoundException;
import com.vikram.entity.StockPrice;
import com.vikram.repository.StockRepository;

public class StockPriceServiceImpl implements IStockPrice {

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
