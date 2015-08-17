package sqlconector;
import java.sql.*;
import javax.swing.JOptionPane;
    
public class ConexionMySQL {
    
    Connection link = null;
    
    public Connection Conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection("jdbc:mysql://localhost/aerolinea", "root",""); 
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, "Error, Database not foun");
        }
        return link;
    }
    
    public void probarConexion(){
        ConexionMySQL mysql = new ConexionMySQL();
        java.sql.Connection cn= mysql.Conectar();
        if(cn != null){
                JOptionPane.showMessageDialog(null, "Conectado");
                try{
                    cn.close();
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null,"Error al desconectar "+ex);
                }
        }
    }
}
