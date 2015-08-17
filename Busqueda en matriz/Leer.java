package buscarenmatriz;
import javax.swing.JOptionPane;

public class Leer {
    public static String msg = "ERROR, dato invalido";
    public static int entero(int i){
        try{
            int v = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el "+i+" numero", null));
            return v;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,msg);
            return entero(i);
        }  
    }
    
}