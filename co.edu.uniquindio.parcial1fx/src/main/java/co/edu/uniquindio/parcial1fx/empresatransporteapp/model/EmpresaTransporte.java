package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {

    private String nombre;

    private List<VehiculoCarga> listaVehiculoCarga = new ArrayList<>();
    private List<VehiculoPasajeros> listaVehiculoPasajeros = new ArrayList<>();

    private List<Propietario> listaAsociados = new ArrayList<>();

    private List<Usuario> listaUsuario = new ArrayList<>();

    public EmpresaTransporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<VehiculoCarga> getListaVehiculoCarga() {
        return listaVehiculoCarga;
    }

    public void setListaVehiculoCarga(List<VehiculoCarga> listaVehiculoCarga) {
        this.listaVehiculoCarga = listaVehiculoCarga;
    }

    public List<VehiculoPasajeros> getListaVehiculoPasajeros() {
        return listaVehiculoPasajeros;
    }

    public void setListaVehiculoPasajeros(List<VehiculoPasajeros> listaVehiculoPasajeros) {
        this.listaVehiculoPasajeros = listaVehiculoPasajeros;
    }

    public List<Propietario> getListaAsociados() {
        return listaAsociados;
    }

    public void setListaAsociados(List<Propietario> listaAsociados) {
        this.listaAsociados = listaAsociados;
    }

    public List<Usuario> getListaUsuario() {
        return listaUsuario;
    }

    public void setListaUsuario(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
}


