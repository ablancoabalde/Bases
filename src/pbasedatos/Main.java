package pbasedatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {
    
    DefaultTableModel modelo=new DefaultTableModel();
    
    Logica log = new Logica();
    Alumno alumno;
    public Main() {
        initComponents();
        jpAdd.setVisible(false);
        modelo=(DefaultTableModel) jTAlumnos.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        btnUpd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpAdd.setLayout(null);

        jLabel1.setText("Referencia");
        jpAdd.add(jLabel1);
        jLabel1.setBounds(40, 190, 70, 14);

        jLabel2.setText("Nombre");
        jpAdd.add(jLabel2);
        jLabel2.setBounds(40, 30, 50, 14);

        jLabel3.setText("Nota");
        jpAdd.add(jLabel3);
        jLabel3.setBounds(40, 110, 50, 14);
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

        jpMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTAlumnos);

        jpMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 375, 275));

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jpMain.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 79, -1));

        btnAdd.setText("Añadir");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jpMain.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 79, -1));

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jpMain.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 79, -1));

        btnUpd.setText("Actualizar");
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });
        jpMain.add(btnUpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jpAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        log.btnCargar(modelo);
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        jpMain.setVisible(false);
        jpAdd.setVisible(true);
     
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
         alumno= new Alumno(tNombre.getText(),Integer.valueOf(tNota.getText()),tRef.getText());
         log.addAlumno(alumno);
        jpAdd.setVisible(false);
        jpMain.setVisible(true);
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAlumnos;
    private javax.swing.JPanel jpAdd;
    private javax.swing.JPanel jpMain;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tNota;
    private javax.swing.JTextField tRef;
    // End of variables declaration//GEN-END:variables
}
