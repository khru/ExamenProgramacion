public class Usuario
{
	public String nif;
	public String nombre;
	public String apellidos;
	public String domicilio;
	public String correoE;
	public String fechaNacimiento;
	public String fechaAlta;
	public String claveAcceso;
	public String rol;
	@Override
	public String toString() 
	{
		return "Usuario [nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" + domicilio
				+ ", correoE=" + correoE + ", fechaNacimiento=" + fechaNacimiento + ", fechaAlta=" + fechaAlta
				+ ", claveAcceso=" + claveAcceso + ", rol=" + rol + "]";
	}
}
