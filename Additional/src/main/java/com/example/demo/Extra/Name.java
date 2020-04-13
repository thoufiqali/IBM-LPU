package com.example.demo.Extra;

import lombok.Setter;

@Setter
public class Name {
	
	private Address myaddress ;
	
	public String myname()
	{
		return "Shyam";
	}
	public String address()
	{
		return myaddress.address();
	}

}
