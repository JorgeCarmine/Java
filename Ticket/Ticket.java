package ticket;
public class Ticket {
    public static void main(String[] args) throws Exception {    
        
        double iva, subtotal = 0, total;
        int banderaMax = 0, banderaMin = 0;
        
        System.out.print("¿Cuantos productos ingresarar?  ");
        int cantidad = Leer.entero();
        
        Producto prod[] = new Producto[cantidad];
        
        double costoMax = 0, costoMin = 999999999; 
        for(int i=0; i<cantidad; i++)
        {
            prod[i] = new Producto();
            prod[i].pedir();
            subtotal = subtotal + (prod[i].getCantidad() * prod[i].getCosto());
            
            if(prod[i].getCosto() > costoMax)
            {
               costoMax = prod[i].getCosto();
               banderaMax = i+1;
            }
            if(prod[i].getCosto() < costoMin)
            {
                costoMin = prod[i].getCosto();
                banderaMin = i+1;
            } 
        }
        iva = subtotal * 0.16;
        total = subtotal + iva;
        
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Iva: " + iva);
        System.out.println("Total: " + total);
        
        System.out.println("El producto mas caro es el " + banderaMax + " con un precio de $" + costoMax);
        System.out.println("El producto mas varato es el " + banderaMin + " con un precio de $" + costoMin);   
    } 
}
