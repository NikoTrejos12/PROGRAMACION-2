package co.edu.uniquindio.parcial1fx.empresatransporteapp.Factory;

import co.edu.uniquindio.parcial1fx.empresatransporteapp.model.EmpresaTransporte;



//me permite ue yo tenga una instancia unica en este clase singleton
public class ModelFactory {

    private static ModelFactory modelFactory;

    // se va crear en esta linea la variable de tipo private y la
    // clase que se vaya a crear





    private EmpresaTransporte empresaTransporte;
    private ModelFactory(){
        empresaTransporte = new EmpresaTransporte();
        inicializarDatos();
    }

    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
    private void inicializarDatos(){


    }

}
