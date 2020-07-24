package com.razor.model;

public class TypeFactoryClass {
	public static Type getInstance(TypeEnum enumvalue) {
		if(enumvalue.equals(TypeEnum.INT)) {
			return new IntType();
		}else if(enumvalue.equals(TypeEnum.STRING)) {
			return new StringType();
		}else {
			return null;
		}
	}
}	
