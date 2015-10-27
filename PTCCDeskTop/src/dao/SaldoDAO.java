/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import entity.Saldo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ricardo jose santana
 */
public class SaldoDAO {
  
    
    
    
    public boolean update(Saldo saldo) {
          Connection c = this.getConnection();
        try {
            PreparedStatement ps = c.prepareStatement("UPDATE Saldo "
                    + "SET  valor = ?"
                    + " WHERE idsaldo = ?");
            ps.setDouble(1, saldo.getValor());
            ps.setInt(2, saldo.getIdSaldo());
            ps.execute();

            ps.close();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return false;
    }

    
    public Saldo getSaldoById(int id) {
        Connection c = this.getConnection();
        Saldo saldo = null;
        try {
            PreparedStatement ps = c.prepareStatement("SELECT idSaldo, "
                    + "( valor )  "
                    + "FROM saldo WHERE idSaldo = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                saldo = new Saldo();
                saldo.setIdSaldo(rs.getInt("idSaldo"));
                saldo.setValor(rs.getDouble("valor"));
               

            }
            rs.close();
            ps.close();
            return saldo;
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    private Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
}
