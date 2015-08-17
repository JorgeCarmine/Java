package herenciacarros;
public class HerenciaCarros {
   public static void main(String[] args) {
       
       //Prueba de arranque de un bochito
       System.out.println("PROBANDO BOCHITO");
       Carro bochito = new Carro();
       bochito.acelerar();
       bochito.girarllave();
       bochito.acelerar();
       bochito.girarllave();
       
       System.out.println("--------------------------------------------");
       //Prueba de arranque de un Camaro
       System.out.print("PROBANDO CAMARO");
       SuperAuto camaro = new SuperAuto();
       camaro.acelerar();
       camaro.girarllave();
       camaro.acelerar();
       camaro.nitro();
       camaro.girarllave();
       
      
    }
    
}
