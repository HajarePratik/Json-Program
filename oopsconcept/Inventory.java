package com.bridgelabz.jsonprograms.oopsconcept;

import java.io.File;
import java.util.List;

import com.bridgelabz.jsonprograms.model.Stock_Details;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Inventory 
{

	public List<Stock_Details> convertJsonToObj(String filePath)
	{
		try
		{
			ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			File jsonFile = new File(filePath);
			List<Stock_Details> invent = objectMapper.readValue(jsonFile, new TypeReference<List<Stock_Details>>() 
			{
			
			});
			
			return invent;
		}
		catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory jsonUtil = new Inventory();
		List<Stock_Details> listStock = jsonUtil.convertJsonToObj("D:\\Eclipse Java Program\\JsonPrograms\\src\\main\\java\\com\\bridgelabz\\jsonprograms\\jsonfile\\Inventory_details.json");
		
		Inventory_Manager manager = new Inventory_Manager();
		manager.readInventory(listStock);
		
		System.out.println(manager.getTotalRicePrice());
		System.out.println(manager.getTotalWheatPrice());
		System.out.println(manager.getTotalPulsesPrice());
		

		System.out.println(manager.getTotalRiceWeight());
		System.out.println(manager.getTotalWheatWeight());
		System.out.println(manager.getTotalPulsesWeight());
		
		System.out.println("Total Inventary Value Is : "+(manager.getTotalValueRice() + manager.getTotalValueWheat() + manager.getTotalValuePulses()));
	
	}

}
