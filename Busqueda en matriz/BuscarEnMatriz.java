package buscarenmatriz;
import javax.swing.JOptionPane;
public class BuscarEnMatriz {
    public static void main(String[] args)throws Exception {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo cuadrado: ", null));
        int arreglo[][] = new int[tamaño][tamaño];
        int i, j, iteracion = 1;
        for (i = 0; i < tamaño; i++) {
            for (j = 0; j < tamaño; j++) {
                arreglo[i][j] = Leer.entero(iteracion);
                iteracion++;
            }  
        }
        int buscado = Integer.parseInt(JOptionPane.showInputDialog("¿Que numero seseas Buscar?", null));
        String coincidencias="";
        for (i = 0; i < tamaño; i++) {
            for (j = 0; j < tamaño; j++) {
                if(arreglo[i][j] == buscado){
                    coincidencias = coincidencias + "["+(i)+"],["+(j)+"]\n"; 
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Buscado esta en la(s) pocicio(es): \n"+coincidencias);
    }  
}
