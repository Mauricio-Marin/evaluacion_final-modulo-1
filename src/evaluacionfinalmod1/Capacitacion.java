package evaluacionfinalmod1;
/**

 * Esta clase contiene atributos, constructores, mutadore y accesores, metodo toString
 * y metodo mostrarDetalle
 * @authores: Mauricio Sepulveda, Mauricio Marin, Nicolas Bonilla, Marcos Hanson

 * @version: 8/02/2021A

 */
public class Capacitacion {
	
	//declaracion de atributos
	private Integer identificador;
	private Integer rutCliente; 
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private Integer cantidadAsistentes;

	public Capacitacion() { // constructor vacio
		super();

	}
	//constructor con parametros
	public Capacitacion(Integer identificador, Integer rutCliente, String dia, String hora, String lugar,
			String duracion, Integer cantidadAsistentes) {
		super();
		this.identificador = identificador;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadAsistentes = cantidadAsistentes;
	}
	
	//mutadores y accesores
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public void setRutCliente(Integer rutCliente) {
		this.rutCliente = rutCliente;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public void setCantidadAsistentes(Integer cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public Integer getRutCliente() {
		return rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public String getHora() {
		return hora;
	}

	public String getLugar() {
		return lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public Integer getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	/*Metodo mostrar detalle
	*devuelce atributos especificos de la clase capacitacion*/
	public void mostrarDetalle() {
		System.out.println("La capacitacion sera en " + lugar + " a las " + hora + " del dia " + dia + " y durara "
				+ duracion + " minutos ");
	}

	@Override // metodo toString permite devolver texto y no la direccion de memoria
	public String toString() {
		return "Capacitacion Identificador:" + identificador + ", Rut Cliente: " + rutCliente + ", Dia: " + dia
				+ ", Hora: " + hora + ", Lugar:" + lugar + ", Duracion: " + duracion + ", Cantidad de Asistentes: "
				+ cantidadAsistentes;
	}

}
