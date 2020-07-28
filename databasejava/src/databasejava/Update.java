/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasejava;

import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Update {
     koneksi konek = new koneksi();

    public void Update(int nim, String nama, String alamat, String jk) {

        try {
            konek.koneksi();
            Statement statement = (Statement) konek.con.createStatement();
           // String sql = "update identitasmahasiswa set nim = "+ nim +"where nim = '" + nim + "'"; 
           // String sql = "update into identitasmahasiswa (nim, nama, alamat, jeniskelamin)"+ "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
           String sql_alamat = "update identitasmahasiswa set alamat='" + alamat + "'where nim='" + nim + "'";
           String sql_nama = "update identitasmahasiswa set nama='" + nama + "'where nim='"+ nim + "'";
           String sql_jk = "update identitasmahasiswa set jeniskelamin='" + jk + "'where nim='" + nim + "'";
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jk);
            statement.close();
            
            JOptionPane.showMessageDialog(null, "berhasil");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
