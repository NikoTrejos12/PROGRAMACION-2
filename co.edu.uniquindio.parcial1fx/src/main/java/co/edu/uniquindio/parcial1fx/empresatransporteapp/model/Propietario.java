package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario {

    private String nombre;
    private String cedula;
    private String email;
    private String celular;

    private Vehiculo vehiculo;

    private List<VehiculoCarga> listaVehiculoAsociados = new ArrayList<>();
    private List<VehiculoPasajeros> listaUsuariosAsociados = new ArrayList<>();

    public Propietario(String nombre, String cedula, String email, String celular) {
    }

    public Propietario(String nombre, String cedula, String email, String celular, Vehiculo vehiculo, List<VehiculoCarga> listaVehiculoAsociados, List<VehiculoPasajeros> listaUsuariosAsociados) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.vehiculo = vehiculo;
        this.listaVehiculoAsociados = listaVehiculoAsociados;
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<VehiculoCarga> getListaVehiculoAsociados() {
        return listaVehiculoAsociados;
    }

    public void setListaVehiculoAsociados(List<VehiculoCarga> listaVehiculoAsociados) {
        this.listaVehiculoAsociados = listaVehiculoAsociados;
    }

    public List<VehiculoPasajeros> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    public void setListaUsuariosAsociados(List<VehiculoPasajeros> listaUsuariosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }
}


