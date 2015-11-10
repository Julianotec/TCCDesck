/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entity.Caixa;
import entity.Extrato;
import entity.Funcionario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ricardo_jose_santana
 */
public class caixaDAO {
 
    public void salvar(Caixa  caixa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.saveOrUpdate(caixa);
        session.getTransaction().commit();
        session.close();
    }
    public void excluir(Caixa caixa) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(caixa);
        session.getTransaction().commit();
        session.close();
    }
     public Caixa getById(Integer id) {
        Caixa C = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        C = (Caixa) session.get(Funcionario.class, id);
        session.getTransaction().commit();
        session.close();
        return C;
    }
    public List<Caixa> getAll() {
        List<Caixa> lista = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Query query = session.createQuery("from entity.Caixa");
        lista = query.list();

        session.getTransaction().commit();
        session.close();

        return lista;
    }
    
    
}
