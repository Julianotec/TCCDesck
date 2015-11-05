/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Saldo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ricardo jose santana
 */
public class SaldoDAO {

    public Saldo getSaldoById(int id) {
        Saldo s = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        s = (Saldo) session.get(Saldo.class, id);
        session.getTransaction().commit();
        session.close();
        return s;
    }

}
