package evaluacionfinalmod1;
/**

 * Esta interface almacena los metodos analizarUsuario, getRun, ListaUsuario
 * utilizadas en la clase contenedor
 * @authores: Mauricio Sepulveda, Mauricio Marin, Nicolas Bonilla, Marcos Hanson

 * @version: 8/02/2021A

 */
public interface Asesoria {

	public void analizarUsuario();//metodo implementado en la clase padre e hijas.
	
	public Integer getRun();//metodo que obtiene el run de clase padre Usuario
	
	public void listarUsuario();/*metodo que almacena informacion de clases hija (cliente,
								administrativo y profesional) con atributos de Usuario*/

	
	
	
}
