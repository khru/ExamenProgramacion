import java.util.*;
/**
 * @author Emmanuel Valverde Ramos
 */
public class examen2 {

    public static void main(String[] args)
    {
        int num = 0;
        String linea = "";
        System.out.println("introduce un número desde el -10 hasta el 10");
        num = new Scanner(System.in).nextInt();
        if((num < -10)|| (num > 10))
        {
            error();
        }
        else
        {
        	control(num, linea); 
        }

    }
    public static void control(int num, String linea)
    {
    	if(num < 0)
        {
        	linea = blancos(num,linea) + asteriscos(num,linea) +"|";
            System.out.println(linea);
        }
        else if(num > 0)
        {
            linea = blancos(num,linea) + "|" +asteriscos(num,linea);
            System.out.println(linea);
        }
        else
        {
        	linea = blancos(num,linea) + "|";
        	System.out.println(linea);
        }
    }
    public static void error()
    {
        System.out.println("El parametro introducido es erroneo");
    }
    public static String asteriscos(int num, String linea)
    {
        if(num < 0)
        {
            for(int i = 0;i > num;i--)
            {
                linea += "*";
                if (i + num == 0)
                {
                    linea += "|";
                }
            }
        }
        else if(num > 0)
        {
            for(int i = 0; i < num;i++)
            {
                linea += "*";
            }
        }
        return linea;
    }
    
    public static String blancos(int num, String linea)
    {
        int calculo;
        if(num < 0)
        {
            
            if(num == -10)
            {
            	
            }
            else
            {
            	 calculo = num + 10;
                 for(int i = 0; i < calculo; i++)
                 {
                     linea += " ";
                 }
            }
        }
        else if (num > 0)
        {
            for(int j = 0;j < 10;j++)
            {
                linea += " ";
            }
        }
        else
        {
        	for(int j = 0;j < 10;j++)
            {
                linea += " ";
            }
        }
        return linea;
    }
}
