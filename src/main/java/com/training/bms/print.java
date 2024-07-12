package com.training.bms;

public class print {
	
	String s;
	
	print()
	{
		s="empty";
	}
	print(String a)
	{
		s=a;
	}
	void printgreeting()
	{
		System.out.println("HI"+ s+" !!");
	}
}
