/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.examw4dtha;

import controller.MascotasController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Mascotas;
import model.Operaciones;

/**
 *
 * @author sebap
 */
public class LittlePetShop extends javax.swing.JFrame {

    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultTableModel dtm2 = new DefaultTableModel();
    MascotasController mc = new MascotasController();
    Operaciones op = new Operaciones();

    private int getCodigo() {
        return Integer.parseInt(txtCodigo.getText());
    }

    private String getDescripcion() {
        return txtDescripción.getText();
    }

    private double getCosto() {
        return Double.parseDouble(txtCosto.getText());
    }

    private int getStock() {
        return Integer.parseInt(txtStock.getText());
    }

    private String getTipoDeMascota() {
        return txtTipoMascota.getText();
    }

    public void agregarColumna() {
        dtm.addColumn("CODIGO");
        dtm.addColumn("DESCRIPCIÓN");
        dtm.addColumn("COSTO");
        dtm.addColumn("STOCK");
        dtm.addColumn("TIPO DE MASCOTA");

        this.table.setModel(dtm);

        dtm2.addColumn("TIPO DE MASCOTA");
        dtm2.addColumn("CANTIDAD DE PRODUCTOS");

        this.jTable1.setModel(dtm2);
    }

    private void listar(boolean inicio) {
        if (mc.size() <= 0) {
            if (!inicio) {
                JOptionPane.showMessageDialog(this, "La tabla no tiene datos");
            }
            return;
        }
        dtm.setRowCount(0);
        for (int i = 0; i < mc.size(); i++) {
            Object arreglo[] = new Object[5];
            arreglo[0] = mc.get(i).getCodigo();
            arreglo[1] = mc.get(i).getDescripcion();
            arreglo[2] = mc.get(i).getCosto();
            arreglo[3] = mc.get(i).getStock();
            arreglo[4] = mc.get(i).getTipoDeMascota();
            dtm.addRow(arreglo);
        }
        this.table.setModel(dtm);

        ArrayList<ArrayList<Object>> result = op.getCoincidenciasDeTipo(mc.getMascotas());
        dtm2.setRowCount(0);
        for (int i = 0; i < result.size(); i++) {
            Object arreglo[] = new Object[2];
            arreglo[0] = result.get(i).get(0);
            arreglo[1] = result.get(i).get(1);
            dtm2.addRow(arreglo);
        }
        this.jTable1.setModel(dtm2);
    }

    private void actualizar(boolean inicio) {
        listar(inicio);
        if (mc.size() <= 0) {
            labelOutput.setText("No hay Mascotas Registradas");
            return;
        }
        Mascotas mascotaMayor = op.precioMayor(mc.getMascotas());
        Mascotas mascotaMenor = op.precioMenor(mc.getMascotas());
        double precioPromedio = op.promedio(mc.getMascotas());
        labelOutput.setText("Total de Mascotas Registradas: " + mc.size()
                + "\n\nStock Total de Mascotas: " + op.sumarStock(mc.getMascotas())
                + "\n\nMascota de Mayor Precio es: " + mascotaMayor.getDescripcion()
                + " (S/. " + mascotaMayor.getCosto() + ") , \nCódigo "
                + mascotaMayor.getCodigo() + ", Stock de " + mascotaMayor.getStock()
                + " mascotas"
                + "\n\nMascota de Menor Precio es: " + mascotaMenor.getDescripcion()
                + " (S/. " + mascotaMenor.getCosto() + ") , \nCódigo "
                + mascotaMenor.getCodigo() + ", Stock de " + mascotaMenor.getStock()
                + " mascotas"
                + "\n\n Precio Promedio: " + precioPromedio);
    }

    /**
     * Creates new form LittlePetShop
     */
    public LittlePetShop() {
        initComponents();
        agregarColumna();
        actualizar(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTipoMascota = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripción = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        labelOutput = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 550));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Littelst Pets Shop");

        jLabel2.setText("Código");

        jLabel3.setText("Descripción");

        jLabel4.setText("Costo");

        jLabel5.setText("Stock");

