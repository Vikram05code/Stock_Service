package com.vikram.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.service.IStockPriceService;

@RestController
@RequestMapping("/price")
public class StockPriceController {

	@Autowired
	private IStockPriceService iStockPriceService;
	
	@GetMapping("/stockPrice/{comapnyName}")
	public ResponseEntity<Double> getStockPrice(@PathVariable String companyName){
		
		Double price = iStockPriceService.findByCompanyName(companyName);
		System.out.println(companyName +": "+price);
		
		return new ResponseEntity<Double>(price, HttpStatus.OK);
	}
	
	
}
