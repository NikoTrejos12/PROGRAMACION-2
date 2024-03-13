package co.edu.uniquindio.parcial1fx.empresatransporteapp.model;

public class VehiculoCarga extends Vehiculo {
    private double capacidadcarga;
    private int numeroEjes;


    public VehiculoCarga(double capacidadCarga, int numeroEjes) {
    }

    public VehiculoCarga(String placa, String modelo, String marca, String color, double capacidadcarga, int numeroEjes) {
            super(placa, modelo, marca, color);
            this.capacidadcarga = capacidadcarga;
            this.numeroEjes = numeroEjes;
    }

    public double getCapacidadcarga() {
        return capacidadcarga;
    }

    public void setCapacidadcarga(double capacidadcarga) {
        this.capacidadcarga = capacidadcarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

}

