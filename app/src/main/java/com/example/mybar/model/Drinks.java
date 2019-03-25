package com.example.mybar.model;

/*import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "Drinks")
public class Drinks {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int did;

    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "price")
    private Integer price;

    public Drinks (String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public int getDid() {
        return did;
    }
    public void setDid(int did) {
        this.did = did;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;

    }

}

