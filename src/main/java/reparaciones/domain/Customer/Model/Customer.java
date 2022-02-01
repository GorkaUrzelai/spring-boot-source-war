package reparaciones.domain.Customer.Model;

import reparaciones.domain.Authority.Authority;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {

    //Con GenerationType.IDENTITY cuando vaya
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_generator")
    @SequenceGenerator(name = "customer_generator", sequenceName = "customer_seq", initialValue = 10)*/
    private Integer id;

    @Column
    private String firstName;

    @Column
    private String email;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "authorities_users", joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id"))
    private Set<Authority> authority;

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Authority> getAuthority() {
        return authority;
    }

    public void setAuthority(Set<Authority> authority) {
        this.authority = authority;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
    }
}
