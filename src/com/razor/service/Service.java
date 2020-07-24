package com.razor.service;

import java.util.ArrayList;
import java.util.List;

import com.razor.manager.Manager;
import com.razor.model.Column;
import com.razor.model.Database;
import com.razor.model.Table;
import com.razor.model.Type;
import com.razor.model.TypeEnum;
import com.razor.model.TypeFactoryClass;

public class Service {
	private Manager manager = Manager.getInstance();
	
	public void createDb(String name) {
		Database db = new Database(name);
		manager.addDB(db);
	}
	
	public void createTable(int dbId , String name , List<String> columnName , List<String> columnType , List<Boolean> mandatory  ) {
		List<Column> column = new ArrayList<>();
		for(int i=0;i<columnName.size();i++) {
			TypeEnum enumType = TypeEnum.valueOf(columnType.get(i).toUpperCase());
			if(enumType == null) {
				System.out.println("Invalid type");
			}
			Column col = new Column(columnName.get(i) , null , enumType , mandatory.get(i));
			column.add(col);
		}
		Table table = new Table(name,column);
		Database db = manager.getDb(dbId);
		db.addTable(table);
		manager.addTable(table);
	}
	
	public void insertRow(int tableId , List<Object> value , List<String> columnName) {
		Table table = manager.getTable(tableId);
		//for simplicity 
		List<Column> listOfColumns = table.getColumn();
		List<Object> listOfValue = new ArrayList<Object>(listOfColumns.size());
		
		
		for(int i=0;i<columnName.size();i++) {
			String columnN  = columnName.get(i);
			for(int j=0;j<listOfColumns.size();j++) {
				if(listOfColumns.get(j).getName().equalsIgnoreCase(columnN)) {
					Object actualValue = value.get(i);
					Column actualColumn = listOfColumns.get(j);
					TypeEnum typeEnum = actualColumn.getEnumValue();
					Type type = TypeFactoryClass.getInstance(typeEnum);
					if(type.isValid(actualValue) && actualColumn.constraintCheck(actualValue)) {
						listOfValue.add(j, actualValue);
					}else {
						System.out.println("wrong input");
						return ;
					}
					break;
				}
			}
		}
		
		System.out.println("all columns value added successfully");
		
		System.out.println(table.toString());
		
		
	}
	
	
	
	
	
	
	
	
}
