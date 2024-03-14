package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder.VehiculoPasajerosBuilder;

public class VehiculoPasajeros extends Vehiculo{
    private  int numeroMaximoPasajeros;


    public static VehiculoPasajerosBuilder builder(){
        return new VehiculoPasajerosBuilder();
    }

    public VehiculoPasajeros(String placa, String modelo, String marca, String color, int numeroMaximoPasajeros) {
        super(placa, modelo, marca, color);
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }

    public VehiculoPasajeros(int numeroMaximoPasajeros) {
    }

    public int getNumeroMaximoPasajeros() {
        return numeroMaximoPasajeros;
    }

    public void setNumeroMaximoPasajeros(int numeroMaximoPasajeros) {
        this.numeroMaximoPasajeros = numeroMaximoPasajeros;
    }
}
