package company.app.runtool;

import company.app.dao.ContactDAO;
import company.app.domain.Contact;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;


/**
 * Created by user on 8/10/15.
 */
public class RunApp
{
    public static void main(String[] args)
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring-config.xml");
        ctx.refresh();

        ContactDAO contactDAO = ctx.getBean("contactDao", ContactDAO.class);
        List<Contact> contacts = contactDAO.findAll();

        listContacts(contacts);
    }

    private static void listContacts(List<Contact> contacts)
    {
        System.out.println(" ");
        System.out.println("Details:");

        for(Contact contact : contacts)
        {
            System.out.println(contact);
            System.out.println();
        }
    }
}
