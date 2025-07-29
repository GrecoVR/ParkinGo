public class ConsultarDisponibilidad {

    private LocalDate fecha;
    private String tipoParqueo;
    private List<Parqueo> resultados;

    public ConsultarDisponibilidad(LocalDate fecha, String tipoParqueo) {
        this.fecha = fecha;
        this.tipoParqueo = tipoParqueo;
        this.resultados = new ArrayList<>();
    }

    public void buscarDisponibilidad() {
        resultados = EspacioDAO.obtenerDisponibles(fecha, tipoEspacio);
    }

    public List<Espacio> getResultados() {
        return resultados;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipoParqueo() {
        return tipoParqueo;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTipoParqueo(String tipoParqueo) {
        this.tipoParqueo = tipoParqueo;
    }
}
