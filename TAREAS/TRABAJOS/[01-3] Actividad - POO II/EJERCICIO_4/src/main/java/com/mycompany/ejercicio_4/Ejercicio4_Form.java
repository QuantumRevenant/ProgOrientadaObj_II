/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ejercicio_4;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebap
 */
public class Ejercicio4_Form extends javax.swing.JFrame {

    private EJERCICIO_4 ope = new EJERCICIO_4();

    /**
     * Creates new form Ejercicio4_Form
     */
    public Ejercicio4_Form() {
        initComponents();
        populateTable();
    }
    
    private void demoFull()
    {
        for(int i=0;i<40;i++)
        {
            ArrayList<String> answ=new ArrayList<>();
            String codigo="Cod0"+(i+1);
            String nombre="Test"+(i+1);
            double nota=(double)(i%20)+1;
            answ.add(codigo); 
            answ.add(nombre);
            answ.add(String.valueOf(nota));
            ope.add(answ);
        }
        TxtResultado.setText("La Mayor Nota es " + ope.getNotaMaxima() + ", la obtuvo " + ope.getNombre(ope.getNotaMaxima()) + " (" + ope.getCodigo(ope.getNotaMaxima()) + ")"
                + "\n\nLa Menor Nota: " + ope.getNotaMinima() + ", la obtuvo " + ope.getNombre(ope.getNotaMinima()) + " (" + ope.getCodigo(ope.getNotaMinima()) + ")"
                + "\n\nEl Promedio de las " + ope.getSize() + " notas es " + ope.getPromedio());
    }
    
    private void populateTable() {
        Object Titles[] = {"Código", "Nombre", "Nota"};
        Object Data[] = new Object[3];
        DefaultTableModel model1 = new DefaultTableModel(Titles, 0);
        Table.setModel(model1);
        DefaultTableModel model2 = (DefaultTableModel) Table.getModel();
        for (int i = 0; i < ope.getSize(); i++) {
            Data[0] = ope.get(i, 0);
            Data[1] = ope.get(i, 1);
            Data[2] = ope.get(i, 2);
            model2.addRow(Data);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtResultado = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        TxtCodigo = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtNota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 550));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOTAS");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        TxtResultado.setColumns(20);
        TxtResultado.setRows(5);
        jScrollPane1.setViewportView(TxtResultado);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane3.setViewportView(Table);

        jLabel3.setText("Código");

        jLabel4.setText("Nombre");

        jLabel5.setText("Nota");

        jToggleButton1.setText("Añadir Nota");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        TxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                            .addComponent(TxtNota)
                            .addComponent(TxtCodigo)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed

        String codigo = TxtCodigo.getText();
        String nombre = TxtNombre.getText();
        String nota = TxtNota.getText();

        TxtCodigo.setText("");
        TxtNombre.setText("");
        TxtNota.setText("");

        ArrayList<String> newDb = new ArrayList<>();

        newDb.add(codigo);
        newDb.add(nombre);
        newDb.add(nota);

        ope.add(newDb);

        populateTable();
        TxtResultado.setText("La Mayor Nota es " + ope.getNotaMaxima() + ", la obtuvo " + ope.getNombre(ope.getNotaMaxima()) + " (" + ope.getCodigo(ope.getNotaMaxima()) + ")"
                + "\n\nLa Menor Nota: " + ope.getNotaMinima() + ", la obtuvo " + ope.getNombre(ope.getNotaMinima()) + " (" + ope.getCodigo(ope.getNotaMinima()) + ")"
                + "\n\nEl Promedio de las " + ope.getSize() + " notas es " + ope.getPromedio());

    }// GEN-LAST:event_jToggleButton1ActionPerformed

    private void TxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_TxtCodigoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_TxtCodigoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4_Form.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4_Form.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4_Form.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio4_Form.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio4_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNota;
    private javax.swing.JTextArea TxtResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
