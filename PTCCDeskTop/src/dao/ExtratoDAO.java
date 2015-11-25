package dao;

import entity.Extrato;
import entity.Funcionario;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author ricardo_jose_santana
 */
public class ExtratoDAO {

    public void salvar(Extrato extrato) {
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

    public List<Extrato> getAllByData(Date dataExtrato) {
        List<Extrato> lista = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Criteria criteria = session.createCriteria(Extrato.class);
        //criteria.addOrder(Order.asc("valor"));

        Calendar calendario = new GregorianCalendar();
        calendario.setTime(dataExtrato);
        int ano = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH);
        int dia = calendario.get(Calendar.DAY_OF_MONTH);

        Calendar calendarioInicio = new GregorianCalendar(ano, mes, dia, 0, 0, 0);
        Calendar calendarioFim = new GregorianCalendar(ano, mes, dia, 23, 59, 59);
        System.out.println(calendarioInicio.getTime());
        System.out.println(calendarioFim.getTime());
        criteria.add(Restrictions.between("data", calendarioInicio.getTime(), calendarioFim.getTime()));

        lista = criteria.list();

        session.getTransaction().commit();
        session.close();

        return lista;
    }
}
