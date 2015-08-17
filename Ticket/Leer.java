package ticket;
import java.io.*;
public class Leer {
    public static  BufferedReader lee = new BufferedReader(new InputStreamReader(System.in));
    
    public static int entero() throws Exception
    {
            int dato = Integer.parseInt(lee.readLine());
        return dato;
    }
    
    public static String cadena() throws Exception
    {
        String dato = lee.readLine();
        return dato;
    }
    public static double decimal() throws Exception
    {
        double dato = Double.parseDouble(lee.readLine());
        return dato;
    }
}
