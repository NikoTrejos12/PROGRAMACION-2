package co.edu.uniquindio.parcial1fx.empresatransporteapp.Factory;

public class ModelFactory {

    private static ModelFactory modelFactory;
    private ModelFactory(){
    }
    public static ModelFactory getInstance(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

}
