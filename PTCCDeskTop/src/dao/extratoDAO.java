
package dao;


import entity.Extrato;
import entity.Funcionario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ricardo_jose_santana
 */
public class extratoDAO {
   public void salvar(Extrato  extrato) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.saveOrUpdate(extrato);
        session.getTransaction().commit();
        session.close();
    }
    public void excluir(Extrato extrato) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.delete(extrato);
        session.getTransaction().commit();
        session.close();
    }
     public Extrato getById(Integer id) {
        Extrato E = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        E = (Extrato) session.get(Funcionario.class, id);
        session.getTransaction().commit();
        session.close();
        return E;
    }
    public List<Extrato> getAll() {
        List<Extrato> lista = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Query query = session.createQuery("from entity.Extrato");
        lista = query.list();

        session.getTransaction().commit();
        session.close();

        return lista;
        
        
        
    }
}
