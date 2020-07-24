package com.razor.model;

public class StringType extends Type {

	private static int minvalue = 0;
	private static int maxvalue = 20;
	
	@Override
	public boolean isValid(Object o) {
		try {
			String  i =o.toString();
			int l = i.length();
			if(l>= minvalue && l<= maxvalue) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean convertValue(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

}
