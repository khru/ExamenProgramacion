public class Arbol{

    public static void main(String argumentos[]) {

        final int NUM_LINEAS = 8;           // Constante

        String arbol = copaEVR(NUM_LINEAS) + troncoEVR(NUM_LINEAS); // modifique el paametro que le le envia al metodo troncoEVR
        System.out.println(arbol);
    }
    /**
     * Genera un bloque de tamaño variable de caracteres iguales.
     * @param n, el tamaño del bloque.
     * @param c, el caracter base.
     * @return salida, el bloque obtenido.
     */
    static String bloqueCaracteres(int n, char c) {
        String salida = "";

        for (int i = 0; i < n; i++)
            salida += c;
        return salida;
    }
    /**
     * Crea un triangulo en forma de copa
     * @parm num, la constante que se le envia desde el main para crear la copa
     * @return buffer, es el String que contendrá toda la información formateada
     */
    static String copaEVR(int num)
    {
    	String buffer = "";
			for(int i = 1; i <= num;i++)
			{
				if (i != num) // mientras no sea el número introducido o constante se realizará las siguiente operaciones
				{
					buffer += bloqueCaracteres(num-i,' ') + bloqueCaracteres(1,'/') + bloqueCaracteres(((i * 2) - 3)+1, ' ');
					buffer += bloqueCaracteres(1, '\\') + bloqueCaracteres(1, '\r');
				}
				else //En la la última vuelta pondrá la parte final modificada
				{
					buffer += bloqueCaracteres(num-i,' ') + bloqueCaracteres(1,'/') + bloqueCaracteres(((i * 2) - 3)+1, '_');
					buffer += bloqueCaracteres(1, '\\') + bloqueCaracteres(1, '\r');
				}
			}
		return buffer; // Devolvemos el buffer.
    }
    /**
     * Descripción: Este metodo realiza el tronco para ello multiplicara el número restandole 2 para crear el tronco
     * @parm num, este será el número constante que se encuentra en el main
     * @return buffer, es la variable que contendrá todo la información
     */
   static String troncoEVR(int num)
   {
	   String buffer = "";
	   num = ((num * 2) /2); //operación matematica para centrar el tronco
	   for(int i = 1;i <= num;i++)// hay que ir desde el principio del árbol al final
	   {
		   if (i != num)// mientras no sea el número introducido o constante se realizará las siguiente operaciones
		   {
			   buffer += bloqueCaracteres(num-2, ' ') + bloqueCaracteres(1,'|') + bloqueCaracteres(2,' ');
			   buffer += bloqueCaracteres(1,'|') + bloqueCaracteres(1,'\n');
		   }
		   else //En la la última vuelta pondrá la parte final modificada
		   {
			   buffer += bloqueCaracteres(num-2, ' ') + bloqueCaracteres(1,'|') + bloqueCaracteres(2,'_');
			   buffer += bloqueCaracteres(1,'|') + bloqueCaracteres(1,'\n');
		   }
	   }
	   return buffer;
   }
} 
