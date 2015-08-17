package sqlconector;
public class NameException extends Exception{
    
    public NameException(String msg){
        super(msg);
    }
    
    public static String validarId(String text)throws Exception{
        if(text.matches("[0-9]{5}")){
            return text;
        }else{
            throw new NameException("ERROR, ID incorrecto");
        }
    }
    
    public static String validarTexto(String text)throws Exception{
        if(text.matches("[A-Z a-z1-9]*")){
            return text;
        }else{
            throw new NameException ("Error, no ingresar caracteres especiales.");
        }
    }
}
