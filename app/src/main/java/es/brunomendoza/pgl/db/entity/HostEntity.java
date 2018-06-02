package es.brunomendoza.pgl.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "hosts")
public class HostEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "host_id")
    private Long id;

    @ColumnInfo(name = "name")
    private String name;

    private String brand;

    private String model;

    private String description;

    private String picture;

    @NonNull
    public Long getId() {
        return id;
    }

//    public void setId(@NonNull Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public HostEntity(String name, String brand, String model, String description, String picture) {
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.picture = picture;
    }

    public HostEntity(@NonNull Long id, String name, String brand, String model, String description, String picture) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.description = description;
        this.picture = picture;
    }
}
