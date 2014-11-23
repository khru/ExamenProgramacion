import java.util.Scanner;


public class Arbol 
{
	public static void main(String[] args) 
	{
		String buffer = "";
		int num;
		try
		{
			Scanner teclado = new Scanner(System.in);
			System.out.println("Introduce un valor por teclado: ");
			num = teclado.nextInt();
			if(num <= 0)
			{
				error();
			}
			else
			{
				buffer = copa(num) + tronco(num);
				System.out.println(buffer);
			}
			
			teclado.close();
		}
		catch(Exception entero)
		{
			error();
		}
		
	}
	/**
	 * Este metodo es un metodo vacio solo se usa en el caso de que se encuentre un error
	 */
	static void error()
	{
		System.out.println("El parametro introducido es erroneo");
	}
	/**
	 * Metodo que relaiza la inserción de caracteres
	 * @parm n, el número de veces que se va ha realizar
	 * @parn c, el tipo de caracter que hay que implementar
	 * return buffer, es el String que almacena los caracteres 
	 */
	static String bloqueCaracter(int n, char c)
	{
		String buffer = "";
		for (int i = 1;i <= n;i++)
		{
			buffer += c;
		}
		return buffer;
	}
	
	/**
	 * @parm num, es el número que entra por teclado
	 * @return buffer, es el String que contiene la información formateada
	 */
	static String copa(int num)
	{
		String buffer = "";
		for(int i = 1;i <= num;i++)
		{
			if(i != num)
			buffer += bloqueCaracter(num - i, ' ')+ bloqueCaracter(1, '/') + bloqueCaracter(((i * 2)-2),' ') + bloqueCaracter(1,'\\') + bloqueCaracter(1, '\r');
			else
			{
				buffer += bloqueCaracter(num - i, ' ')+ bloqueCaracter(1, '/') + bloqueCaracter(((i * 2)-2),'_') + bloqueCaracter(1,'\\') + bloqueCaracter(1, '\r');
			}
		}
		return buffer;
	}
	/**
	 * 
	 * @param num, parametro númerico que entra al método para calcular el tamaño del tronco
	 * @return buffer
	 */
	static String tronco(int num)
	{
		String buffer = ""; 
		for(int i = 0;i <= num ;i++)
		{
			if(i != num)
			{
				buffer += bloqueCaracter((num -2) , ' ') + bloqueCaracter(1, '|') + bloqueCaracter(2, ' ') + bloqueCaracter(1, '|') + bloqueCaracter(1, '\n');
			}
			else
			{
				buffer += bloqueCaracter((num -2) , ' ') + bloqueCaracter(1, '|') + bloqueCaracter(2, '_') + bloqueCaracter(1, '|') + bloqueCaracter(1, '\n');
			}
		}
		return buffer;
	}
}
