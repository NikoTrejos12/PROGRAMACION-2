package co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.Vehiculo;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.VehiculoCarga;

public class VehiculoCargaBuilder extends VehiculoBuilder {

    protected double capacidadCarga;
    protected int numeroEjes;

    public VehiculoCargaBuilder() {
    }

    public VehiculoCargaBuilder(double capacidadCarga, int numeroEjes) {
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
    public int getNumeroEjes() {
        return numeroEjes;
    }
    public VehiculoCarga build() {
        return new VehiculoCarga(placa,modelo,marca,color,capacidadCarga,numeroEjes);
   }
}



