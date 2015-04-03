public class Arbol 
{
	 public static void main(String argumentos[])
	 {

	        final int NUM_LINEAS = 8;           // Constante

	        String arbol = copa(NUM_LINEAS) + tronco(NUM_LINEAS); // modifique el paametro que le le envia al metodo troncoEVR
	        System.out.println(arbol);
	 }

	    /**
	     * Genera un bloque de tamaño variable de caracteres iguales.
	     * @param n, el tamaño del bloque.
	     * @param c, el caracter base.
	     * @return salida, el bloque obtenido.
	     */
	    static String bloqueCaracteres(int n, char c) 
	    {
	    	
	        StringBuilder salida = new StringBuilder();
	        for (int i = 0; i < n; i++)
	            salida = salida.append(c);

	        return salida.toString();
	    }
	    
	    /**
	     * Crea un triangulo en forma de copa
	     * @parm num, la constante que se le envia desde el main para crear la copa
	     * @return buffer, es el String que contendrá toda la información formateada
	     */
	    static String copa(int num)
	    {
	    	StringBuilder buffer = new StringBuilder();
				for(int i = 1; i <= num;i++)
				{
					if (i != num) // mientras no sea el número introducido o constante se realizará las siguiente operaciones
					{
						buffer = buffer.append(bloqueCaracteres(num-i,' '));
						buffer = buffer.append(bloqueCaracteres(1,'/'));
						buffer = buffer.append(bloqueCaracteres(((i * 2) - 3)+1, ' '));
						buffer = buffer.append(bloqueCaracteres(1, '\\'));
						buffer = buffer.append(bloqueCaracteres(1, '\r'));
					}
					else //En la la última vuelta pondrá la parte final modificada
					{
						buffer = buffer.append(bloqueCaracteres(num-i,' '));
						buffer = buffer.append(bloqueCaracteres(1,'/')); 
						buffer = buffer.append(bloqueCaracteres(((i * 2) - 3)+1, '_'));
						buffer = buffer.append(bloqueCaracteres(1, '\\'));
						buffer = buffer.append(bloqueCaracteres(1, '\r'));
					}
				}
			return buffer.toString(); // Devolvemos el buffer.
	    }
	    /**
	     * Descripción: Este metodo realiza el tronco para ello multiplicara el número restandole 2 para crear el tronco
	     * @parm num, este será el número constante que se encuentra en el main
	     * @return buffer, es la variable que contendrá todo la información
	     */
	   static String tronco(int num)
	   {
		   StringBuilder buffer = new StringBuilder();
		   num = ((num * 2) /2); //operación matematica para centrar el tronco
		   for(int i = 1;i <= num;i++)// hay que ir desde el principio del árbol al final
		   {
			   if (i != num)// mientras no sea el número introducido o constante se realizará las siguiente operaciones
			   {
				   buffer = buffer.append(bloqueCaracteres(num-2, ' ')); 
				   buffer = buffer.append(bloqueCaracteres(1,'|'));
				   buffer = buffer.append(bloqueCaracteres(2,' '));
				   buffer = buffer.append(bloqueCaracteres(1,'|'));
				   buffer = buffer.append(bloqueCaracteres(1,'\n'));
			   }
			   else //En la la última vuelta pondrá la parte final modificada
			   {
				   buffer = buffer.append(bloqueCaracteres(num-2, ' '));
				   buffer = buffer.append( bloqueCaracteres(1,'|'));
				   buffer = buffer.append( bloqueCaracteres(2,'_'));
				   buffer = buffer.append(bloqueCaracteres(1,'|'));
				   buffer = buffer.append(bloqueCaracteres(1,'\n'));
			   }
		   }
		   return buffer.toString();
	   }
}
