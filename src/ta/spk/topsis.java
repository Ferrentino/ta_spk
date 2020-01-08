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
public class topsis {

    public static int jumlahCalon() {
        String SQL = "SELECT id_calon FROM calon";
        ResultSet rs = Database.executeQuery(SQL);
        int jumlah = 0;

        try {
            while (rs.next()) {
                jumlah += 1;
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        return jumlah;
    }

    
    
    //NBTanah-----------------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------------------
    public static int bobotTanah() {
        int bobot = 0;

        try {
            String SQL = "SELECT bobot FROM bobot WHERE kodebobot = 'bobot1'";
            ResultSet rs = Database.executeQuery(SQL);

            while (rs.next()) {
                Object[] ob = new Object[1];
                ob[0] = rs.getString(1);

                bobot = Integer.parseInt((String) ob[0]);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return bobot;
    }

    public static double akarTanah() {
        String SQL = "SELECT ntanah FROM calon";
        ResultSet rs = Database.executeQuery(SQL);
        int jumlah = 0;
        double akar = 0;

        try {
            while (rs.next()) {
                String tanah = rs.getString(1);
                double ntanah = Math.pow(Integer.parseInt(tanah), 2);

                jumlah += ntanah;
            }
            akar = Math.sqrt(jumlah);
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return akar;
    }

    public static void NBTanah() {
        String[] idcalon = new String[jumlahCalon()];
        double[] nbtanah = new double[jumlahCalon()];
        int x = 0;

        String SQL = "SELECT id_calon, ntanah FROM calon";
        ResultSet rs = Database.executeQuery(SQL);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                int n = Integer.parseInt(rs.getString(2));

                idcalon[x] = id;
                nbtanah[x] = (n / akarTanah()) * bobotTanah() / 100;
                x++;
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        for (int i = 0; i < jumlahCalon(); i++) {
            String sql = "UPDATE calon SET "
                    + "NBTanah = '" + nbtanah[i] + "'"
                    + "WHERE ID_CALON = '" + idcalon[i] + "'";
            Database.execute(sql);
        }
    }
 
    
    
    //NBLantai---------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static int bobotLantai() {
        int bobot = 0;

        try {
            String SQL = "SELECT bobot FROM bobot WHERE kodebobot = 'bobot2'";
            ResultSet rs = Database.executeQuery(SQL);

            while (rs.next()) {
                Object[] ob = new Object[1];
                ob[0] = rs.getString(1);

                bobot = Integer.parseInt((String) ob[0]);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return bobot;
    }

    public static double akarLantai() {
        String SQL = "SELECT nlantai FROM calon";
        ResultSet rs = Database.executeQuery(SQL);
        int jumlah = 0;
        double akar = 0;

        try {
            while (rs.next()) {
                String lantai = rs.getString(1);
                double nlantai = Math.pow(Integer.parseInt(lantai), 2);

                jumlah += nlantai;
            }
            akar = Math.sqrt(jumlah);
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return akar;
    }

    public static void NBLantai() {
        String[] idcalon = new String[jumlahCalon()];
        double[] nblantai = new double[jumlahCalon()];
        int x = 0;

        String SQL = "SELECT id_calon, nlantai FROM calon";
        ResultSet rs = Database.executeQuery(SQL);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                int n = Integer.parseInt(rs.getString(2));

                idcalon[x] = id;
                nblantai[x] = (n / akarLantai()) * bobotLantai() / 100;
                x++;
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        for (int i = 0; i < jumlahCalon(); i++) {
            String sql = "UPDATE calon SET "
                    + "NBLantai = '" + nblantai[i] + "'"
                    + "WHERE ID_CALON = '" + idcalon[i] + "'";
            Database.execute(sql);
        }
    }
    
    
    
    //NBDinding---------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static int bobotDinding() {
        int bobot = 0;

        try {
            String SQL = "SELECT bobot FROM bobot WHERE kodebobot = 'bobot3'";
            ResultSet rs = Database.executeQuery(SQL);

            while (rs.next()) {
                Object[] ob = new Object[1];
                ob[0] = rs.getString(1);

                bobot = Integer.parseInt((String) ob[0]);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return bobot;
    }

    public static double akarDinding() {
        String SQL = "SELECT ndinding FROM calon";
        ResultSet rs = Database.executeQuery(SQL);
        int jumlah = 0;
        double akar = 0;

        try {
            while (rs.next()) {
                String dinding = rs.getString(1);
                double ndinding = Math.pow(Integer.parseInt(dinding), 2);

                jumlah += ndinding;
            }
            akar = Math.sqrt(jumlah);
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return akar;
    }

    public static void NBDinding() {
        String[] idcalon = new String[jumlahCalon()];
        double[] nbdinding = new double[jumlahCalon()];
        int x = 0;

        String SQL = "SELECT id_calon, ndinding FROM calon";
        ResultSet rs = Database.executeQuery(SQL);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                int n = Integer.parseInt(rs.getString(2));

                idcalon[x] = id;
                nbdinding[x] = (n / akarDinding()) * bobotDinding() / 100;
                x++;
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        for (int i = 0; i < jumlahCalon(); i++) {
            String sql = "UPDATE calon SET "
                    + "NBDinding = '" + nbdinding[i] + "'"
                    + "WHERE ID_CALON = '" + idcalon[i] + "'";
            Database.execute(sql);
        }
    }
    
    
    
    //NBPekerjaan---------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static int bobotPekerjaan() {
        int bobot = 0;

        try {
            String SQL = "SELECT bobot FROM bobot WHERE kodebobot = 'bobot4'";
            ResultSet rs = Database.executeQuery(SQL);

            while (rs.next()) {
                Object[] ob = new Object[1];
                ob[0] = rs.getString(1);

                bobot = Integer.parseInt((String) ob[0]);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return bobot;
    }

    public static double akarPekerjaan() {
        String SQL = "SELECT npekerjaan FROM calon";
        ResultSet rs = Database.executeQuery(SQL);
        int jumlah = 0;
        double akar = 0;

        try {
            while (rs.next()) {
                String pekerjaan = rs.getString(1);
                double npekerjaan = Math.pow(Integer.parseInt(pekerjaan), 2);

                jumlah += npekerjaan;
            }
            akar = Math.sqrt(jumlah);
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return akar;
    }

    public static void NBPekerjaan() {
        String[] idcalon = new String[jumlahCalon()];
        double[] nbpekerjaan = new double[jumlahCalon()];
        int x = 0;

        String SQL = "SELECT id_calon, npekerjaan FROM calon";
        ResultSet rs = Database.executeQuery(SQL);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                int n = Integer.parseInt(rs.getString(2));

                idcalon[x] = id;
                nbpekerjaan[x] = (n / akarPekerjaan()) * bobotPekerjaan() / 100;
                x++;
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        for (int i = 0; i < jumlahCalon(); i++) {
            String sql = "UPDATE calon SET "
                    + "NBPekerjaan = '" + nbpekerjaan[i] + "'"
                    + "WHERE ID_CALON = '" + idcalon[i] + "'";
            Database.execute(sql);
        }
    }
    
    
    
    //NBPenghasilan---------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static int bobotPenghasilan() {
        int bobot = 0;

        try {
            String SQL = "SELECT bobot FROM bobot WHERE kodebobot = 'bobot5'";
            ResultSet rs = Database.executeQuery(SQL);

            while (rs.next()) {
                Object[] ob = new Object[1];
                ob[0] = rs.getString(1);

                bobot = Integer.parseInt((String) ob[0]);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return bobot;
    }

    public static double akarPenghasilan() {
        String SQL = "SELECT npenghasilan FROM calon";
        ResultSet rs = Database.executeQuery(SQL);
        int jumlah = 0;
        double akar = 0;

        try {
            while (rs.next()) {
                String penghasilan = rs.getString(1);
                double npenghasilan = Math.pow(Integer.parseInt(penghasilan), 2);

                jumlah += npenghasilan;
            }
            akar = Math.sqrt(jumlah);
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return akar;
    }

    public static void NBPenghasilan() {
        String[] idcalon = new String[jumlahCalon()];
        double[] nbpenghasilan = new double[jumlahCalon()];
        int x = 0;

        String SQL = "SELECT id_calon, npenghasilan FROM calon";
        ResultSet rs = Database.executeQuery(SQL);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                int n = Integer.parseInt(rs.getString(2));

                idcalon[x] = id;
                nbpenghasilan[x] = (n / akarPenghasilan()) * bobotPenghasilan() / 100;
                x++;
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        for (int i = 0; i < jumlahCalon(); i++) {
            String sql = "UPDATE calon SET "
                    + "NBPenghasilan = '" + nbpenghasilan[i] + "'"
                    + "WHERE ID_CALON = '" + idcalon[i] + "'";
            Database.execute(sql);
        }
    }
    
    
    
    //Solusi Ideal Positif---------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static double SIPTanah(){
        String SQL = "SELECT nbtanah FROM calon ORDER BY nbtanah DESC LIMIT 1";
        ResultSet rs = Database.executeQuery(SQL);
        double nilai = 0;
        
        try {
            while (rs.next()) {
                String sip = rs.getString(1);
                nilai = Double.parseDouble(sip);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nilai;
    }
    
    public static double SIPLantai(){
        String SQL = "SELECT nblantai FROM calon ORDER BY nblantai DESC LIMIT 1";
        ResultSet rs = Database.executeQuery(SQL);
        double nilai = 0;
        
        try {
            while (rs.next()) {
                String sip = rs.getString(1);
                nilai = Double.parseDouble(sip);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nilai;
    }
    
    public static double SIPDinding(){
        String SQL = "SELECT nbdinding FROM calon ORDER BY nbdinding DESC LIMIT 1";
        ResultSet rs = Database.executeQuery(SQL);
        double nilai = 0;
        
        try {
            while (rs.next()) {
                String sip = rs.getString(1);
                nilai = Double.parseDouble(sip);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nilai;
    }
    
    public static double SIPPekerjaan(){
        String SQL = "SELECT nbpekerjaan FROM calon ORDER BY nbpekerjaan DESC LIMIT 1";
        ResultSet rs = Database.executeQuery(SQL);
        double nilai = 0;
        
        try {
            while (rs.next()) {
                String sip = rs.getString(1);
                nilai = Double.parseDouble(sip);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nilai;
    }
    
    public static double SIPPenghasilan(){
        String SQL = "SELECT nbpenghasilan FROM calon ORDER BY nbpenghasilan DESC LIMIT 1";
        ResultSet rs = Database.executeQuery(SQL);
        double nilai = 0;
        
        try {
            while (rs.next()) {
                String sip = rs.getString(1);
                nilai = Double.parseDouble(sip);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nilai;
    }
    
    
    
    
   //Solusi Ideal Negatif---------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static double SINTanah(){
        String SQL = "SELECT nbtanah FROM calon ORDER BY nbtanah ASC LIMIT 1";
        ResultSet rs = Database.executeQuery(SQL);
        double nilai = 0;
        
        try {
            while (rs.next()) {
                String sip = rs.getString(1);
                nilai = Double.parseDouble(sip);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nilai;
    }
    
    public static double SINLantai(){
        String SQL = "SELECT nblantai FROM calon ORDER BY nblantai ASC LIMIT 1";
        ResultSet rs = Database.executeQuery(SQL);
        double nilai = 0;
        
        try {
            while (rs.next()) {
                String sip = rs.getString(1);
                nilai = Double.parseDouble(sip);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nilai;
    }
    
    public static double SINDinding(){
        String SQL = "SELECT nbdinding FROM calon ORDER BY nbdinding ASC LIMIT 1";
        ResultSet rs = Database.executeQuery(SQL);
        double nilai = 0;
        
        try {
            while (rs.next()) {
                String sip = rs.getString(1);
                nilai = Double.parseDouble(sip);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nilai;
    }
    
    public static double SINPekerjaan(){
        String SQL = "SELECT nbpekerjaan FROM calon ORDER BY nbpekerjaan ASC LIMIT 1";
        ResultSet rs = Database.executeQuery(SQL);
        double nilai = 0;
        
        try {
            while (rs.next()) {
                String sip = rs.getString(1);
                nilai = Double.parseDouble(sip);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nilai;
    }
    
    public static double SINPenghasilan(){
        String SQL = "SELECT nbpenghasilan FROM calon ORDER BY nbpenghasilan ASC LIMIT 1";
        ResultSet rs = Database.executeQuery(SQL);
        double nilai = 0;
        
        try {
            while (rs.next()) {
                String sip = rs.getString(1);
                nilai = Double.parseDouble(sip);
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return nilai;
    }
    
    
    
    //JSIP---------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static void JSIP() {
        String[] idcalon = new String[jumlahCalon()];
        double[] jsip = new double[jumlahCalon()];
        int x = 0;

        String SQL = "SELECT id_calon, nbtanah, nblantai, nbdinding, nbpekerjaan, nbpenghasilan FROM calon";
        ResultSet rs = Database.executeQuery(SQL);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                double tanah = Math.pow((Double.parseDouble(rs.getString(2))-SIPTanah()), 2);
                double lantai = Math.pow((Double.parseDouble(rs.getString(3))-SIPLantai()), 2);
                double dinding = Math.pow((Double.parseDouble(rs.getString(4))-SIPDinding()), 2);
                double pekerjaan = Math.pow((Double.parseDouble(rs.getString(5))-SIPPekerjaan()), 2);
                double penghasilan = Math.pow((Double.parseDouble(rs.getString(6))-SIPPenghasilan()), 2);
                
                double total =tanah + lantai + dinding + pekerjaan + penghasilan;

                idcalon[x] = id;
                jsip[x] = Math.sqrt(total);
                x++;
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        for (int i = 0; i < jumlahCalon(); i++) {
            String sql = "UPDATE calon SET "
                    + "JSIP = '" + jsip[i] + "'"
                    + "WHERE ID_CALON = '" + idcalon[i] + "'";
            Database.execute(sql);
        }
    }
    
    
    
    //JSIN---------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static void JSIN() {
        String[] idcalon = new String[jumlahCalon()];
        double[] jsin = new double[jumlahCalon()];
        int x = 0;

        String SQL = "SELECT id_calon, nbtanah, nblantai, nbdinding, nbpekerjaan, nbpenghasilan FROM calon";
        ResultSet rs = Database.executeQuery(SQL);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                double tanah = Math.pow((Double.parseDouble(rs.getString(2))-SINTanah()), 2);
                double lantai = Math.pow((Double.parseDouble(rs.getString(3))-SINLantai()), 2);
                double dinding = Math.pow((Double.parseDouble(rs.getString(4))-SINDinding()), 2);
                double pekerjaan = Math.pow((Double.parseDouble(rs.getString(5))-SINPekerjaan()), 2);
                double penghasilan = Math.pow((Double.parseDouble(rs.getString(6))-SINPenghasilan()), 2);
                
                double total =tanah + lantai + dinding + pekerjaan + penghasilan;

                idcalon[x] = id;
                jsin[x] = Math.sqrt(total);
                x++;
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        for (int i = 0; i < jumlahCalon(); i++) {
            String sql = "UPDATE calon SET "
                    + "JSIN = '" + jsin[i] + "'"
                    + "WHERE ID_CALON = '" + idcalon[i] + "'";
            Database.execute(sql);
        }
    }
    
    
    
    //Preferensi---------------------------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------------------------------
    public static void Preferensi() {
        NBTanah();
        NBLantai();
        NBDinding();
        NBPekerjaan();
        NBPenghasilan();
        
        JSIP();
        JSIN();
        
        String[] idcalon = new String[jumlahCalon()];
        double[] preferensi = new double[jumlahCalon()];
        int x = 0;

        String SQL = "SELECT id_calon, jsip, jsin FROM calon";
        ResultSet rs = Database.executeQuery(SQL);

        try {
            while (rs.next()) {
                String id = rs.getString(1);
                double jsip = Double.parseDouble(rs.getString(2));
                double jsin = Double.parseDouble(rs.getString(3));
                
                double nilai = jsin / (jsip + jsin);

                idcalon[x] = id;
                preferensi[x] = nilai;
                x++;
            }
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        for (int i = 0; i < jumlahCalon(); i++) {
            String sql = "UPDATE calon SET "
                    + "Preferensi = '" + preferensi[i] + "'"
                    + "WHERE ID_CALON = '" + idcalon[i] + "'";
            Database.execute(sql);
        }
    }
}