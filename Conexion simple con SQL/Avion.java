package sqlconector;
import java.sql.*;
import sqlconector.NameException;
import javax.swing.JOptionPane;
import static sqlconector.NameException.*;
public class Avion {
    private String IdAvion;
    private String Tipo;
    private String Base;
    
    Connection registro;
    
    public void setIdAvion()throws Exception{
        try{
            this.IdAvion = validarId(JOptionPane.showInputDialog(null,"Ingresa el Id del avion"));
        }catch (NameException e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            this.setIdAvion();
        }
    }
    
    public void setTipo()throws Exception{
        try{
            this.Tipo = validarTexto(JOptionPane.showInputDialog(null,"Ingresa el Tipo de avion"));
        }catch(NameException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            this.setTipo();
        }
}
    
    public void setBase()throws Exception{
        try{
            this.Base = validarTexto(JOptionPane.showInputDialog(null,"Ingresa la Base"));
        }catch(NameException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            this.setBase();
        }
    }
    
    public String getIdAvion(){
        return this.IdAvion;
    }
    
    public String getTipo(){
    return this.Tipo;
    }
    
    public String getBase(){
        return this.Base;
    }
    
    public void crearConexion(){
        ConexionMySQL conexion = new ConexionMySQL();
        conexion.probarConexion();
        registro = conexion.Conectar();
    }
    
    public void registrar()throws Exception{
            try{
                String sql = "insert into avion values(?, ?, ?)";
            PreparedStatement ingreso = registro.prepareStatement(sql);
            ingreso.setString(1, getIdAvion());
            ingreso.setString(2, getTipo());
            ingreso.setString(3, getBase());
            int n = ingreso.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null, "Registro con exito :3");
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error");
            }
            
    }
}
