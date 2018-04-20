package com.rating.auto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.auto.model.Quote;
import com.rating.auto.service.QuoteService;

@RestController
public class QuoteController {
	@Autowired
	private QuoteService qouteService;
	 
	@RequestMapping("/quote")
	public Quote getQuote(@RequestBody Quote quote) {
		return qouteService.getQuote(quote.getCustomers(), quote.getVehicles());
    }
}