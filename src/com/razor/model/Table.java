package com.razor.model;

import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Table {

	private int id;
	private String name;
	private Hashtable<Integer,List<Object>> value;
	private List<Column> column;
	
	private static AtomicInteger ao = new AtomicInteger();

	
	public Table(String name, List<Column> column) {
		this.setId();
		this.name = name;
		this.value = new Hashtable<>();
		this.column = column;
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
	public Hashtable<Integer, List<Object>> getValue() {
		return value;
	}
	public void setValue(Hashtable<Integer, List<Object>> value) {
		this.value = value;
	}
	public List<Column> getColumn() {
		return column;
	}
	public void setColumn(List<Column> column) {
		this.column = column;
	}

	
	
	
	
}

