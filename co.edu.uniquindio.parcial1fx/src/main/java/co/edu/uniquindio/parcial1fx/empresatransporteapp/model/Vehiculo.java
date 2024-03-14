package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder.VehiculoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo  {

    private String placa;
    private String modelo;
    private String marca;
    private String color ;
    private Propietario propietarioAsociado;
    private List<Propietario> listaPropietariosAsociados = new ArrayList<>();
    //se asocia con la clase usuaario

    public Vehiculo() {
    }

    public static VehiculoBuilder builder(){
        return new VehiculoBuilder();
    }

    public Vehiculo(String placa, String modelo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
