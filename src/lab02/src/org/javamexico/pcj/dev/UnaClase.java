package org.javamexico.pcj.dev;

import java.util.Properties;

public class UnaClase {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		p.setProperty("myProp", "myValue"); 
		p.list(System.out);
	}
}