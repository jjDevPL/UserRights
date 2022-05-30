package com.jj.userrights.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;
/*import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/

/*@Entity*/
@AllArgsConstructor
public class UserRights {
/*    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)*/
    private Long id;
    private String name;

    public UserRights() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserRights)) return false;
        UserRights that = (UserRights) o;
        return Objects.equals(getId(), that.getId()) &&
            Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
