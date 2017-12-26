package com.example.home.labtask2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final List<Contacts> contacts = new ArrayList<Contacts>();

        for (int i = 3; i < 1000; i++) {
            contacts.add(new Contacts("ABC", "03XXXXXXXXX", "Female"));

        }

        //creating adapter
        ListView list = (ListView) findViewById(R.id.list);
        CustomAdapter adapter = new CustomAdapter(this, contacts);
        list.setAdapter(adapter);

    }

}
