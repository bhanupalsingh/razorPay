package com.razor.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Database {
	private int id;
	private String name;
	List<Table> table;

	private static AtomicInteger ao = new AtomicInteger();

	
	
	
	public Database(String name) {
		this.setId();
		this.name = name;
		this.table = new ArrayList<Table>();
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = ao.incrementAndGet();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Table> getTable() {
		return table;
	}

	public void setTable(List<Table> table) {
		this.table = table;
	}
	
	public void addTable(Table table) {
		this.table.add(table);
		System.out.println("table added successfully");
	}
	
	
	
	
	
}	
