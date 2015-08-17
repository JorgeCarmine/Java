
package herenciacarros;
public class Carro {
    private String modelo;
    private int noPuertas;
    private Double peso;
    private boolean estado = false;
        
    public void acelerar()
    { 
       System.out.print("Pisando el acelerador   ");
       if (this.estado == true)
        {
          System.out.println("El carro acelera!!");
        }
        else
        {
            System.out.println("El carro no avanza!! :( ");
        }
    }
    
    public void girarllave()
    {
        System.out.print("Girando la llave   ");
        if (this.estado == false)
        {
            this.estado = true;
            System.out.println("El carro esta encendido");
        }
        else
        {
            this.estado = false; 
            System.out.println("El carro esta apagado");  
        }
    }
    
    public void modelo()
        {
            System.out.println("Es un modelo estandar");
        }
}
