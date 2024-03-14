package co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.VehiculoPasajeros;

public class VehiculoPasajerosBuilder extends VehiculoBuilder {

    protected int numeroMaximoPasajeros;

    public VehiculoPasajerosBuilder numeroMaximoPasajeros(int numeroMaximoPasajeros){
        this. numeroMaximoPasajeros = numeroMaximoPasajeros;
        return this;
    }

    public VehiculoPasajeros build(){
        return new VehiculoPasajeros(numeroMaximoPasajeros);
    }



}
