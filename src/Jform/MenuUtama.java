/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jform;

/**
 *
 * @author Hilman
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenu = new javax.swing.JMenu();
        jdatabarang = new javax.swing.JMenuItem();
        jmenu2 = new javax.swing.JMenu();
        jinventarismasuk = new javax.swing.JMenuItem();
        jinventariskeluar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplikasi inventaris barang");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(200, 118, 262, 130);
        jPanel1.add(jLabel1, gridBagConstraints);

        jmenu.setText("Master");
        jmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuActionPerformed(evt);
            }
        });

        jdatabarang.setText("Data Barang");
        jdatabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdatabarangActionPerformed(evt);
            }
        });
        jmenu.add(jdatabarang);

        jMenuBar1.add(jmenu);

        jmenu2.setText("Transaksi");

        jinventarismasuk.setText("Inventaris Masuk");
        jinventarismasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinventarismasukActionPerformed(evt);
            }
        });
        jmenu2.add(jinventarismasuk);

        jinventariskeluar.setText("Inventaris Keluar");
        jinventariskeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jinventariskeluarActionPerformed(evt);
            }
        });
        jmenu2.add(jinventariskeluar);

        jMenuBar1.add(jmenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuActionPerformed
        
    }//GEN-LAST:event_jmenuActionPerformed

    private void jdatabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdatabarangActionPerformed
         // Membuat objek baru dari kelas DataBarang
        DataBarang frmB = new DataBarang();

        // Menampilkan form DataBarang
        frmB.setVisible(true);
    }//GEN-LAST:event_jdatabarangActionPerformed

    private void jinventarismasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinventarismasukActionPerformed
        // Membuat objek baru dari kelas InventarisMasuk
        InventarisMasuk frmB = new InventarisMasuk();

        // Menampilkan form InventarisMasuk
        frmB.setVisible(true);
    }//GEN-LAST:event_jinventarismasukActionPerformed

    private void jinventariskeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jinventariskeluarActionPerformed
        // Membuat objek baru dari kelas InventarisKeluar
        InventarisKeluar frmB = new InventarisKeluar();

        // Menampilkan form InventarisKeluar
        frmB.setVisible(true);
    }//GEN-LAST:event_jinventariskeluarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jdatabarang;
    private javax.swing.JMenuItem jinventariskeluar;
    private javax.swing.JMenuItem jinventarismasuk;
    private javax.swing.JMenu jmenu;
    private javax.swing.JMenu jmenu2;
    // End of variables declaration//GEN-END:variables
}
