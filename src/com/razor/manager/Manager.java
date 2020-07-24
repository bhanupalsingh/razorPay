package com.razor.manager;

import java.util.Hashtable;

import com.razor.model.Database;
import com.razor.model.Table;

public class Manager {
	Hashtable<Integer, Database> db;
	Hashtable<Integer , Table >table ;
	
	
	private static Manager manager;
	
	
	private Manager() {
		db = new Hashtable<Integer, Database>();
		table = new Hashtable<Integer , Table>();
	}
	
	
	public static Manager getInstance() {
		if(manager == null) {
			manager = new Manager();
		}
		
		return manager;
	}


	public Database getDb(int id) {
		return db.get(id);
	}


	public void setDb(Hashtable<Integer, Database> db) {
		this.db = db;
	}


	public  Table getTable(int id) {
		return table.get(id);
	}


	public void setTable(Hashtable<Integer, Table> table) {
		this.table = table;
	}
	
	
	public void addDB(Database db) {
		this.db.put(db.getId(),db);
	}
	
	public void addTable(Table table ) {
		this.table.put(table.getId() , table);
	}
	
	
	

}
