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
public class Delete {

    koneksi konek = new koneksi();

    public void delete(int nim) {

        try {
            konek.koneksi();
            Statement statement = (Statement) konek.con.createStatement();
            String sql = "delete from identitasmahasiswa where nim = '" + nim + "'"; 
            statement.executeUpdate(sql);
            statement.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
