package es.brunomendoza.pgl.db.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "iface")
public class IfaceEntity {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "iface_id")
    private Long id;

    private String name;

    private String ipAddress;

    @NonNull
    private String mac;

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @NonNull
    public String getMac() {
        return mac;
    }

    public void setMac(@NonNull String mac) {
        this.mac = mac;
    }

    public IfaceEntity(@NonNull Long id, String name, String ipAddress, @NonNull String mac) {
        this.id = id;
        this.name = name;
        this.ipAddress = ipAddress;
        this.mac = mac;
    }
}