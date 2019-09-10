package com.company.crm.dto;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "roaster")
public class Roaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer roasterIdId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoasterIdId() {
        return roasterIdId;
    }

    public void setRoasterIdId(Integer roasterIdId) {
        this.roasterIdId = roasterIdId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Roaster roaster = (Roaster) o;
        return id.equals(roaster.id) &&
                roasterIdId.equals(roaster.roasterIdId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, roasterIdId);
    }

    public void setContent(Object this_is_a_test_roaster) {

    }

}
