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
        resultados = ListaParqueo.obtenerDisponibles(fecha, tipoParqueo);
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

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTipoParqueo(String tipoParqueo) {
        this.tipoParqueo = tipoParqueo;
    }
}
