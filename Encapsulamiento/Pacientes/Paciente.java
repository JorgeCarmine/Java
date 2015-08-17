package Pacientes;
import Ulilerias.Lectura;
import javax.swing.JOptionPane;
public class Paciente {

    private int nss;
    private String nombre;
    private String Apat;
    private int edad;
    private String calle;
    private String estatus;

    public void setNss(int dato) {
        this.nss = dato;
    }

    public void setNombre(String dato) {
        this.nombre = dato;
    }

    public void setApat(String dato) {
        this.Apat = dato;
    }

    public void setEdad(int dato) {
        this.edad = dato;
    }

    public void setCalle(String dato) {
        this.calle = dato;
    }

    public void setEstatus(String dato) {
        this.estatus = dato;
    }

    public int getNss() {
        return this.nss;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApat() {
        return this.Apat;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getCalle() {
        return this.calle;
    }

    public String getEstatus() {
        return this.estatus;
    }

    public void pedir() throws Exception {
        setNss(Lectura.entero("el NSS: "));
        setNombre(Lectura.texto(true, "nombre"));
        setApat(Lectura.texto(true, "apellido"));
        setEdad(Lectura.entero("la Edad: "));
        setCalle(Lectura.texto(false, " calle "));
        setEstatus(Lectura.texto(false, " estatus "));
    }

    public void mostrar(int i) throws Exception {
        
        JOptionPane.showMessageDialog(null,"DATOS DE LA PERSONA "+(i+1)+": "+
                "\nNSS: "+getNss()+
                "\nNombre: "+getNombre()+
                "\nApellido: "+getApat()+
                "\nEdad: "+getEdad()+
                "\nCalle: "+getCalle()+
                "\nEstatus: "+getEstatus());
    }
}
