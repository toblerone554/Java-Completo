// Vamos a hacer una resta con la clase Scanner

import java.util.Scanner;// Importamos clase Scanner para datos introducidos

// Creamos nuestra clase pública

public class resta 
{

//Comienza nuetro metodo main
		public static void main (String args[])
			
			{
				Scanner entrada = new Scanner(System.in); // Usamos la clase Scanner para recoger datos
//Declaramos nuestras variables
				int numero1;
				int numero2;
				int resta;
				
//Pedimos el primer número
				System.out.println("Introduce el primer número");	
//Leemos con entrada.nextInt() el numero introducido por el usuario
				numero1 = entrada.nextInt();	

//Pedimos el primer número
				System.out.println("Introduce el segundo número");
//Leemos con entrada.nextInt() el numero introducido por el usuario
				numero2 = entrada.nextInt();					

/*Una vez tenemos los dos números, los almacenamos en la variable resta
				resta = numero1-numero2;
*/
 				
//En lugar de usar el método normal, procedemos a imprimir el resultado sin usar variable
				System.out.println("El resultado de restar "+ numero1 +" y "+ numero2 +" es de "+ (numero1-numero2)  );

			}
}
