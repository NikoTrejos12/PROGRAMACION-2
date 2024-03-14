package co.edu.uniquindio.parcial1fx.empresatransporteapp.controller;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.Factory.ModelFactory;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class EmpresaTransporteController {

    ModelFactory modelFactory;
// agregamos el sinfelton a la interface

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarEdad;

    @FXML
    private Button btnAgregarPasajeros;

    @FXML
    private Button btnAgregarPropietario;

    @FXML
    private Button btnAgregarVehiculo;

    @FXML
    private Button btnAgregarVehiculoCarga;

    @FXML
    private TextField txtCapacidadDeCarga;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtMaximoDePasajeros;

    @FXML
    private TextField txtNumeroEjes;

    @FXML
    private TextArea txtResultadoPropietario;

    @FXML
    private TextArea txtResultadoUsuario;

    @FXML
    private TextArea txtResultadoVehiculo;

    @FXML
    private TextArea txtResultadoVehiculoCarga;

    @FXML
    private TextField txtcedula;

    @FXML
    private TextField txtcelular;

    @FXML
    private TextField txtcolor;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtmarca;

    @FXML
    private TextField txtmodelo;

    @FXML
    private TextField txtnombre;

    @FXML
    private TextField txtplaca;

    @FXML
    void onAgregarEdad(ActionEvent event) {

    }

    @FXML
    void onAgregarPasajeros(ActionEvent event) {

    }

    @FXML
    void onAgregarPropietario(ActionEvent event) {

    }

    @FXML
    void onAgregarVehiculo(ActionEvent event) {

    }

    @FXML
    void onAgregarVehiculoCarga(ActionEvent event) {

    }





    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstance();
        //se conecta el controllador con el singleton


    }


}
