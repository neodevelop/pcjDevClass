package org.javamexico.pcj.dev;

public class UnaClase {
	public static void main(String[] args) {
		String nombre = "Anonimo";
		if(args.length > 0) {
			nombre = args[0];
		}
		Persona p = new Persona(nombre);
		System.out.println("Hola " + p.getNombre());
	}
}