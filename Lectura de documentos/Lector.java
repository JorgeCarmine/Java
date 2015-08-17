package leer_txt;
import java.io.*;
public class Lector {
    
    public static String LeerTxt(String direccion)throws Exception{
        String texto="";
        
        try{
            BufferedReader lector = new BufferedReader(new FileReader (direccion));
            String temp="";
            while((temp = lector.readLine()) != null){
                texto += temp;
            }
        }catch(Exception e){
            return "No se encontro el archivo";
        }
        return texto;
    }
    
}
