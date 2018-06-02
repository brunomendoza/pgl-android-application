package es.brunomendoza.pgl.db.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import es.brunomendoza.pgl.db.entity.HostEntity;

@Dao
public interface HostDao {
    @Query("SELECT * FROM hosts ORDER BY name ASC")
    LiveData<List<HostEntity>> loadAllHosts();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAll(List<HostEntity> hosts);

    @Query("SELECT * FROM hosts WHERE host_id = :hostId")
    LiveData<HostEntity> loadHost(Long hostId);

    @Query("SELECT * FROM hosts WHERE host_id = :hostId")
    HostEntity loadHostSync(Long hostId);
}
