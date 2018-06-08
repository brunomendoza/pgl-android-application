package es.brunomendoza.pgl.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import es.brunomendoza.pgl.db.dao.HostDao;
import es.brunomendoza.pgl.db.entity.HostEntity;

@Database(entities = {HostEntity.class}, version = 1)
public abstract class AppDatabase extends Room {
    private static AppDatabase sInstance;

    public abstract HostDao hostDao();

    private static final String DATABASE_NAME = "pgl-android-project";

    public static AppDatabase getInstance(final Context context) {
//        if (sInstance == null) {
//            synchronized (AppDatabase.class) {
//                if (sInstance == null) {
//                    sInstance = Room.databaseBuilder(context.getApplicationContext(),
//                            AppDatabase.class, DATABASE_NAME)
//                            // Limpia y reconstruye en vez de migrar si no hay objeto Migration.
//                            .fallbackToDestructiveMigration()
//                            .addCallback(sRoomDatabaseCallback)
//                            .build();
//                }
//            }
//        }
        return sInstance;
    }

//    private static RoomDatabase.Callback sRoomDatabaseCallBack() {
//
//    }
}
