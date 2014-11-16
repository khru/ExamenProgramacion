import java.util.Scanner;
/**
 * @author khru
 * Descripción:  El programa recoge valores positivos, la única manera de salir es con un 0, y si metes un número negativo muestra un error 
 */
public class CifraEVR 
{

	public static void main(String[] args) 
	{
		//Delcaración e inicialización de variables
		Scanner teclado = new Scanner(System.in);
		
		int num1,num2, cont = 0;
		System.out.println("Para salir presiona 0");
		System.out.println("Introduce una serie de númerodesde el 1 hasta "+Integer.MAX_VALUE+": ");
		//bucle y/o entrada por teclado
		do
		{
			num1 = teclado.nextInt();
			num2 = num1; 
			if(num1 > 0 && num1 <= Integer.MAX_VALUE ) //acoto el rango positivos
			{
				
				while (num1 != 0)
				{
					num1 = num1/10;
					cont++;
				}
				System.out.println(cont);
				cont = 0;
			}
			else if (num2 == 0)//condición para salir
			{
				System.out.println("Adios");
			}
			else//Errores
			{
				System.out.println("ERROR el parametro introducido no es valido");
			}
		}while(num2 != 0);//condición de salida
	}
}
