package Interno;
import Pacientes.Paciente;
import Ulilerias.Lectura;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args)throws Exception{
        Paciente vec[] = new Paciente[Lectura.entero(" la cantidad de pacientes: ")];
        
        for (int i = 0; i < vec.length; i++) {
            JOptionPane.showMessageDialog(null, "DATOS DE LA PERSONA "+(i+1));
            vec[i] = new Paciente();
            vec[i].pedir();
        }
        
        for(int i = 0; i < vec.length; i++)
            vec[i].mostrar(i);
    }
}