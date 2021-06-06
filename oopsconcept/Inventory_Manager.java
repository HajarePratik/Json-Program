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
		return price;
	}
	
	public int getTotalWheatPrice()
	{
		int price=0;
		for(Stock_Details stock:wheat)
		{
			price=price+stock.getPrice();
		}
		System.out.println("Wheat Total Price Is:"+price);
		return price;
	}
	public int getTotalPulsesPrice()
	{
		int price=0;
		for(Stock_Details stock:pulses)
		{
			price=price+stock.getPrice();
		}
		System.out.println("Pulses Total Price Is:"+price);
		return price;
	}
	
	public int getTotalRiceWeight()
	{
		int weight=0;
		for(Stock_Details stock:rice)
		{
			weight=weight+stock.getWeight();
		}
		System.out.println("Rice Total Weight Is:"+weight);
		return weight;
	}
	
	public int getTotalWheatWeight()
	{
		int weight=0;
		for(Stock_Details stock:wheat)
		{
			weight=weight+stock.getWeight();
		}
		System.out.println("Wheat Total Weight Is:"+weight);
		return weight;
	}
	public int getTotalPulsesWeight()
	{
		int weight=0;
		for(Stock_Details stock:pulses)
		{
			weight=weight+stock.getWeight();
		}
		System.out.println("Pulses Total Weight Is:"+weight);
		return weight;
	}
	
	
	public int getTotalValueRice()
	{
		int value=0;
		for(Stock_Details stock:rice)
		{
			value=value+stock.getPrice() * stock.getWeight();
		}
		System.out.println("Rice Total Value Is:"+value+ " Rs");
		return value;
	}
	
	public int getTotalValueWheat()
	{
		int value=0;
		for(Stock_Details stock:wheat)
		{
			value=value+stock.getPrice() * stock.getWeight();
		}
		System.out.println("Wheat Total Value Is:"+value+ " Rs");
		return value;
	}
	public int getTotalValuePulses()
	{
		int value=0;
		for(Stock_Details stock:pulses)
		{
			value=value+stock.getPrice() * stock.getWeight();
		}
		System.out.println("Pulse Total Value Is:"+value+ " Rs");
		return value;
	}
	
	
}
