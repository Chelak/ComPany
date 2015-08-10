package company.app.domain;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;
/**
 * Created by user on 8/10/15.
 */
@Entity
@Table(name = "contact_tel_detail")
public class ContactTelDetail
{
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Long id;
    @Version
    @Column(name = "version")
    private int version;
    @Column(name = "tel_type")
    private String telType;
    @Column(name = "tel_number")
    private String telNumber;
    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contact contact;


    public ContactTelDetail()
    {

    }

    public ContactTelDetail(String telType, String telNumber)
    {
        this.telType = telType;
        this.telNumber = telNumber;
    }


    public Long getId()
    {
        return this.id;
    }
    public void setId(Long id)
    {
        this.id = id;
    }

    public int getVersion()
    {
        return this.version;
    }
    public void setVersion(int version)
    {
        this.version = version;
    }

    public String getTelType()
    {
        return this.telType;
    }
    public void setTelType(String telType)
    {
        this.telType = telType;
    }

    public String getTelNumber()
    {
        return this.telNumber;
    }
    public void setTelNumber(String telNumber)
    {
        this.telNumber = telNumber;
    }


    public Contact getContact()
    {
        return this.contact;
    }
    public void setContact(Contact contact)
    {
        this.contact = contact;
    }
    public String toString()
    {
        return "Contact Tel Detail - Id: " + id + ", Contact id: "
                + getContact().getId() + ", Type: "
                + telType + ", Number: " + telNumber;
    }
}
