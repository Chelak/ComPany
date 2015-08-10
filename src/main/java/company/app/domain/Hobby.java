package company.app.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 8/10/15.
 */
@Entity
@Table(name = "hobby")
public class Hobby
{
    @Id
    @Column(name = "hobby_id")
    private String hobbyId;
    @ManyToMany
    @JoinTable(name = "contact_hobby_detail",
            joinColumns = @JoinColumn(name = "hobby_id"),
            inverseJoinColumns = @JoinColumn(name = "contact_id"))
    private Set<Contact> contacts = new HashSet<Contact>();

    public String getHobbyId() {
        return this.hobbyId;
    }
    public void setHobbyId(String hobbyId) {
        this.hobbyId = hobbyId;
    }
    public String toString() {
        return "Hobby :" + getHobbyId();
    }



    public Set<Contact> getContacts() {
        return this.contacts;
    }
    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }
}
