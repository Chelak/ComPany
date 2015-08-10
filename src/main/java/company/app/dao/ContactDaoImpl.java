package company.app.dao;

import company.app.domain.Contact;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by user on 8/10/15.
 */
@Repository("contacDao")
@Transactional
public class ContactDaoImpl implements ContactDAO
{

    /**
     *
     */
    private SessionFactory sessionFactory;

    @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    @Transactional(readOnly = true)
    public List<Contact> findAll()
    {
        /*
        Session session = this.sessionFactory.openSession();
        List <Contact> contacts = sessionFactory.getCurrentSession().createCriteria("from Contact").list();
        session.close();
        */
        return  sessionFactory.getCurrentSession().createCriteria("from Contact").list();
    }

    public List<Contact> findAllWithDetail()
    {
        return null;
    }

    public Contact findById(Long id)
    {
        return null;
    }

    public Contact save(Contact contact)
    {
        return null;
    }

    public void delete(Contact contact)
    {

    }
}
