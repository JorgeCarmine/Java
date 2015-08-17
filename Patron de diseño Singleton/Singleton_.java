package singleton_;
/* 
 * Patron de diseño Singleton, consiste en una clase en la que solo se
 * puede instanciar un unico objeto
*/
class Cuenta {
    
   private static Cuenta user;  //El unico objeto de la clase
   private static String saludo = "Hola soy un objeto de tipo Singleton";
   
   private  Cuenta(){  // El constructor es privado, por lo que no puede ser llamado por ninguna otra clase
   }
   
  public static void crearCuenta(){  //Metodo para crear la cuenta
       if(user == null){
           user = new Cuenta();
           System.out.println("La cuenta a sido creada");
           
       }else{
           System.out.println("No puedes crear otra cuenta"); 
           // en caso de que ya exista una cuenta no pueden crearse mas
       }
   }
  
  // El objeto esta encapsulado por lo que se necesita un metodo para retornarlo
  public static Cuenta getCuenta(){
      if(user == null){
          System.out.println("No se a creado la cuenta");
          return null;
      }else{
          System.out.println("Obteniendo cuenta");
       return user;
      } 
   }
  
  public String saludar(){
      return saludo;
  } 
}

public class Singleton_ {
    
    public static void main(String[] args) {
        
        Cuenta.crearCuenta();  // Se crea la cuenta
       
        Cuenta jorge = Cuenta.getCuenta();  // variable jorge es usada como medio de referenca hacia la cuenta
        
        System.out.println(jorge.saludar());
    }   
}