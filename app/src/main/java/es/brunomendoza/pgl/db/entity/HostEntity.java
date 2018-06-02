package es.brunomendoza.pgl.db.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "host")
public class HostEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private Long id;
    private String name;

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
}
