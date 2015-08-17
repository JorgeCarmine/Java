
package ticket;
public class Producto {
    
    private Double costo;
    private int cantidad;
    
    public void setCosto(Double dato)
    {
        this.costo = dato;
    }
    public void setCantidad(int dato)
    {
        this.cantidad = dato;
    }
    
    public Double getCosto()
    {
        return this.costo;
    }
    public int getCantidad()
    {
        return this.cantidad;
    }
    
    public  void pedir() throws Exception
    {
        System.out.print("Costo: ");
        this.setCosto(Leer.decimal());
        System.out.print("Cantidad: ");
        this.setCantidad(Leer.entero());
        System.out.println("");
    }
}
