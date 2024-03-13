package co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.VehiculoCarga;

public class VehiculoCargaBuilder {

    protected double capacidadCarga;
    protected int numeroEjes;

    public VehiculoCargaBuilder capacidadCarga (double capacidadCarga) {
        this. capacidadCarga =  capacidadCarga;
        return this;
    }
    public VehiculoCargaBuilder numeroEjes (int numeroEjes ) {
        this. numeroEjes  =  numeroEjes ;
        return this;
    }
    public VehiculoCarga build(){
        return new VehiculoCarga (capacidadCarga,numeroEjes);
    }
}
