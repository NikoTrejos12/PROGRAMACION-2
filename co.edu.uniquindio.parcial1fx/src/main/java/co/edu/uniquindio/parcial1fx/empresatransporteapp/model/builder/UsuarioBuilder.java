package co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.Propietario;
import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.Usuario;

public class UsuarioBuilder {

    protected int edad;

    public UsuarioBuilder(int edad) {
        this.edad = edad;
    }

    public UsuarioBuilder() {

    }

    public Usuario build() {
        return new Usuario(edad);
    }
}
