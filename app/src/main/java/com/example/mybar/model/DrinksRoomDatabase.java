package com.example.mybar.model;

/*import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

@Database(entities = {Drinks.class}, version = 1, exportSchema = false) @TypeConverters({TypeConverters.class})
public abstract class DrinksRoomDatabase extends RoomDatabase {
    public abstract DrinksDao drinksDao();
    private static final String DRINKS_DB_NAME = "drinks_db";

    private static  volatile DrinksRoomDatabase INSTANCE;

    static DrinksRoomDatabase getDrinksRoomDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (DrinksRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            DrinksRoomDatabase.class, DRINKS_DB_NAME)
                            .fallbackToDestructiveMigration()
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }


        }
        return INSTANCE;
        }

        public static RoomDatabase.Callback sRoomDatabaseCallback =
                new RoomDatabase.Callback(){
                    @Override
                    public void onOpen (@NonNull SupportSQLiteDatabase db){
                        super.onOpen(db);
                        new PopulateDbAsync(INSTANCE).execute();
                    }
        };
    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {
        private final DrinksDao mDao;

        PopulateDbAsync(DrinksRoomDatabase db) {
            mDao = db.drinksDao();
        }

        @Override
        protected Void doInBackground(final Void... params) {
            mDao.deleteAll();
            Drinks Beer = new Drinks("Beer", 10);
            mDao.insertDrink(Beer);
            Drinks DraughtBeer = new Drinks ("Draught Beer", 20);
            mDao.insertDrink(DraughtBeer);
            Drinks Shots = new Drinks ("Shots", 25);
            mDao.insertDrink(Shots);
            return null;
        }
    }
}
*/
