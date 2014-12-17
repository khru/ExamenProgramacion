/**
 * @author khru
 * @version 1.0 17/12/2014
 */
public class PrincipalEVR
{
	//Creación de constante para crear array de tipo usuario
	public static final int MAX_USUARIOS = 45;
	
	//Creacion de array de usuarios
	public static Usuario datosUsuario[] = new Usuario[MAX_USUARIOS];
	/**
	 * Descipción: metodo main
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Creación de patron
		int p[] = {1,0,1,0,0,1,1};
		cargarUsuariosPatronEVR(p);
		mostrarUsuarios();
	}
	/**
	 * Descripción: es un método void que crea usuarios dependiendo de un patron, si el patron se termina, sesigue utilizandose hasta el
	 * final
	 * @param patron
	 */
	public static void cargarUsuariosPatronEVR(int patron[])
	{
		//Inicializamos un bucle con 2 variables para poder trabajar con 2 cosas a la vez
		// j se encarg del patron
		// i de las posiciones de los usuarios
		for(int i = 0, j = 0;i < MAX_USUARIOS;i++ ,j++)// independientemente del tamaño del patron este bucle solo ira hasta MAX_USUARIOS
		{
			if(j >= patron.length)// si j llega al maximo del patron se deja a 0
			{
				j = 0;
			}
			if(patron[j] == 1)//si la posición del patron[j] contiene un 1 se crea el usuario con sus atributos
			{
				datosUsuario[i] = new Usuario();
				datosUsuario[i].nif = i+"14589654M";
				datosUsuario[i].nombre = "khru"+i;
				datosUsuario[i].apellidos = "programador"+i;
				datosUsuario[i].correoE = "notengocorreo"+i+"@"+"gmail.com";
				datosUsuario[i].domicilio = "calle ingeniero de la cierva Nº "+i+" ,Murcia";
				datosUsuario[i].fechaNacimiento = "199"+i+"."+j+".5";
				datosUsuario[i].fechaAlta = "2014."+i+"."+i;
				datosUsuario[i].claveAcceso = "yo"+i;
				datosUsuario[i].rol = "usuario";
			}
		}
	}
	/**
	 * Descripción: método void que lo que hace es mostrar los usuarios creados cn el metodo cargarUsuariosPatronEVR
	 */
	public static void mostrarUsuarios()
	{
		for(int i = 0;i < datosUsuario.length;i++)
		{
			if(datosUsuario[i] != null)
			{
				System.out.println(datosUsuario[i].toString());
			}
		}
	}
}
