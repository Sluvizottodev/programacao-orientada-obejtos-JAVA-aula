package modelo;

public class AlgoSingleton {
    private static AlgoSingleton instancia=null;
    
    public AlgoSingleton(){

    }

    public static synchronized AlgoSingleton getInstancia(){
        if(AlgoSingleton.instancia == null)
            AlgoSingleton.instancia = new AlgoSingleton();
        return AlgoSingleton.instancia;
    }
}
