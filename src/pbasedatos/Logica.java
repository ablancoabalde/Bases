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

    public void btnConectar(DefaultTableModel modelo) {
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

        this.btnConectar(Main.modelo);
    }

    public void deleteAlumno(String ref) {
        this.conectar();

        try {
            Statement st = connect.createStatement();
            // borra un usuario en concreto
            st.executeUpdate("delete from Alumno where Ref='" + ref + "';");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Alumno no eliminado", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

        this.desconectar();
        this.btnConectar(Main.modelo);
    }

    public void updateAlumno(String nombre, int nota, String ref) {
        this.conectar();

        try {

            PreparedStatement st = connect.prepareStatement("update Alumno set Nombre = '" + nombre + "' , Nota = '" + nota + "' WHERE Ref = '" + ref + "'");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

        this.desconectar();
        this.btnConectar(Main.modelo);
    }

    public void searchAlumno(DefaultTableModel modelo, String ref) {
        this.conectar();
    // Limpia la tabla
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        try {
            Statement s = connect.createStatement();
            ResultSet rs = s.executeQuery("select * from Alumno where Ref like'%" + ref + "%'");

            modelo.addColumn("Nombre");
            modelo.addColumn("Nota");
            modelo.addColumn("Referencia");

            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getString(1), rs.getInt(2), rs.getString(3)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.desconectar();
    }

}
