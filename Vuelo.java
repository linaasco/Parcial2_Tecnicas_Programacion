


public class Vuelo {
    private String numeroVuelo;
    private String destino;
    private String fecha;
    private String hora;
    public int capacidadMax =10;

    public Vuelo(String numeroVuelo, String destino, String fecha, String hora, int capacidadMax) {
        this.numeroVuelo = numeroVuelo;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.capacidadMax = capacidadMax;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }




}


