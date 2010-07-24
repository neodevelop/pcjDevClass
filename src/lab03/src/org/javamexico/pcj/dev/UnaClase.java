package org.javamexico.pcj.dev;

//Esto es para el ejercicio
//import org.javamexico.pcj.dev.demo.Persona;

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