package sqlconector;
import sqlconector.*;
public class Principal {
    private static Object reg;
    public static void main(String []args)throws Exception{
            Avion av1 = new Avion();
    
            av1.crearConexion();
            
            av1.setIdAvion();
            av1.setBase();
            av1.setTipo();
            
            av1.registrar();
    }
}
