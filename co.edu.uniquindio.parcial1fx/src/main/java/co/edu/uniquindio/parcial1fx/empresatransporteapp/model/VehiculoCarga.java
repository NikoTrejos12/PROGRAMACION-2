package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder.VehiculoCargaBuilder;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder.VehiculoPasajerosBuilder;

public class VehiculoCarga extends Vehiculo {
    private double capacidadcarga;
    private int numeroEjes;


    public static VehiculoCargaBuilder builder(){
        return new VehiculoCargaBuilder();
    }

    public VehiculoCarga(double capacidadCarga, int numeroEjes) {
    }
    public VehiculoCarga(String placa, String modelo, String marca, String color, double capacidadcarga, int numeroEjes) {
            super(placa, modelo, marca, color);
            this.capacidadcarga = capacidadcarga;
            this.numeroEjes = numeroEjes;
    }
    public VehiculoCarga() {
    }

    public double getCapacidadcarga() {
        return capacidadcarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    @Override
    public String toString() {
        return "VehiculoCarga{" +
                "capacidadcarga=" + capacidadcarga +
                ", numeroEjes=" + numeroEjes +
                '}';
    }
}

