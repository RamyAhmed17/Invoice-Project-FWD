/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.view17;


import controller17.ControllerClass;
import java.util.ArrayList;
import model17.InvoiceModel;

/**
 *
 * @author Baianater 4
 */
public class InvoiceFramepro extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceFramepro
     */
    public InvoiceFramepro() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Invoicetable = new javax.swing.JTable();
        createinbutton = new javax.swing.JButton();
        createinbutton.addActionListener(Controller);
        Deleteinbutton = new javax.swing.JButton();
        Deleteinbutton.addActionListener(Controller);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        invoicenumlabel = new javax.swing.JLabel();
        invoicedatetable = new javax.swing.JLabel();
        customernlabel = new javax.swing.JLabel();
        totalinlabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        linetable = new javax.swing.JTable();
        createitembutton = new javax.swing.JButton();
        createitembutton.addActionListener(Controller);
        deleteitembutton = new javax.swing.JButton();
        deleteitembutton.addActionListener(Controller);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadFile.addActionListener(Controller);
        LoadFile = new javax.swing.JMenuItem();
        SaveFile = new javax.swing.JMenuItem();
        SaveFile.addActionListener(Controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Invoicetable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Invoicetable);

        createinbutton.setText("Create Invoice ");

        Deleteinbutton.setText("Delete Invoice");

        jLabel1.setText("In Number");

        jLabel2.setText("In Date");

        jLabel3.setText(" Customer Fn");

        jLabel4.setText("In Total");

        linetable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(linetable);

        createitembutton.setText("Create New Item");
        createitembutton.setActionCommand("Create nw Item");
        createitembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createitembuttonActionPerformed(evt);
            }
        });

        deleteitembutton.setText("Delet Item");

        jMenu1.setText("File");

        LoadFile.setText("Load File");
        LoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadFileActionPerformed(evt);
            }
        });
        jMenu1.add(LoadFile);

        SaveFile.setText("Save File");
        SaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileActionPerformed(evt);
            }
        });
        jMenu1.add(SaveFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(createinbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Deleteinbutton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(createitembutton)
                        .addGap(211, 211, 211)
                        .addComponent(deleteitembutton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalinlabel))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customernlabel))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(invoicedatetable))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(77, 77, 77)
                            .addComponent(invoicenumlabel)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invoicenumlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invoicedatetable))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(customernlabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalinlabel))
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(createitembutton)
                        .addComponent(Deleteinbutton)
                        .addComponent(createinbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteitembutton))
                .addGap(223, 223, 223))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createitembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createitembuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createitembuttonActionPerformed

    private void LoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoadFileActionPerformed

    private void SaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveFileActionPerformed

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
            java.util.logging.Logger.getLogger(InvoiceFramepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFramepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFramepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFramepro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFramepro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deleteinbutton;
    private javax.swing.JTable Invoicetable;
    private javax.swing.JMenuItem LoadFile;
    private javax.swing.JMenuItem SaveFile;
    private javax.swing.JButton createinbutton;
    private javax.swing.JButton createitembutton;
    private javax.swing.JLabel customernlabel;
    private javax.swing.JButton deleteitembutton;
    private javax.swing.JLabel invoicedatetable;
    private javax.swing.JLabel invoicenumlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable linetable;
    private javax.swing.JLabel totalinlabel;
    // End of variables declaration//GEN-END:variables
    private ArrayList <InvoiceModel> Invoices;
    private ControllerClass Controller =new ControllerClass();
    

    public ArrayList<InvoiceModel> getInvoices() {
        return Invoices;
    }

    public void setInvoices(ArrayList<InvoiceModel> Invoices) {
        this.Invoices = Invoices;
    }
    
}

