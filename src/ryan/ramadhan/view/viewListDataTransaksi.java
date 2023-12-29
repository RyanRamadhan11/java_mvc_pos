
package ryan.ramadhan.view;

import ryan.ramadhan.db.KoneksiDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import ryan.ramadhan.controller.controllerTransaksi;

/**
 * @author Ryan Ramadhan || 1910631170229
 */

public class viewListDataTransaksi extends javax.swing.JInternalFrame {
    
    private controllerTransaksi cT;
    private DefaultTableModel model;      
    //kontruktor 
    public viewListDataTransaksi() {
        
        initComponents();
        
        model = new DefaultTableModel();
        viewListDataTransaksi.setModel(model);
        model.addColumn("Id Transaksi");
        model.addColumn("Nama Pelanggan");
        model.addColumn("Nama Barang");
        model.addColumn("Qty");
        model.addColumn("Total Bayar");
        model.addColumn("Uang Bayar");
        
        tampilDataTransaksi();
    }
    
    //membuat methodtampilDataTransaksi()
    private void tampilDataTransaksi(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        String sql = "SELECT * FROM transaksi";
        
        try{
            Statement stat = (Statement) KoneksiDatabase.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            while(res.next()){
                //Mengambil hasil query variabel sql
                Object[] hasil;
                hasil = new Object[6]; //terdapat 6 field pada tabel transaksi
                hasil[0] = res.getString("idTransaksi");
                hasil[1] = res.getString("namaPelanggan");
                hasil[2] = res.getString("namaBarang");
                hasil[3] = res.getString("qty");
                hasil[4] = res.getString("totalBayar");
                hasil[5] = res.getString("uangBayar");
                
                model.addRow(hasil);
            }
        } catch(SQLException ex){
            Logger.getLogger(viewPelangganInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        viewListDataTransaksi = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("DAFTAR TRANSAKSI");

        viewListDataTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Transaksi", "Nama Pelanggan", "Nama Barang", "Qty", "Total Bayar", "Uang Bayar"
            }
        ));
        viewListDataTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListDataTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewListDataTransaksi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewListDataTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewListDataTransaksiMouseClicked

    }//GEN-LAST:event_viewListDataTransaksiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable viewListDataTransaksi;
    // End of variables declaration//GEN-END:variables
}
