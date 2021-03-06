package pbasedatos;

import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Logica {
    
    Connection connect;
    // Medoto para conectar la base
    public void conectar() {
        try {
            // Funcion que permite abrir la base de datos creada
           // en este caso la URL solo es miBd.bd, pues la cree dentro de la carpeta del proyecto
           // Si se encontrase en otro ubicación abría que poner la URL
            connect=DriverManager.getConnection("jdbc:sqlite:miBd.bd");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectadar", "Advertencia", JOptionPane.WARNING_MESSAGE);
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
// Medoto para desconectar la base
    public void desconectar() {
        try {
            // Funcion que cierra la base
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Metodo que carga los datos de la base y en este caso los muestra por una Tabla del Neatbeans
    public void btnCargar(DefaultTableModel modelo) {
        this.conectar();

        // Limpia la tabla
        modelo.setColumnCount(0);
        modelo.setRowCount(0);

        try {
            // Metodo de sql que crea un Objeto de sql            
            Statement s=connect.createStatement();
            // Consulta para introducir una Query y con el ResultSet
            // recoge el Array de la consulta
            ResultSet rs=s.executeQuery("select * from Alumno");

            modelo.addColumn("Nombre");
            modelo.addColumn("Nota");
            modelo.addColumn("Referencia");
            // Recorremos el Array y vamos introduciendo los datos en la tabla
            while (rs.next()) {

                modelo.addRow(new Object[]{rs.getString(1), rs.getInt(2), rs.getString(3)});
            }

        } catch (SQLException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.desconectar();

    }
    
    // Metodo que agrega un Alumno a la tabla Alumno
    public void addAlumno(Alumno alumno) {
        this.conectar();
        try {
            // Metodo prepareStament que no devuelve nada y con la instruccion para
            // insertar un nuevo usuario
            PreparedStatement st=connect.prepareStatement("insert into Alumno values (?,?,?)");
            // Recoge los valores que estan un Textfield y los números indican la Row de la base
            // donde se va a insertar
            st.setString(1, alumno.getNombre());
            st.setInt(2, alumno.getNota());
            st.setString(3, alumno.getRef());
            // Ejecuta la consulta
            st.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Alumno no guardado", "Advertencia", JOptionPane.WARNING_MESSAGE);
            System.err.println(ex.getMessage());
        }
        this.desconectar();
        
        this.btnCargar(Main.modelo);
    }

    // Metodo que elimina un Alumno de la tabla Alumno a traves de la Refencia de este
    public void deleteAlumno(String ref) {
        this.conectar();

        try {
              // Metodo de sql que crea un Objeto de sql    
            Statement st=connect.createStatement();
            // borra un usuario en concreto
            st.executeUpdate("delete from Alumno where Ref='"+ref+"';");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Alumno no eliminado", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

        this.desconectar();
        this.btnCargar(Main.modelo);
    }

        // Metodo que actualiza un Alumno de la tabla alumno, por unos valores nuevos que recibe
    public void updateAlumno(String nombre, int nota, String ref) {
        this.conectar();

        try {
              // Metodo de sql que crea un Objeto de sql    
            Statement st=connect.createStatement();
            // Metodo del objeto sql, que actualiza la base y no devuelve nada
            st.executeUpdate("update Alumno set Nombre = '"+nombre+"' , Nota = '"+nota+"' WHERE Ref = '"+ref+"'");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo modificar", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }

        this.desconectar();
        this.btnCargar(Main.modelo);
    }
    
    // Metodo que busca un Alumno a traves de una referencia y lo carga en un table del NeatBeans
    public void searchAlumno(DefaultTableModel modelo, String ref) {
        this.conectar();
        // Limpia la tabla
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        
        try {
            
            Statement s=connect.createStatement();
            // Busca en la base de datos una Referencia introducida si la encuentra
            // guarda los datos recibidos y los almacenas en rs
            ResultSet rs=s.executeQuery("select * from Alumno where Ref like'%"+ref+"%'");

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
