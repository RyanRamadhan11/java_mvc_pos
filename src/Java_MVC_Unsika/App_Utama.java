
package Java_MVC_Unsika;

import javax.swing.JFrame;
import ryan.ramadhan.view.viewBarangInternal;
import ryan.ramadhan.view.viewLaporanTransaksi;
import ryan.ramadhan.view.viewListDataTransaksi;
import ryan.ramadhan.view.viewPelangganInternal;
import ryan.ramadhan.view.viewSupplierInternal;
import ryan.ramadhan.view.viewTransaksi;

/**
 * Ryan Ramadhan || 1910631170229 || 5H
 */

public class App_Utama extends javax.swing.JFrame {

    /**
     * Creates new form App_Utama
     */
    public App_Utama() {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        desktopUtama = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        viewPelangganInternal = new javax.swing.JMenu();
        menuPelanggan = new javax.swing.JMenuItem();
        menuBarang = new javax.swing.JMenuItem();
        menuSupplier = new javax.swing.JMenuItem();
        TransaksiBarang = new javax.swing.JMenu();
        menuTransaksiPOS = new javax.swing.JMenuItem();
        dataTransaksi = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuTransaksiBulanan = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Program Point of Sales");

        javax.swing.GroupLayout desktopUtamaLayout = new javax.swing.GroupLayout(desktopUtama);
        desktopUtama.setLayout(desktopUtamaLayout);
        desktopUtamaLayout.setHorizontalGroup(
            desktopUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopUtamaLayout.setVerticalGroup(
            desktopUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        viewPelangganInternal.setText("Data Master");
        viewPelangganInternal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPelangganInternalActionPerformed(evt);
            }
        });

        menuPelanggan.setText("Master Pelanggan");
        menuPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPelangganActionPerformed(evt);
            }
        });
        viewPelangganInternal.add(menuPelanggan);

        menuBarang.setText("Master Barang");
        menuBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarangActionPerformed(evt);
            }
        });
        viewPelangganInternal.add(menuBarang);

        menuSupplier.setText("Supplier Barang");
        menuSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSupplierActionPerformed(evt);
            }
        });
        viewPelangganInternal.add(menuSupplier);

        jMenuBar1.add(viewPelangganInternal);

        TransaksiBarang.setText("Transaksi Barang");
        TransaksiBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiBarangActionPerformed(evt);
            }
        });

        menuTransaksiPOS.setText("Transaksi (POS)");
        menuTransaksiPOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiPOSActionPerformed(evt);
            }
        });
        TransaksiBarang.add(menuTransaksiPOS);

        dataTransaksi.setText("Daftar Transaksi");
        dataTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataTransaksiActionPerformed(evt);
            }
        });
        TransaksiBarang.add(dataTransaksi);

        jMenuBar1.add(TransaksiBarang);

        jMenu2.setText("Laporan Transaksi");

        menuTransaksiBulanan.setText("Transaksi Bulanan");
        menuTransaksiBulanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiBulananActionPerformed(evt);
            }
        });
        jMenu2.add(menuTransaksiBulanan);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addContainerGap(395, Short.MAX_VALUE))
            .addComponent(desktopUtama)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopUtama))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewPelangganInternalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPelangganInternalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewPelangganInternalActionPerformed

    private void TransaksiBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiBarangActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_TransaksiBarangActionPerformed

    private void menuBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarangActionPerformed
        //Ryan Ramadhan || 1910631170229 || 5H
        viewBarangInternal barang = new viewBarangInternal();
        this.desktopUtama.add(barang);
        barang.show();
    }//GEN-LAST:event_menuBarangActionPerformed

    private void menuPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPelangganActionPerformed
        //Ryan Ramadhan || 1910631170229 || 5H
        viewPelangganInternal pelanggan = new viewPelangganInternal();
        this.desktopUtama.add(pelanggan);
        pelanggan.show();
    }//GEN-LAST:event_menuPelangganActionPerformed

    private void menuTransaksiPOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiPOSActionPerformed
        //Ryan Ramadhan || 1910631170229 || 5H
        viewTransaksi transaksi = new viewTransaksi();
        this.desktopUtama.add(transaksi);
        transaksi.show();
    }//GEN-LAST:event_menuTransaksiPOSActionPerformed

    private void menuSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSupplierActionPerformed
        //Ryan Ramadhan || 1910631170229 || 5H
        viewSupplierInternal SupplierInternal = new viewSupplierInternal();
        this.desktopUtama.add(SupplierInternal);
        SupplierInternal.show();
    }//GEN-LAST:event_menuSupplierActionPerformed

    private void dataTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataTransaksiActionPerformed
        viewListDataTransaksi vlst = new viewListDataTransaksi();
        this.desktopUtama.add(vlst);
        vlst.show();
    }//GEN-LAST:event_dataTransaksiActionPerformed

    private void menuTransaksiBulananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiBulananActionPerformed
        // TODO add your handling code here:
        viewLaporanTransaksi vlt = new viewLaporanTransaksi();
        this.desktopUtama.add(vlt);
        vlt.show();
    }//GEN-LAST:event_menuTransaksiBulananActionPerformed

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
            java.util.logging.Logger.getLogger(App_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu TransaksiBarang;
    private javax.swing.JMenuItem dataTransaksi;
    private javax.swing.JDesktopPane desktopUtama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuBarang;
    private javax.swing.JMenuItem menuPelanggan;
    private javax.swing.JMenuItem menuSupplier;
    private javax.swing.JMenuItem menuTransaksiBulanan;
    private javax.swing.JMenuItem menuTransaksiPOS;
    private javax.swing.JMenu viewPelangganInternal;
    // End of variables declaration//GEN-END:variables
}