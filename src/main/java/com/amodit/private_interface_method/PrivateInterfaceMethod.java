package com.amodit.private_interface_method;

public class PrivateInterfaceMethod implements Car{

	public static void main(String[] args) {
		
		Car interf = new PrivateInterfaceMethod();
		interf.m1();
		Car.m2();
		
		

	}

}
