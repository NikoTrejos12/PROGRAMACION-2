package co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.Vehiculo;

public class VehiculoBuilder {

    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;

    public VehiculoBuilder() {
    }

    public VehiculoBuilder placa(String placa) {
        this.placa = placa;
        return this;
    }

    public VehiculoBuilder modelo(String placa) {
        this.modelo = modelo;
        return this;
    }

    public VehiculoBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    public VehiculoBuilder color(String marca) {
        this.color = color;
        return this;
    }

    public Vehiculo build() {
        return new Vehiculo(placa, modelo, marca, color);
    }
}

