/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta.spk;

import java.sql.ResultSet;
import java.util.logging.Level;

/**
 *
 * @author lenovo
 */
public class bobot extends javax.swing.JInternalFrame {

    /**
     * Creates new form bobot
     */
    public bobot() {
        initComponents();
        
        readTanah();
        readLantai();
        readDinding();
        readPekerjaan();
        readPenghasilan();
    }
    
    public void readTanah(){
        try {
            String SQL = "SELECT bobot FROM bobot WHERE kodebobot = 'bobot1'";
            ResultSet rs = Database.executeQuery(SQL);
            
            while (rs.next()) {
                Object[] ob = new Object[1];
                ob[0] = rs.getString(1);
                
                bobottanah.setText((String) ob[0]);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void readLantai(){
        try {
            String SQL = "SELECT bobot FROM bobot WHERE kodebobot = 'bobot2'";
            ResultSet rs = Database.executeQuery(SQL);
            
            while (rs.next()) {
                Object[] ob = new Object[1];
                ob[0] = rs.getString(1);
                
                bobotlantai.setText((String) ob[0]);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void readDinding(){
        try {
            String SQL = "SELECT bobot FROM bobot WHERE kodebobot = 'bobot3'";
            ResultSet rs = Database.executeQuery(SQL);
            
            while (rs.next()) {
                Object[] ob = new Object[1];
                ob[0] = rs.getString(1);
                
                bobotdinding.setText((String) ob[0]);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void readPekerjaan(){
        try {
            String SQL = "SELECT bobot FROM bobot WHERE kodebobot = 'bobot4'";
            ResultSet rs = Database.executeQuery(SQL);
            
            while (rs.next()) {
                Object[] ob = new Object[1];
                ob[0] = rs.getString(1);
                
                bobotpekerjaan.setText((String) ob[0]);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void readPenghasilan(){
        try {
            String SQL = "SELECT bobot FROM bobot WHERE kodebobot = 'bobot5'";
            ResultSet rs = Database.executeQuery(SQL);
            
            while (rs.next()) {
                Object[] ob = new Object[1];
                ob[0] = rs.getString(1);
                
                bobotpenghasilan.setText((String) ob[0]);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void updateTanah(){
        String SQL = "UPDATE bobot SET bobot ='" + bobottanah.getText() + "' WHERE kodebobot = 'bobot1'";
        Database.execute(SQL);
    }
    
    public void updateLantai(){
        String SQL = "UPDATE bobot SET bobot ='" + bobotlantai.getText() + "' WHERE kodebobot = 'bobot2'";
        Database.execute(SQL);
    }
    
    public void updateDinding(){
        String SQL = "UPDATE bobot SET bobot ='" + bobotdinding.getText() + "' WHERE kodebobot = 'bobot3'";
        Database.execute(SQL);
    }
    
    public void updatePekerjaan(){
        String SQL = "UPDATE bobot SET bobot ='" + bobotpekerjaan.getText() + "' WHERE kodebobot = 'bobot4'";
        Database.execute(SQL);
    }
    
    public void updatePenghasilan(){
        String SQL = "UPDATE bobot SET bobot ='" + bobotpenghasilan.getText() + "' WHERE kodebobot = 'bobot5'";
        Database.execute(SQL);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Simpan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bobottanah = new javax.swing.JTextField();
        bobotlantai = new javax.swing.JTextField();
        bobotdinding = new javax.swing.JTextField();
        bobotpekerjaan = new javax.swing.JTextField();
        bobotpenghasilan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setText("Bobot Penilaian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(31, 31, 31))
        );

        Simpan.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        jLabel2.setText("Bobot Luas Tanah");

        jLabel3.setText("Bobot Jenis Lantai");

        jLabel4.setText("Bobot Jenis Dinding");

        jLabel5.setText("Bobot Jenis Pekerjaan");

        jLabel6.setText("Bobot Penghasilan");

        bobottanah.setText("-- Masukkan bobot luas tanah --");

        bobotlantai.setText("-- Masukkan bobot jenis lantai --");
        bobotlantai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bobotlantaiActionPerformed(evt);
            }
        });

        bobotdinding.setText("-- Masukkan bobot jenis dinding --");

        bobotpekerjaan.setText("-- Masukkan bobot jenis pekerjaan --");

        bobotpenghasilan.setText("-- Masukkan bobot penghasilan --");

        jLabel7.setText("%");

        jLabel8.setText("%");

        jLabel9.setText("%");

        jLabel10.setText("%");

        jLabel11.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bobotpekerjaan)
                            .addComponent(bobotpenghasilan)
                            .addComponent(bobotdinding)
                            .addComponent(bobotlantai)
                            .addComponent(bobottanah))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(Simpan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bobottanah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bobotlantai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bobotdinding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bobotpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bobotpenghasilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(Simpan)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimpanActionPerformed
        updateTanah();
        updateLantai();
        updateDinding();
        updatePekerjaan();
        updatePenghasilan();
        
        readTanah();
        readLantai();
        readDinding();
        readPekerjaan();
        readPenghasilan();
        
        topsis.Preferensi();
    }//GEN-LAST:event_SimpanActionPerformed

    private void bobotlantaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bobotlantaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bobotlantaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Simpan;
    private javax.swing.JTextField bobotdinding;
    private javax.swing.JTextField bobotlantai;
    private javax.swing.JTextField bobotpekerjaan;
    private javax.swing.JTextField bobotpenghasilan;
    private javax.swing.JTextField bobottanah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
