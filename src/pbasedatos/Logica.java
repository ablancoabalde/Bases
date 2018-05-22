package pbasedatos;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Logica {
    
    Connection connect;
    
    public void conectar() {
        try {
            connect = DriverManager.getConnection("jdbc:sqlite:miBd.bd");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Conectado", "Advertencia", JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void desconectar() {
        try {
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void btnCargar(DefaultTableModel modelo) {
        this.conectar();
        
        // Limpia la tabla
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        
        try {
            Statement s = connect.createStatement();
            ResultSet rs = s.executeQuery("select * from Alumno");
            
            modelo.addColumn("Nombre");
            modelo.addColumn("Nota");
            modelo.addColumn("Referencia");
            
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString(1), rs.getInt(2), rs.getString(3)});
                System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.desconectar();
        
    }
    
    public void addAlumno(Alumno alumno) {
        this.conectar();
        try {
            PreparedStatement st = connect.prepareStatement("insert into Alumno values (?,?,?)");
            st.setString(1, alumno.getNombre());
            st.setInt(2, alumno.getNota());
            st.setString(3, alumno.getRef());
            st.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Alumno no guardado", "Advertencia", JOptionPane.WARNING_MESSAGE);
            System.err.println(ex.getMessage());
        }
        this.desconectar();
    }
    
}
