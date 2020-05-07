package at.bestsolution.builgr.entities;

import java.util.ArrayList;
import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class BuildItemEntity extends PanacheEntity {
    public String name;
    public String triggerURL;
    public List<BuildItemEntity> children = new ArrayList<>();
}