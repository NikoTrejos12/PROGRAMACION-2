package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder.UsuarioBuilder;

public class Usuario {
    private int edad;
    private VehiculoPasajeros vehiculoAsociado;
    public static UsuarioBuilder builder(){
        return new UsuarioBuilder();
    }
    public Usuario() {
    }
    public Usuario(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
