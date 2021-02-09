package evaluacionfinalmod1;
/**

 * Esta clase contiene atributos, constructores, mutadore y accesores y metodo toString
 * @authores: Mauricio Sepulveda, Mauricio Marin, Nicolas Bonilla, Marcos Hanson

 * @version: 8/02/2021A

 */
public class VisitaEnTerreno {

	//declaracion de atributos
	private Integer identificadorVisita;
    private String rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;

    //constructor con parametro
    public VisitaEnTerreno(Integer identificadorVisita, String rutCliente, String dia, String hora, String lugar,
            String comentarios) {
        super();
        this.identificadorVisita = identificadorVisita;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }
    
    //constructor vacio
    public VisitaEnTerreno() {
        super();
    }

    //mutadores y accesores
    public Integer getIdentificadorVisita() {
        return identificadorVisita;
    }

    public void setIdentificadorVisita(Integer identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    // Metodo toString, retorna los atributos de la clase VisitaEnTerreno
    @Override
    public String toString() {
        return "VisitaEnTerreno [identificadorVisita=" + identificadorVisita + ", rutCliente=" + rutCliente + ", dia="
                + dia + ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
    }
}
