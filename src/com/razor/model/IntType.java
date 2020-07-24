package com.razor.model;

public class IntType extends Type {

	private static int minvalue = -1024;
	private static int maxvalue = 1024;
	
	@Override
	public boolean isValid(Object o) {
		try {
			int i =Integer.parseInt(o.toString());
			if(i>= minvalue && i<= maxvalue) {
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
