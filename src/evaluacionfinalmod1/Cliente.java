package evaluacionfinalmod1;
/**

 * Esta clase extiende de Usuario, tiene atributos, constructores con y sin parametro,
 * mutadores y accesores, metodo analizar usario, metodo toString, listar Usuario,
 * obtenerNombre y obtenerSistemaDeSalud

 * @authores: Mauricio Sepulveda, Mauricio Marin, Nicolas Bonilla, Marcos Hanson

 * @version: 8/02/2021A

 */
public class Cliente extends Usuario {

	// declaracion de atributpos
	private Integer rut;
	private String nombres;
	private String apellidos;
	private String telefono;
	private String afp;
	private Integer salud;
	private String direccion;
	private String comuna;
	private Integer edad;

	//constructor vacio
	public Cliente() {
		super();
	}
	//constructor con parametros de la propia clase y heredados de la clase padre Usuario
	public Cliente(String nombre, String fechaNacimiento, Integer run, Integer rut, String nombres, String apellidos,
			String telefono, String afp, Integer salud, String direccion, String comuna, Integer edad) {
		super(nombre, fechaNacimiento, run);
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.salud = salud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	//mutadores y accesores
	public Integer getRut() {
		return rut;
	}

	public String getNombres() {
		return nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getAfp() {
		return afp;
	}

	public Integer getSalud() {
		return salud;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setRut(Integer rut) {
		this.rut = rut;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public void setSalud(Integer salud) {
		this.salud = salud;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	// Metodo obtenerNombre que retorna nombre y apellido concatenados
	public String obtenerNombre() {
		String nomb = "nombre: " + nombres + " " + apellidos;

		return nomb;
	}
	
	//M Metodo obtenerSistemaSalud que retorna el nombre de la opcion seleccionada por consola
	public String obtenerSistemaSalud() {
		String resultado = null;
		if (salud == 1) {
			resultado = "Fonasa";
		} else {
			resultado = "Isapre";
		}

		return resultado;
	}
	
	// Metodo toString, retorna los atributos de la clase Cliente
	@Override
	public String toString() {
		return "Cliente Rut: " + rut + ", Nombres: " + nombres + ", Apellidos:" + apellidos + ", Telefono:" + telefono
				+ ", AFP: " + afp + ", Sistema de Salud: " + obtenerSistemaSalud() + ", Direccion: " + direccion + ", Comuna: " + comuna + ", Edad: "
				+ edad;
	}
	
	/* metodo analizar usuario, retorna atributos de analizar usuario del padre y los atributos 
	de la clase Cliente*/
	@Override
	public void analizarUsuario() {

		super.analizarUsuario();
		System.out.println("direccion: " + direccion);
		System.out.println("comuna: " + comuna);

	}
	/*metodo listarUsuario
	*almacena la informacion que se ingresa en Cliente pero con atributos de Usuario*/
	@Override
	public void listarUsuario() {
		super.listarUsuario();

	}

	

}
