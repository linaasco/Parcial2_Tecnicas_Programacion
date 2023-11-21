import java.util.HashMap;

public class Pasajero {

    HashMap<String, String> lugar = new HashMap<>();
    HashMap<String, String> tiempo = new HashMap<>();
    HashMap<String, String> momento = new HashMap<>();
    private String nombre;
    private int numeroPasaporte;
    private int edad;
    private String preferenciasAlimenticias;

    public Pasajero(String nombre, int numeroPasaporte, int edad, String preferenciasAlimenticias){
        this.nombre= nombre;
        this.numeroPasaporte= numeroPasaporte;
        this.edad= edad;
        this.preferenciasAlimenticias= preferenciasAlimenticias;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumeroPasaporte() {
        return numeroPasaporte;
    }
    public void setNumeroPasaporte(int numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getPreferenciasAlimenticias() {
        return preferenciasAlimenticias;
    }
    public void setPreferenciasAlimenticias(String preferenciasAlimenticias) {
        this.preferenciasAlimenticias = preferenciasAlimenticias;
    }
    public void buscarVuelo(Vuelo){

        }

    public String realizarReserva (){

    }




    }


