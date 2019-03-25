package com.example.mybar;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
    }

    private static int PICK_CONTACT = 0;
    public void inviteFriend (View v) {
        Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        startActivityForResult(i, PICK_CONTACT);
    }
    private static int PICK_CONTACT_REQUEST = 0;
    protected void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode == PICK_CONTACT_REQUEST) {

        }
    }

}
