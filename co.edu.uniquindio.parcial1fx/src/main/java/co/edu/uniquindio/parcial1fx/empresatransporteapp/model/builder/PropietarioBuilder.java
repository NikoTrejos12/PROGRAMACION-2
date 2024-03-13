package co.edu.uniquindio.parcial1fx.empresatransporteapp.model.builder;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.Propietario;

public class PropietarioBuilder {

    protected String nombre;
    protected String cedula;
    protected String email;
    protected String celular;


    public PropietarioBuilder nombre (String nombre){
        this.nombre = nombre;

        return this;//devuelve la instancia del propietrioBUilder
    }
    public PropietarioBuilder cedula (String cedula) {
        this.cedula = cedula;

        return this;
    }

    public PropietarioBuilder email (String email) {
        this.email= email;

        return this;
    }
    public PropietarioBuilder celular (String celular) {
        this.celular= celular;

        return this;
    }
    public Propietario build(){
        return new Propietario(nombre,cedula,email,celular);
    }
}
