package Ulilerias;
import javax.swing.JOptionPane;
import static Ulilerias.NameException.validar;
import static Ulilerias.NameException.validarTexto;
public class Lectura {
    static String msg = "ERROR, tipo de dato incorrecto";
    public static int entero(String dato)throws Exception{
        try{
            int v = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa "+dato+": "));
            return v;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,msg);
            return entero(dato);
        }
    }
    
    // Este metodo es una funcion recursiva que valida Nombres y/o  direcciones
    public static String texto(boolean tipo, String dato)throws Exception{
        if (tipo == true){
            try{
                String v = validar(JOptionPane.showInputDialog(null, "Ingresa "+dato+" : "));
                return v;
            }catch(NameException v){
                JOptionPane.showMessageDialog(null, v.getMessage());
                return texto(tipo, dato);
            }
        }else{
            try{
                String v = validarTexto(JOptionPane.showInputDialog(null, "Ingresa "+dato+": "));
                return v;
            }catch(NameException v){
                JOptionPane.showMessageDialog(null, v.getMessage());
                return texto(tipo,dato);
            }
        }
    }
}
