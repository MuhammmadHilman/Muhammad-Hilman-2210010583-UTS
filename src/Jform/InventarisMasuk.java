/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jform;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;


/**
 *
 * @author Hilman
 */
public class InventarisMasuk extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
   
    /**
     * Creates new form InventarisMasuk
     */
    public InventarisMasuk() {
        initComponents();
        datatable();
        
          
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtkodebarang = new javax.swing.JTextField();
        txtnamabarang = new javax.swing.JTextField();
        txtkategoribarang = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        txtnilaibarang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtmerek = new javax.swing.JTextField();
        txtukuran = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtketerangan = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        bcari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INVENTARIS MASUK", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 24))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Kode Barang");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(53, 76, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Nama Barang");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 76, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Kategori Barang");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 76, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setText("Jumlah");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 76, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Nilai Barang");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(56, 37, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 47, 0, 0);
        jPanel1.add(txtkodebarang, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 47, 0, 0);
        jPanel1.add(txtnamabarang, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 47, 0, 0);
        jPanel1.add(txtkategoribarang, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 165;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 47, 0, 0);
        jPanel1.add(txtjumlah, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 213;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(53, 10, 0, 0);
        jPanel1.add(txtnilaibarang, gridBagConstraints);

        jLabel6.setText("Merek");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 37, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Ukuran");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 37, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 213;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        jPanel1.add(txtmerek, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 213;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 0);
        jPanel1.add(txtukuran, gridBagConstraints);

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 10, 0, 0);
        jPanel1.add(bsimpan, gridBagConstraints);

        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 0, 0);
        jPanel1.add(bubah, gridBagConstraints);

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 34, 0, 0);
        jPanel1.add(bhapus, gridBagConstraints);

        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 18, 0, 0);
        jPanel1.add(bbatal, gridBagConstraints);

        bkeluar.setText("Keluar");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 0, 94);
        jPanel1.add(bkeluar, gridBagConstraints);

        jLabel8.setText("Keterangan");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 76, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        txtketerangan.setColumns(20);
        txtketerangan.setRows(5);
        jScrollPane1.setViewportView(txtketerangan);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 148;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 47, 28, 0);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Data Inventaris Masuk :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 649;
        gridBagConstraints.ipady = 261;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 41, 18, 87);
        jPanel2.add(jScrollPane2, gridBagConstraints);

        jLabel9.setText("Cari Data :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(18, 41, 0, 0);
        jPanel2.add(jLabel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 171;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 41, 0, 0);
        jPanel2.add(txtcari, gridBagConstraints);

        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 0);
        jPanel2.add(bcari, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        try {
            // Query SQL untuk menyisipkan data ke tabel inventaris_masuk
            String sql = "INSERT INTO inventaris_masuk (kode_barang, nama_barang, kategori_barang, jumlah, nilai_barang, merek, ukuran, keterangan) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            // Mempersiapkan statement untuk eksekusi query dengan parameter dinamis
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Mengisi parameter query dengan data dari form input
            stmt.setString(1, txtkodebarang.getText()); // Parameter 1: kode_barang
            stmt.setString(2, txtnamabarang.getText()); // Parameter 2: nama_barang
            stmt.setString(3, txtkategoribarang.getText()); // Parameter 3: kategori_barang
            stmt.setInt(4, Integer.parseInt(txtjumlah.getText())); // Parameter 4: jumlah (angka)
            stmt.setDouble(5, Double.parseDouble(txtnilaibarang.getText())); // Parameter 5: nilai_barang (desimal)
            stmt.setString(6, txtmerek.getText()); // Parameter 6: merek
            stmt.setString(7, txtukuran.getText()); // Parameter 7: ukuran
            stmt.setString(8, txtketerangan.getText()); // Parameter 8: keterangan

            // Menjalankan query INSERT dan mendapatkan jumlah baris yang terpengaruh
            int rowsAffected = stmt.executeUpdate();

            // Mengecek apakah data berhasil disimpan
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan!", "Informasi", JOptionPane.INFORMATION_MESSAGE);

                // Memperbarui tabel data setelah penyimpanan
                datatable();

                // Mengosongkan form input setelah data berhasil disimpan
                kosong();
            } else {
                JOptionPane.showMessageDialog(null, "Data gagal disimpan!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            // Menangani kesalahan SQL dan menampilkan pesan error
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Kesalahan", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            // Menangani kesalahan input jika jumlah atau nilai_barang bukan angka yang valid
            JOptionPane.showMessageDialog(null, "Input salah, pastikan jumlah dan nilai adalah angka yang valid.", "Kesalahan Input", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        // Query SQL untuk mengupdate data di tabel `inventaris_masuk`
        String sql = "UPDATE inventaris_masuk SET nama_barang=?, kategori_barang=?, jumlah=?, nilai_barang=?, merek=?, ukuran=?, keterangan=? WHERE kode_barang=?";

        try {
            // Mempersiapkan statement dengan parameter dinamis
            PreparedStatement stat = conn.prepareStatement(sql);

            // Mengisi parameter query dengan data dari form input
            stat.setString(1, txtnamabarang.getText()); // Parameter 1: nama_barang
            stat.setString(2, txtkategoribarang.getText()); // Parameter 2: kategori_barang
            stat.setInt(3, Integer.parseInt(txtjumlah.getText())); // Parameter 3: jumlah (angka)
            stat.setDouble(4, Double.parseDouble(txtnilaibarang.getText())); // Parameter 4: nilai_barang (desimal)
            stat.setString(5, txtmerek.getText()); // Parameter 5: merek
            stat.setString(6, txtukuran.getText()); // Parameter 6: ukuran
            stat.setString(7, txtketerangan.getText()); // Parameter 7: keterangan
            stat.setString(8, txtkodebarang.getText()); // Parameter 8: kode_barang (untuk kondisi WHERE)

            // Menjalankan query UPDATE
            stat.executeUpdate();

            // Menampilkan pesan sukses jika data berhasil diubah
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");

            // Mengosongkan form input setelah perubahan berhasil
            kosong();

            // Memperbarui data di tabel
            datatable();
        } catch (Exception e) {
            // Menangani kesalahan dan menampilkan pesan error
            JOptionPane.showMessageDialog(null, "Data gagal diubah: " + e);
        }
    }//GEN-LAST:event_bubahActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // Menampilkan dialog konfirmasi sebelum menghapus data
        int ok = JOptionPane.showConfirmDialog(null, "Hapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);

        // Mengecek apakah pengguna memilih "YES" (nilai 0 pada JOptionPane)
        if (ok == 0) {
            // Query SQL untuk menghapus data berdasarkan kode_barang
            String sql = "DELETE FROM inventaris_masuk WHERE kode_barang=?";

            try {
                // Mempersiapkan statement dengan parameter dinamis
                PreparedStatement stat = conn.prepareStatement(sql);

                // Mengisi parameter query dengan kode_barang dari input
                stat.setString(1, txtkodebarang.getText());

                // Menjalankan query DELETE
                stat.executeUpdate();

                // Menampilkan pesan sukses jika data berhasil dihapus
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");

                // Mengosongkan form input setelah penghapusan berhasil
                kosong();

                // Memperbarui data di tabel
                datatable();
            } catch (Exception e) {
                // Menangani kesalahan dan menampilkan pesan error
                JOptionPane.showMessageDialog(null, "Data gagal dihapus: " + e);
            }
        }
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        // Membersihkan semua input field
        txtkodebarang.setText("");
        txtnamabarang.setText("");
        txtkategoribarang.setText("");
        txtjumlah.setText("");
        txtnilaibarang.setText("");
        txtmerek.setText("");
        txtukuran.setText("");
        txtketerangan.setText("");
       
    }//GEN-LAST:event_bbatalActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        int confirmed = JOptionPane.showConfirmDialog(null, 
            "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar", 
            JOptionPane.YES_NO_OPTION);

        // Jika pengguna memilih YES, maka tutup form saat ini
        if (confirmed == JOptionPane.YES_OPTION) {
            this.dispose(); // Menutup form saat ini
        }
    }//GEN-LAST:event_bkeluarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // Mendapatkan baris yang dipilih dari tabel jTable1
        int selectedRow = jTable1.getSelectedRow();

        // Mengisi field input berdasarkan nilai yang ada di baris dan kolom tabel yang dipilih
        txtkodebarang.setText(jTable1.getValueAt(selectedRow, 0).toString()); // Kolom 0: kode_barang
        txtnamabarang.setText(jTable1.getValueAt(selectedRow, 1).toString()); // Kolom 1: nama_barang
        txtkategoribarang.setText(jTable1.getValueAt(selectedRow, 2).toString()); // Kolom 2: kategori_barang
        txtjumlah.setText(jTable1.getValueAt(selectedRow, 3).toString()); // Kolom 3: jumlah
        txtnilaibarang.setText(jTable1.getValueAt(selectedRow, 4).toString()); // Kolom 4: nilai_barang
        txtmerek.setText(jTable1.getValueAt(selectedRow, 5).toString()); // Kolom 5: merek
        txtukuran.setText(jTable1.getValueAt(selectedRow, 6).toString()); // Kolom 6: ukuran
        txtketerangan.setText(jTable1.getValueAt(selectedRow, 7).toString()); // Kolom 7: keterangan
    }//GEN-LAST:event_jTable1MouseClicked

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        // Query SQL untuk mencari data berdasarkan berbagai kolom menggunakan operator LIKE
        String sql = "SELECT * FROM inventaris_masuk WHERE kode_barang LIKE ? OR nama_barang LIKE ? OR kategori_barang LIKE ? OR jumlah LIKE ? OR nilai_barang LIKE ? OR merek LIKE ? OR ukuran LIKE ? OR keterangan LIKE ?";

        try {
            // Mempersiapkan statement dengan parameter dinamis
            PreparedStatement stat = conn.prepareStatement(sql);

            // Membuat pola pencarian dengan wildcard "%" di sekitar teks pencarian
            String searchText = "%" + txtcari.getText() + "%";

            // Mengisi semua parameter query dengan pola pencarian
            stat.setString(1, searchText);  // Pencarian pada kode_barang
            stat.setString(2, searchText);  // Pencarian pada nama_barang
            stat.setString(3, searchText);  // Pencarian pada kategori_barang
            stat.setString(4, searchText);  // Pencarian pada jumlah
            stat.setString(5, searchText);  // Pencarian pada nilai_barang
            stat.setString(6, searchText);  // Pencarian pada merek
            stat.setString(7, searchText);  // Pencarian pada ukuran
            stat.setString(8, searchText);  // Pencarian pada keterangan

            // Menjalankan query SELECT dan mendapatkan hasilnya
            ResultSet hasil = stat.executeQuery();

            // Menghapus data yang sebelumnya ditampilkan di tabel
            tabmode.setRowCount(0);

            // Mengisi tabel dengan data hasil pencarian
            while (hasil.next()) {
                String kode = hasil.getString("kode_barang");          // Kolom kode_barang
                String nama = hasil.getString("nama_barang");          // Kolom nama_barang
                String kategori = hasil.getString("kategori_barang");  // Kolom kategori_barang
                String jumlah = hasil.getString("jumlah");             // Kolom jumlah
                String nilai = hasil.getString("nilai_barang");        // Kolom nilai_barang
                String merek = hasil.getString("merek");               // Kolom merek
                String ukuran = hasil.getString("ukuran");             // Kolom ukuran
                String keterangan = hasil.getString("keterangan");     // Kolom keterangan

                // Menyimpan data ke dalam array untuk ditambahkan ke tabel
                String[] data = {kode, nama, kategori, jumlah, nilai, merek, ukuran, keterangan};
                tabmode.addRow(data);  // Menambahkan baris data ke model tabel
            }
        } catch (Exception e) {
            // Menangani kesalahan dan menampilkan pesan error
            JOptionPane.showMessageDialog(null, "Data gagal dicari: " + e);
        }
    }//GEN-LAST:event_bcariActionPerformed
    
     private void kosong() {
        txtkodebarang.setText("");
        txtnamabarang.setText("");
        txtkategoribarang.setText("");
        txtjumlah.setText("");
        txtnilaibarang.setText("");
        txtmerek.setText("");
        txtukuran.setText("");
        txtketerangan.setText("");
        
    }
    
    protected void datatable() {
       // Membuat header kolom untuk tabel
        Object[] Baris = {"Kode Barang", "Nama Barang", "Kategori", "Jumlah", "Nilai Barang", "Merek", "Ukuran", "Keterangan"};

        // Membuat model tabel dengan header kolom yang telah didefinisikan
        tabmode = new DefaultTableModel(null, Baris);

        // Mengatur model tabel ke dalam jTable1
        jTable1.setModel(tabmode);

        // Query SQL untuk mengambil semua data dari tabel inventaris_masuk
        String sql = "SELECT * FROM inventaris_masuk";

        try {
            // Membuat statement untuk eksekusi query
            Statement stat = conn.createStatement();

            // Menjalankan query dan menyimpan hasilnya dalam ResultSet
            ResultSet hasil = stat.executeQuery(sql);

            // Iterasi melalui setiap baris hasil query
            while (hasil.next()) {
                // Mengambil data dari setiap kolom di tabel database
                String kode = hasil.getString("kode_barang");          // Kolom kode_barang
                String nama = hasil.getString("nama_barang");          // Kolom nama_barang
                String kategori = hasil.getString("kategori_barang");  // Kolom kategori_barang
                String jumlah = hasil.getString("jumlah");             // Kolom jumlah
                String nilai = hasil.getString("nilai_barang");        // Kolom nilai_barang
                String merek = hasil.getString("merek");               // Kolom merek
                String ukuran = hasil.getString("ukuran");             // Kolom ukuran
                String keterangan = hasil.getString("keterangan");     // Kolom keterangan

                // Membuat array untuk menyimpan data baris
                String[] data = {kode, nama, kategori, jumlah, nilai, merek, ukuran, keterangan};

                // Menambahkan data ke dalam model tabel
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            // Menangani kesalahan dan menampilkan pesan error jika data gagal ditampilkan
            JOptionPane.showMessageDialog(null, "Data gagal ditampilkan: " + e);
        }
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
            java.util.logging.Logger.getLogger(InventarisMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventarisMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventarisMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventarisMasuk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventarisMasuk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton bubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkategoribarang;
    private javax.swing.JTextArea txtketerangan;
    private javax.swing.JTextField txtkodebarang;
    private javax.swing.JTextField txtmerek;
    private javax.swing.JTextField txtnamabarang;
    private javax.swing.JTextField txtnilaibarang;
    private javax.swing.JTextField txtukuran;
    // End of variables declaration//GEN-END:variables
}
