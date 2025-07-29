public class ConsultarDisponibilidad {

    private LocalDate fecha;
    private String tipoEspacio; // Ej: "Auto", "Moto", "Discapacitado"
    private List<Espacio> resultados;

    // Constructor
    public ConsultarDisponibilidad(LocalDate fecha, String tipoEspacio) {
        this.fecha = fecha;
        this.tipoEspacio = tipoEspacio;
        this.resultados = new ArrayList<>();
    }

    // Método principal que hace la búsqueda
    public void buscarDisponibilidad() {
        // Simulación de lógica: consulta en base de datos o API
        resultados = EspacioDAO.obtenerDisponibles(fecha, tipoEspacio);
    }

    // Getters
    public List<Espacio> getResultados() {
        return resultados;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipoEspacio() {
        return tipoEspacio;
    }

    // Setter opcional si se quiere reutilizar la instancia
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTipoEspacio(String tipoEspacio) {
        this.tipoEspacio = tipoEspacio;
    }
}
