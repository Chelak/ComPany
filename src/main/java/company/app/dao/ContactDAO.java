package company.app.dao;

import company.app.domain.Contact;

import java.util.List;

/**
 * Created by user on 8/10/15.
 */
public interface ContactDAO
{
    public List<Contact> findAll();
    public List<Contact> findAllWithDetail();
    public Contact findById(Long id);
    public Contact save(Contact contact);
    public void delete(Contact contact);
}
