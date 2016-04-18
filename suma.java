//Vamos a realizar la suma de dos enteros

import java.util.Scanner;// Importamos clase Scanner para datos introducidos

//Creamos clase publica Suma

public class suma{
	
		//el metodo main empieza 
		public static void main (String args[]){
		
		// Creamos objeto Scanner para obtener entrada de la ventana de comandos	
		Scanner entrada = new Scanner(System.in);
		
		int numero1;//Primer número a sumar
		int numero2;//Segundo número a sumar
		int suma;//Resultado de suma
			
		//Pedimos al usuario su primer numero
		System.out.println("Introduce un numero");
		//Leemos con entrada.nextInt() el numero introducido por el usuario
		numero1 = entrada.nextInt();	
		
		//Pedimos al usuario su segundo numero
		System.out.println("Introduce el segundo numero");
		//Leemos con entrada.nextInt() el numero introducido por el usuario
		numero2 = entrada.nextInt();	
		
		//Guardamos en la variable suma los dos dos números
		suma = numero1 + numero2;
		
		//Imprimimos resultado
		
		System.out.println("La suma de "+ numero1 +" y "+ numero2 +" da como resultado "+ suma); 	// " + " + numero2 + "es de "+ suma +);
		
		
		} // fin del método main

} // fin de la clase main
