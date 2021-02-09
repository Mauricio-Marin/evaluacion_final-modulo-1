package evaluacionfinalmod1;
/**

 * Esta clase extiende de Usuario, tiene atributos, constructores con y sin parametro,
 * mutadores y accesores, metodo analizar usario, metodo toString y listar Usuario

 * @authores: Mauricio Sepulveda, Mauricio Marin, Nicolas Bonilla, Marcos Hanson

 * @version: 8/02/2021A

 */
public class Administrativo extends Usuario{
	// declaracion de variables
	private String area;
	private String experiencia;
	// constructor con parametro
	public Administrativo(String nombre, String fechaNacimiento, Integer run,String area, String experiencia) {
		super(nombre, fechaNacimiento, run);
		this.area = area;
		this.experiencia = experiencia;
	}
	// constructor sin parametro
	public Administrativo() {
		super();
	}
	//mutadores y accesores
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	// Metodo toString, retorna los atributos de la clase Administrativo
	@Override
	public String toString() {
		return "Administrativo Area: " + area + ", Experiencia Previa: " + experiencia;
	}
	
	/* metodo analizar usuario, retorna atributos de analizar usuario del padre y los atributos 
	de la clase Administrativo*/
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();//herencia de clase padre Usuario
		System.out.println("Area: " + area);
		System.out.println("Experiencia Previa :" + experiencia );
	}
	
	/*metodo listarUsuario
	*almacena la informacion que se ingresa en Administrativo pero con atributos de Usuario*/
	@Override
	public void listarUsuario() {
		// TODO Auto-generated method stub
		super.listarUsuario();//herencia de clase padre Usuario
	}
	

}
