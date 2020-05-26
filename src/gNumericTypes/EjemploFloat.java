package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		System.out.println("Introduce el valor de 'f' como dividendo");
		float f = Input.get_float(); // Es para introducir un valor en la variable de tipo float "f"
		System.out.println("Introduce el valor de 'f2' como divisor");
		float f2 = Input.get_float(); // Es para introducir un valor en la variable de tipo float "f2"
		System.out.println("El resultado es: ");
		Input.print("f/f2 = " + (f/f2)); // Te despliega en consola la division de la variable "f" entre "f2"

	}

}
