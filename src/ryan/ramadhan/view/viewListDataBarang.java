
package ryan.ramadhan.view;

import ryan.ramadhan.db.KoneksiDatabase;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 * @author Ryan Ramadhan || 1910631170229
 */

public class viewListDataBarang extends javax.swing.JFrame {

    //inisialiasi class viewTransaksi dan DefaultTableModel
    private viewTransaksi vT;
    private DefaultTableModel model;
    private String sql = "";
    
    //kontruktor
    public viewListDataBarang(){
        
    }
    public viewListDataBarang(viewTransaksi vT) {
        initComponents();
        this.vT = vT;
        model = new DefaultTableModel();
        viewListTabelDataBarang.setModel(model);
        model.addColumn("ID");
        model.addColumn("NAMA");
        model.addColumn("HARGA");
        model.addColumn("JUMLAH");
        
        tampilDataBarang("");
    }
    
    private void tampilDataBarang(String data){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        if(data.equals("")){
            sql = "SELECT * FROM barang";
        }else sql = "SELECT * FROM barang where namaBarang LIKE '"+data+"%'";
        
        try {
            Statement stat = (Statement)KoneksiDatabase.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            while(res.next()){
                // Mengambil hasil query variabel sql
                Object [] hasil;
                hasil = new Object[4]; // Ada 4 field di tabel barang 
                
                hasil[0] = res.getString("idBarang");
                hasil[1] = res.getString("namaBarang");
                hasil[2] = res.getString("hargaBarang");
                hasil[3] = res.getString("jumlahBarang");
                
                model.addRow(hasil);
            }      
        } catch (SQLException ex) {
            Logger.getLogger(viewListDataBarang.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        viewListTabelDataBarang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        namaBarang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        viewListTabelDataBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Barang", "Nama Barang", "Harga Barang", "Jumlah"
            }
        ));
        viewListTabelDataBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewListTabelDataBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewListTabelDataBarang);

        jLabel1.setText("Cari Nama Barang");

        namaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaBarangActionPerformed(evt);
            }
        });
        namaBarang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaBarangKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Daftar Barang");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaBarangActionPerformed

    private void viewListTabelDataBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewListTabelDataBarangMouseClicked
        //Ryan Ramadhan || 1910631170229
        int listX = viewListTabelDataBarang.getSelectedRow();
        vT.getNamaBarang().setText(viewListTabelDataBarang.getValueAt(listX,1).toString());
        vT.getHargaBarang().setText(viewListTabelDataBarang.getValueAt(listX,2).toString());
                
        //vT.getHargaBarang().requestFocus();
        this.dispose();
    }//GEN-LAST:event_viewListTabelDataBarangMouseClicked

    private void namaBarangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaBarangKeyPressed
        //Ryan Ramadhan || 1910631170229
        tampilDataBarang(namaBarang.getText());
    }//GEN-LAST:event_namaBarangKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTable viewListTabelDataBarang;
    // End of variables declaration//GEN-END:variables
}