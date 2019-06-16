package com.epam.task;

public class RemoveCharacterA {

	public String remove(String string) {
		// TODO Auto-generated method stub
		int len = string.length();
		String str = string;
		
		if(string.charAt(1)=='A')
			str = string.charAt(0)+string.substring(2,len);
		
		len = str.length();
		
		if(str.charAt(0)=='A')
			str = str.substring(1,len);
		
		return str;
	}

}
