package com.androidbook.stockquoteservice;
import com.androidbook.stockquoteservice.stock2.Person;
interface IStockQuoteService {
	double getQuote(String ticker);
	String getPersonQuote(in String ticker,in Person requester);
}

