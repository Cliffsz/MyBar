package com.example.mybar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Drinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);
        String[] array = getResources().getStringArray(R.array.Drinks_array);
        ArrayAdapter<String> DrinksAdapter= new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, array);
        ListView MyListView = findViewById(R.id.recycler_drinks);
        MyListView.setAdapter(DrinksAdapter);
    }
}


