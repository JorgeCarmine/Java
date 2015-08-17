package Ulilerias;
public class NameException extends Exception {
    public  NameException(String msg){
        super(msg);
    }
    
    public static String validarTexto(String text) throws Exception {
        if (text.matches("[A-Z a-z0-9]*")) {
            return text;
        } else {
            throw new NameException("ERROR, no puedes usar caracteres especiales, ingresalo de nuevo");
        }
    }
    
    public static String validar(String text)throws Exception{
        if(text.matches(("[A-Z]{1}[a-z]*")))
            return text;
        else
            throw new NameException("ERROR, nombre incorrecto, ingreselo de nuevo");
    }
}
