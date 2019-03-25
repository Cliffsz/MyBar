package com.example.mybar.model;

/*import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface DrinksDao {
    @Insert
    void insertDrink(Drinks drinks);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertDrink(List<Drinks>drinks);

    @Update
    void updateDrink (Drinks drinks);

    @Delete
    void deleteDrink (Drinks drinks);

    @Delete
    void deleteTwoDrinks (Drinks drinksOne, Drinks drinksTwo);

    @Query("DELETE FROM Drinks")
    void deleteAll();

    @Query("SELECT * from Drinks ORDER BY name ASC")
    LiveData<List<Drinks>> getAllDrinks();

}
