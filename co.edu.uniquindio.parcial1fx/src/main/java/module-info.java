module co.edu.uniquindio.parcial1fx.empresatransporteapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.parcial1fx.empresatransporteapp to javafx.fxml;
    exports co.edu.uniquindio.parcial1fx.empresatransporteapp;
}