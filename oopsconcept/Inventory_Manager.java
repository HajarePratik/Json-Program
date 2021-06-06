package com.bridgelabz.jsonprograms.oopsconcept;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.jsonprograms.model.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Inventory_Manager 
{

	private List<Stock_Details> rice=new ArrayList<Stock_Details>();
	private List<Stock_Details> wheat=new ArrayList<Stock_Details>();
	private List<Stock_Details> pulses=new ArrayList<Stock_Details>();
	
	public void readInventory(List<Stock_Details> invent)
	
	{
		
		for(Stock_Details stock: invent)
		{
			 if(stock.getId()==1001)
			 {
				 rice.add(stock);
			 }
			 if(stock.getId()==1002)
			 {
				 wheat.add(stock);
			 }
			 if(stock.getId()==1003)
			 {
				 pulses.add(stock);
			 }
		}
	}
	
	public int getTotalRicePrice()
	{
		int price=0;
		for(Stock_Details stock:rice)
		{
			price=price+stock.getPrice();
		}
		System.out.println("Rice Total Price Is:"+price);
		return 0;
	}
	
}
