public class Estacion {
    private int id;
    private String nombre;
    private double latitud;
    private double longitud;

    public Estacion(int id, String nombre, double latitud, double longitud) {
        this.id = id;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}

public class RutaTroncal {
    private int id;
    private String nombre;
    private List<Estacion> estaciones;

    public RutaTroncal(int id, String nombre, List<Estacion> estaciones) {
        this.id = id;
        this.nombre = nombre;
        this.estaciones = estaciones;
    }

    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(List<Estacion> estaciones) {
        this.estaciones = estaciones;
    }
}

public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private RutaTroncal rutaSeleccionada;

    public Usuario(String nombre, String apellido, int edad, RutaTroncal rutaSeleccionada) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.rutaSeleccionada = rutaSeleccionada;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public RutaTroncal getRutaSeleccionada() {
        return rutaSeleccionada;
    }

    public void setRutaSeleccionada(RutaTroncal rutaSeleccionada) {
        this.rutaSeleccionada = rutaSeleccionada;
    }
}
