package com.company.crm.dto;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name="customer")
public class Coffee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;

    @OneToMany(mappedBy = "roasterIdId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Roaster> roasters;





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


    public Set<Roaster> getRoasters() {
        return roasters;
    }

    public void setRoasters(Set<Roaster> roasters) {
        this.roasters = roasters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return Objects.equals(getId(), coffee.getId()) &&
                Objects.equals(getFirstName(), coffee.getFirstName()) &&
                Objects.equals(getRoasters(), coffee.getRoasters());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getRoasters());
    }


}
