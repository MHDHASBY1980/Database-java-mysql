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
public class Insert {

    koneksi konek = new koneksi();

    public void insert(int nim, String nama, String alamat, String jk) {

        try {
            konek.koneksi();
            Statement statement = (Statement) konek.con.createStatement();
            String sql = "insert into identitasmahasiswa (nim, nama, alamat, jeniskelamin)"+ "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
