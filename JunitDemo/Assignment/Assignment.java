package com;

interface A{
	public void xyz();
}

class Abc implements A{
	private int callCount = 0;
	private int number = 1;
	
	//Power of 2
	public void xyz() {
		callCount++;
		number = 2*number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public int getCallCount() {
		return callCount;
	}
}

interface NumberString{
	public String returnString(int n);
}

public class Assignment {
	public static void main(String[] args) {
		System.out.print("Main running");
		
	}
}
