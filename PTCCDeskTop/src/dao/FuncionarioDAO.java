/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Funcionario;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ricardo_jose_santana
 */
public class FuncionarioDAO {

    public void salvar(Funcionario funcionario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.saveOrUpdate(funcionario);
        session.getTransaction().commit();
        session.close();
    }

    public List<Funcionario> getAll() {
        List<Funcionario> lista = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Query query = session.createQuery("from entity.Funcionario");
        lista = query.list();

        session.getTransaction().commit();
        session.close();

        return lista;
    }

    public void excluir(Funcionario funcionario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(funcionario);
        session.getTransaction().commit();
        session.close();
    }

    public Funcionario getById(Integer id) {
        Funcionario F = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        F = (Funcionario) session.get(Funcionario.class, id);
        session.getTransaction().commit();
        session.close();
        return F;
    }

    public Funcionario getBySenha(Integer senha) {
        Funcionario f = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<Funcionario> lista;
        Query query = session.createQuery("from entity.Funcionario where senha = :senhaInformada");
        query.setParameter("senhaInformada", senha);
        lista = query.list();
        if (lista.size() != 0) {
            f = lista.get(0);
        }
        session.getTransaction().commit();
        session.close();

        return f;
    }
    
    public Funcionario getBycpf(String cpf) {
        Funcionario f = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        List<Funcionario> lista;
        Query query = session.createQuery("from entity.Funcionario where cpf = :cpfInformada");
        query.setParameter("cpfInformada", cpf);
        lista = query.list();
        if (lista.size() != 0) {
            f = lista.get(0);
        }
        session.getTransaction().commit();
        session.close();

        return f;
    }
    

    public void excluir(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
