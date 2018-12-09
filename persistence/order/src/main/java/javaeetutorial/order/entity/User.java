package javaeetutorial.order.entity;


import java.util.Collection;
import static javax.persistence.CascadeType.ALL;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="PERSISTENCE_USER")

public class User implements java.io.Serializable {
    private static final long serialVersionUID = 6582105865012174694L;
    private String username;
    private String name;
    private String password;
    private String phone;
    private Collection<Reserve> reserves;


    public User() {
    }

    public User(String username, String name, String password, String phone) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    @Id
    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @OneToMany(cascade=ALL, mappedBy="user")
    public Collection<Reserve> getReserves() {
        return reserves;
    }


}

