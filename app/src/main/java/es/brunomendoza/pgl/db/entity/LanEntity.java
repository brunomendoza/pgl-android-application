package es.brunomendoza.pgl.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "lans",
        indices = {
            @Index(value = {"address", "netmask"}, unique = true),
        })
public class LanEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "lan_id")
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String address;

    @NonNull
    private String netmask;
    private String gateway;
    private String description;

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getAddress() {
        return address;
    }

    public void setAddress(@NonNull String address) {
        this.address = address;
    }

    @NonNull
    public String getNetmask() {
        return netmask;
    }

    public void setNetmask(@NonNull String netmask) {
        this.netmask = netmask;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LanEntity(@NonNull Long id, @NonNull String name, @NonNull String address, @NonNull String netmask, String gateway, String description) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.netmask = netmask;
        this.gateway = gateway;
        this.description = description;
    }
}