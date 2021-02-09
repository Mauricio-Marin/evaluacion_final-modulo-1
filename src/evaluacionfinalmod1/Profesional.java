package evaluacionfinalmod1;
/**

 * Esta clase extiende de Usuario, tiene atributos, constructores con y sin parametro,
 * mutadores y accesores, metodo analizar usario, metodo toString y listar Usuario

 * @authores: Mauricio Sepulveda, Mauricio Marin, Nicolas Bonilla, Marcos Hanson

 * @version: 8/02/2021A

 */
public class Profesional extends Usuario {
	
	//declaracion de atributos
	private String titulo;
	private String fechaIng;

	// constructor vacio
	public Profesional() {
		super();
	}
	
	// constructor con parametros de la misma clase y de la clase padre Usuario
	public Profesional(String nombre, String fechaNacimiento, Integer run, String titulo, String fechaIng) {
		super( nombre, fechaNacimiento, run);
		this.titulo = titulo;
		this.fechaIng = fechaIng;
	}
	
	// accesores y mutadores
	public String getTitulo() {
		return titulo;
	}

	public String getFechaIng() {
		return fechaIng;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setFechaIng(String fechaIng) {
		this.fechaIng = fechaIng;
	}
	
	// Metodo toString, retorna los atributos de la clase Profesional
	@Override
	public String toString() {
		return "Profesional Titulo: " + titulo + ", Fecha de Ingreso: " + fechaIng;
	}
	
	/* metodo analizar usuario, retorna atributos de analizar usuario del padre y los atributos 
	de la clase Profesional*/
	@Override
	public void analizarUsuario() {
		// TODO Auto-generated method stub
		super.analizarUsuario();
		System.out.println("Titulo: " + titulo);
		System.out.println("Fecha de ingreso: " + fechaIng);
	}
	
	/*metodo listarUsuario
	*almacena la informacion que se ingresa en Profesional pero con atributos de Usuario*/
	@Override
	public void listarUsuario() {
		// TODO Auto-generated method stub
		super.listarUsuario();
	}
	
}
