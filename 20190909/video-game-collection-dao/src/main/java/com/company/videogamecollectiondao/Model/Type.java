package com.company.videogamecollectiondao.Model;

import java.util.Objects;

public class Type {

    private int type_id;
    private String name;
    private String descrption;

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return type_id == type.type_id &&
                name.equals(type.name) &&
                descrption.equals(type.descrption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type_id, name, descrption);
    }
}