        jLabel6.setText("Tipo de Mascota");

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtDescripción);

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Grabar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel7.setText("INFORMACIÓN");

        jScrollPane3.setViewportView(labelOutput);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTipoMascota)
                                            .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTipoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3)
                                .addComponent(jButton2)
                                .addComponent(jButton4)
                                .addComponent(jButton5))))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtCodigo.setText(String.valueOf(mc.getCorrelativo()));
        txtCosto.setText("");
        txtDescripción.setText("");
        txtStock.setText("");
        txtTipoMascota.setText("");
        actualizar(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int rpta = JOptionPane.showConfirmDialog(this, "Deseas Grabar el Registro", "Grabar", JOptionPane.YES_NO_OPTION);
        if (JOptionPane.NO_OPTION == rpta) {
            return;
        }

        if (mc.search(getCodigo()) != null) {
            JOptionPane.showMessageDialog(this, "Mascota existente");
            return;
        }

        Mascotas mascota = new Mascotas(getCodigo(), getDescripcion(), getCosto(), getStock(), getTipoDeMascota());
        mc.add(mascota);
        mc.grabar();
        jButton1ActionPerformed(evt);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (mc.search(getCodigo()) == null) {
            JOptionPane.showMessageDialog(this, "Producto no Encontrado");
            return;
        }
        Mascotas obj = mc.search(getCodigo());
        JOptionPane.showMessageDialog(this, "Código: " + obj.getCodigo() + "\nDescripción: "
                + obj.getDescripcion() + "\nCosto: S/." + obj.getCosto()
                + "\nStock: " + obj.getStock());
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        this.txtCodigo.setText(dtm.getValueAt(this.table.getSelectedRow(), 0).toString());
        this.txtDescripción.setText(dtm.getValueAt(this.table.getSelectedRow(), 1).toString());
        this.txtCosto.setText(dtm.getValueAt(this.table.getSelectedRow(), 2).toString());
        this.txtStock.setText(dtm.getValueAt(this.table.getSelectedRow(), 3).toString());
        this.txtTipoMascota.setText(dtm.getValueAt(this.table.getSelectedRow(), 4).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        dtm.setRowCount(0);
        for (int i = 0; i < mc.size(); i++) {
            if (this.mc.get(i).getDescripcion().toUpperCase().contains(this.txtBuscar.getText().toUpperCase())) {
                Object arreglo[] = new Object[5];
                arreglo[0] = mc.get(i).getCodigo();
                arreglo[1] = mc.get(i).getDescripcion();
                arreglo[2] = mc.get(i).getCosto();
                arreglo[3] = mc.get(i).getStock();
                arreglo[4] = mc.get(i).getTipoDeMascota();
                dtm.addRow(arreglo);
            }
        }
        this.table.setModel(dtm);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int msg = JOptionPane.showConfirmDialog(this, "Deseas Eliminar el Registro", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (msg == JOptionPane.YES_OPTION) {
            msg = JOptionPane.showConfirmDialog(this, "¿Estas seguro?, esta acción es irreversible", "Eliminar", JOptionPane.YES_NO_OPTION);
            if (msg == JOptionPane.NO_OPTION) {
                return;
            }
        } else {
            return;
        }

        Mascotas a = mc.search(getCodigo());
        if (a != null) {
            //modificar datos
            mc.remove(a);
            JOptionPane.showMessageDialog(this, "Registro Actualizado!!!", "Mensaje", 1);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro!!!", "Mensaje", 3);
        }
        actualizar(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int msg = JOptionPane.showConfirmDialog(this, "Deseas Modificar el Registro", "Modificar", JOptionPane.YES_NO_OPTION);
        if (msg == JOptionPane.NO_OPTION) {
            return;
        }
        Mascotas a = mc.search(getCodigo());
        if (a != null) {
            //modificar datos
            a.setDescripcion(getDescripcion());
            a.setCosto(getCosto());
            a.setStock(getStock());
            a.setTipoDeMascota(getTipoDeMascota());
            listar(false);//actualizar la lista
            mc.grabar();
            JOptionPane.showMessageDialog(this, "Registro Actualizado!!!", "Mensaje", 1);
        } else {
            JOptionPane.showMessageDialog(this, "No se encontro!!!", "Mensaje", 3);
        }
        // TODO add your handling code here:
        actualizar(false);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(LittlePetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LittlePetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LittlePetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LittlePetShop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LittlePetShop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane labelOutput;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextPane txtDescripción;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTipoMascota;
    // End of variables declaration//GEN-END:variables
}
