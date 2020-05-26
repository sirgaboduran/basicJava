package gNumericTypes;

import libs.Input;

public class Adder {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is: "); // funcion para imprimir en consola
	    int x = Input.get_int(); // almacena el valor que introduzcas en la variable "x"
	    
	    // prompt user for y
	    System.out.print("y is: "); // funcion para imprimir en consola
	    int y = Input.get_int(); // almacena el valor que introduzcas en la variable "y"
	    
	    // calculate sum for user
	    System.out.println("sum is " + (x + y) + "\n"); // imprime en consola el valor de la suma de la variable "x" y "y"
	}
}