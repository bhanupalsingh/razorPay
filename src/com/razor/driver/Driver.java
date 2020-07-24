package com.razor.driver;

import java.util.ArrayList;
import java.util.Scanner;

import com.razor.service.Service;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Service service = new Service();
		
		
		//"adddb test"
		//"addtable 1 razor"
		//columnname
		while(true) {
			String[] input = sc.nextLine().split(" ");
			switch(input[0]){
			case "adddb":
				service.createDb(input[1]);
				break;
			case "addtable":
				ArrayList<String> column = new ArrayList<>();
				column.add("id");
				column.add("name");
				ArrayList<String> columnType = new ArrayList<>();
				columnType.add("INT");
				columnType.add("STRING");
				ArrayList<Boolean> isMandatory = new ArrayList<>();
				isMandatory.add(true);
				isMandatory.add(false);
//				ArrayList<String> column =  (ArrayList<String>) Arrays.asList(sc.nextLine().split(","));
//				ArrayList<String> columnType =  (ArrayList<String>) Arrays.asList(sc.nextLine().split(","));
//				ArrayList<String> isMandatory =  (ArrayList<String>) Arrays.asList(sc.nextLine().split(","));

				service.createTable(Integer.parseInt(input[1]), input[2],column, columnType , isMandatory);
				break;
			case "addrow":
				ArrayList<String> column1 = new ArrayList<>();
				column1.add("id");
				column1.add("name");
				ArrayList<Object> value = new ArrayList<>();
				value.add("1");
				value.add("bhanus");
				
				
				
				service.insertRow(1,  value , column1);
				break;
			
			
			}
		
		
		}
		
		
		
		
	}
}
