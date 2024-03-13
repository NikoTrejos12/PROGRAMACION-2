package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

public class VehiculoPasajeros extends Vehiculo{
    private  int numeroMaximoPasajeros;

    public VehiculoPasajeros() {
    }

    public VehiculoPasajeros(String placa, String modelo, String marca, String color, int numeroMaximoPasajeros) {
        super(placa, modelo, marca, color);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }
}
