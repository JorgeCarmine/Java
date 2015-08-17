package Interno;
import Pacientes.Paciente;
import Ulilerias.Lectura;
import javax.swing.JOptionPane;
import java.io.*;
public class Principal {
    public static BufferedReader lee = new BufferedReader (new InputStreamReader (System.in));
      
    public static void main(String[] args)throws Exception{
        
  
        System.out.println("Presiona 1 para un arreglo unidimennsionaol o 2 para uno bidimencional");
        int opcion =  Integer.parseInt(lee.readLine());
        
        if (opcion == 1){
                 Paciente vec[] = new Paciente[Lectura.entero(" la cantidad de pacientes: ")];
            for (int i = 0; i < vec.length; i++) {
                JOptionPane.showMessageDialog(null, "DATOS DE LA PERSONA "+(i+1));
                vec[i] = new Paciente();
                vec[i].pedir();
            }
            for(int i = 0; i < vec.length; i++)
                vec[i].mostrar(i);
        }else{
            System.out.println("Ingresa las filas");
            int filas = Integer.parseInt(lee.readLine());
            System.out.println("Ingresa las columnas");
            int columnas = Integer.parseInt(lee.readLine());
            
         Paciente vec[][] = new Paciente[filas][columnas];
         int j;
         int iterador = 1;
         for (j = 0; j < filas; j++) {
               for (int i = 0; i < columnas; i++) {
                JOptionPane.showMessageDialog(null, "DATOS DE LA PERSONA "+(iterador));
                vec[i][j] = new Paciente();
                vec[i][j].pedir();
                iterador++;
            }
            }
            for(int i = 0; i < vec.length; i++)
                vec[i][j].mostrar(i);
        }
    }
}
