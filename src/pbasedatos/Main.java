package pbasedatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public static DefaultTableModel modelo=new DefaultTableModel();

    Logica log=new Logica();
    Alumno alumno;
    Object refRecogido;
    Object nombreRecogido;
    Object notaRecogido;

    public Main() {
        initComponents();
        jpAdd.setVisible(false);
        jpUpdate.setVisible(false);
        modelo=(DefaultTableModel) jTAlumnos.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpUpdate = new javax.swing.JPanel();
        btnConfirmar1 = new javax.swing.JButton();
        tNota1 = new javax.swing.JTextField();
        tNombre1 = new javax.swing.JTextField();
        tRef1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpAdd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tRef = new javax.swing.JTextField();
        tNombre = new javax.swing.JTextField();
        tNota = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        jpMain = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAlumnos = new javax.swing.JTable();
        btnCargar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnConfirmar1.setText("Confirmar");
        btnConfirmar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmar1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nota");

        jLabel5.setText("Nombre");

        jLabel6.setText("Referencia");

        javax.swing.GroupLayout jpUpdateLayout = new javax.swing.GroupLayout(jpUpdate);
        jpUpdate.setLayout(jpUpdateLayout);
        jpUpdateLayout.setHorizontalGroup(
            jpUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(jpUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpUpdateLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jpUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpUpdateLayout.createSequentialGroup()
                            .addGroup(jpUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addComponent(btnConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpUpdateLayout.setVerticalGroup(
            jpUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(jpUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpUpdateLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(15, 15, 15)
                    .addComponent(tNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(jpUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpUpdateLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(15, 15, 15)
                            .addComponent(tNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpUpdateLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnConfirmar1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6)
                    .addGap(15, 15, 15)
                    .addComponent(tRef1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jpAdd.setLayout(null);

        jLabel1.setText("Referencia");
        jpAdd.add(jLabel1);
        jLabel1.setBounds(40, 190, 70, 15);

        jLabel2.setText("Nombre");
        jpAdd.add(jLabel2);
        jLabel2.setBounds(40, 30, 50, 15);

        jLabel3.setText("Nota");
        jpAdd.add(jLabel3);
        jLabel3.setBounds(40, 110, 50, 15);
        jpAdd.add(tRef);
        tRef.setBounds(40, 220, 150, 30);
        jpAdd.add(tNombre);
        tNombre.setBounds(40, 60, 150, 30);
        jpAdd.add(tNota);
        tNota.setBounds(40, 140, 150, 30);

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        jpAdd.add(btnConfirmar);
        btnConfirmar.setBounds(240, 120, 100, 70);

        jpMain.setLayout(null);

        jTAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTAlumnos);

        jpMain.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 375, 275);

        btnCargar.setText("Conectar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jpMain.add(btnCargar);
        btnCargar.setBounds(440, 20, 90, 25);

        btnAdd.setText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jpMain.add(btnAdd);
        btnAdd.setBounds(440, 70, 90, 25);

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jpMain.add(btnDelete);
        btnDelete.setBounds(440, 120, 90, 25);

        btnupdate.setText("Actualizar");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jpMain.add(btnupdate);
        btnupdate.setBounds(440, 230, 90, 25);

        btnSearch1.setText("Buscar");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });
        jpMain.add(btnSearch1);
        btnSearch1.setBounds(440, 170, 90, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(148, Short.MAX_VALUE)
                    .addComponent(jpUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(134, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(jpUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        log.btnConectar(modelo);
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        jpMain.setVisible(false);
        jpAdd.setVisible(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (refRecogido==null) {
            JOptionPane.showMessageDialog(null, "Ningun Alumno seleccionado", "Advertencia", JOptionPane.WARNING_MESSAGE);

        } else {
            log.deleteAlumno(String.valueOf(refRecogido));
            refRecogido=null;
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        if (refRecogido==null) {
            JOptionPane.showMessageDialog(null, "Ningun Alumno seleccionado", "Advertencia", JOptionPane.WARNING_MESSAGE);

        } else {
            jpMain.setVisible(false);
            jpUpdate.setVisible(true);
            tNombre1.setText(String.valueOf(nombreRecogido));
            tNota1.setText(String.valueOf(notaRecogido));
            tRef1.setText(String.valueOf(refRecogido));
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        alumno=new Alumno(tNombre.getText(), Integer.valueOf(tNota.getText()), tRef.getText());
        log.addAlumno(alumno);
        this.limpiarjpAdd();
        jpAdd.setVisible(false);
        jpMain.setVisible(true);
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void jTAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAlumnosMouseClicked

        nombreRecogido=jTAlumnos.getValueAt(jTAlumnos.getSelectedRow(), 0);
        notaRecogido=jTAlumnos.getValueAt(jTAlumnos.getSelectedRow(), 1);
        refRecogido=jTAlumnos.getValueAt(jTAlumnos.getSelectedRow(), 2);


    }//GEN-LAST:event_jTAlumnosMouseClicked

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void btnConfirmar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmar1ActionPerformed
 
        log.updateAlumno(tNombre1.getText(), Integer.valueOf(tNota1.getText()), tRef1.getText());
        jpUpdate.setVisible(false);
        jpMain.setVisible(true);
    }//GEN-LAST:event_btnConfirmar1ActionPerformed

    public void limpiarjpAdd() {
        tNombre.setText(null);
        tNota.setText(null);
        tRef.setText(null);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnConfirmar1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlumnos;
    private javax.swing.JPanel jpAdd;
    private javax.swing.JPanel jpMain;
    private javax.swing.JPanel jpUpdate;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tNombre1;
    private javax.swing.JTextField tNota;
    private javax.swing.JTextField tNota1;
    private javax.swing.JTextField tRef;
    private javax.swing.JTextField tRef1;
    // End of variables declaration//GEN-END:variables
}
