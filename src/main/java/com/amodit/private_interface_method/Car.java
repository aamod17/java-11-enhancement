package com.amodit.private_interface_method;

public interface Car {
	
	private static void starts(String key) {
		System.out.println("Tata Car starts by using "+key);
		//stops(key);
	}
	private void stops(String key) {
		System.out.println("Tata Car stops by using "+key);
		carKey(key);
	}
	
	private void carKey(String arg0) {
		starts(arg0);
	}
	
	
	
	default void m1() {
		starts("tata key ");
		stops("tata key");
	}
	static void m2() {
		starts("tata key");
	}
	

}
