package at.bestsolution.builgr.entities;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class BuildGraphEntity extends PanacheEntity {
    public String name;
}