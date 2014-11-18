import java.util.Scanner;
/**
 * @author user
 */
public class examen21
{
	public static void main(String[] args) 
	{
		
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("Introduce un número a representar: ");
		num = teclado.nextInt();
		if((num > 10) || (num < -10))
		{
			error();	
		}
		else
		{
			System.out.println(obtenerBarraHorizontalEVR(num));
		}
	}
	public static String obtenerBarraHorizontalEVR(int num)
	{
		String buffer = "";
		char c = ' ';
		if (num < 0)
		{
			System.out.println(num);
			buffer = bloqueCaracteresEVR(11+num,' ')+bloqueCaracteresEVR(-num, '*')+"|";
		}
		else if (num > 0)
		{
			buffer = bloqueCaracteresEVR(10,' ')+"|"+bloqueCaracteresEVR(num, '*');
		}
		else
		{
			buffer = bloqueCaracteresEVR(10,' ')+"|"+bloqueCaracteresEVR(10,' ');
		}
		
		return buffer;
	}
	public static String bloqueCaracteresEVR(int num, char c)
	{
		String buffer = "";
		for(int i = 0; i < num; i++)
		{
			buffer += c;
		}
		return buffer;
	}
	public static void error()
	{
		System.out.println("Valor introducido erroneo");
	}

}
