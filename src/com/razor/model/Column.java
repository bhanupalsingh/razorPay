package com.razor.model;

import java.util.concurrent.atomic.AtomicInteger;

public class Column {
	private int id;
	private String name;
	private Type type;
	private TypeEnum enumValue;
	private boolean isMandatory = false; 
	
	
	
	private static AtomicInteger ao = new AtomicInteger();

	
	
	public Column(String name, Type type, TypeEnum enumValue ,boolean isMandatory) {
		this.setId();
		this.name = name;
		this.type = type;
		this.enumValue = enumValue;
		this.isMandatory = isMandatory;
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public TypeEnum getEnumValue() {
		return enumValue;
	}
	public void setEnumValue(TypeEnum enumValue) {
		this.enumValue = enumValue;
	}
	
	
	
	public boolean constraintCheck(Object object) {
		if(this.isMandatory) {
			if(object == null) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
}
