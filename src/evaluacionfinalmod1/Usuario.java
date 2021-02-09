package evaluacionfinalmod1;
/**

 * Clase padre de Cliente, Profesional y Administrativo, implementa la interface Asesoria, tiene atributos, 
 * constructores con y sin parametro, mutadores y accesores, metodo analizar usario,
 *  metodo toString, listar Usuario y mostrarEdad

 * @authores: Mauricio Sepulveda, Mauricio Marin, Nicolas Bonilla, Marcos Hanson

 * @version: 8/02/2021A

 */
public class Usuario implements Asesoria {

	//declaracion de atributos
	private String nombre;
	private String fechaNacimiento;
	private Integer run;

	//constructor vacio
	public Usuario() {
		super();

	}
	
	//constructor con parametros de la propia clase
	public Usuario(String nombre, String fechaNacimiento, Integer run) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	//accesores y mutadores
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Integer getRun() {
		return run;
	}

	public void setRun(Integer run) {
		this.run = run;
	}

	// metodo mostrarEdad que imprime por consola la edad calculada en base a la fecha de nacimiento
	public void mostrarEdad() {
		Integer aNacimiento = Integer.parseInt(fechaNacimiento.substring(fechaNacimiento.length() - 4));
		System.out.println("La edad del usuario es :" + (2021 - aNacimiento)); // calendar.year arroja 1

	}

	// Metodo toString, retorna los atributos de la clase Usuario
	@Override
	public String toString() {
		return "Usuario Nombre: " + nombre + ", Fecha de Nacimiento: " + fechaNacimiento + ", Run: " + run;
	}

	/* metodo analizar usuario, imprime por consola la informacion de las clases hijas (Cliente,
	 * Profesional y Administrativo) con los atributos del padre, nombre y run*/
	@Override
	public void analizarUsuario() {
		System.out.println("Nombre de usuario :" + nombre);
		System.out.println("run :" + run);
	}

	/*metodo listarUsuario
	*entrega los atributos para almacenar los datos de las clases hijas: Cliente, Profesional y Administrativo*/
	@Override
	public void listarUsuario() {
		System.out.println("Nombre de usuario :" + nombre);
		System.out.println("run :" + run);
		System.out.println("fecha de nacimiento :" + fechaNacimiento);
	}



}
