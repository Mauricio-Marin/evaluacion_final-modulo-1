package evaluacionfinalmod1;
/**

 * Esta clase contiene atributos, constructores, mutadore y accesores y metodo toString
 * @authores: Mauricio Sepulveda, Mauricio Marin, Nicolas Bonilla, Marcos Hanson

 * @version: 8/02/2021A

 */
public class Revision {
	
	// declaracion de atributops
	private Long identificadorRevision;
	private Long identificadorVisita;
	private String nombreRevision;
	private String detalleRevision;
	private Integer estado;

	//constructor con parametros de la propia clase
	public Revision(Long identificadorRevision, Long identificadorVisita, String nombreRevision, String detalleRevision,
			Integer estado) {
		super();
		this.identificadorRevision = identificadorRevision;
		this.identificadorVisita = identificadorVisita;
		this.nombreRevision = nombreRevision;
		this.detalleRevision = detalleRevision;
		this.estado = estado;
	}
	
	//constructor vacio
	public Revision() {
		super();
	}
	
	//mutadores y accesores
	public Long getIdentificadorRevision() {
		return identificadorRevision;
	}

	public void setIdentificadorRevision(Long identificadorRevision) {
		this.identificadorRevision = identificadorRevision;
	}

	public Long getIdentificadorVisita() {
		return identificadorVisita;
	}

	public void setIdentificadorVisita(Long identificadorVisita) {
		this.identificadorVisita = identificadorVisita;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	
	// Metodo toString, retorna los atributos de la clase Revision
	@Override
	public String toString() {
		return "Revision [identificadorRevision=" + identificadorRevision + ", identificadorVisita="
				+ identificadorVisita + ", nombreRevision=" + nombreRevision + ", detalleRevision=" + detalleRevision
				+ ", estado=" + estado + "]";
	}

}