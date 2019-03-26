package com.example.mybar;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void map (View v) {
        Intent i = new Intent(this, Maps.class);
        startActivity(i);
    }
    public void about (View v) {
        Intent i = new Intent(this, about.class);
        startActivity(i);
    }
    public void contact (View v) {
        Intent i = new Intent(this, contact.class);
        startActivity(i);
    }
    public void drinks (View v) {
        Intent i = new Intent(this, Drinks.class);
        startActivity(i);
    }
    public void event (View v) {
        Intent i = new Intent(this, Event.class);
        startActivity(i);
    }
    public void songs (View v) {
        Intent i = new Intent (this, TopThreeSongs.class );
        startActivity(i);
    }
}

