package com.example.serkan.myapplication;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SerkansMakamPlayer extends AppCompatActivity {

    private static final int REQUEST_CODE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_listviewexampleactivity);

        final ListView listview = (ListView) findViewById(R.id.listview);

        final ArrayList<String> list = new ArrayList<String>();

        // list.addAll(DataHolder.getMakamlar().keySet());

        for (int i = 0; i < DataHolder.getMakamlarEski().length; ++i) {
             list.add(DataHolder.getMakamlarEski()[i]);
        }

        final StableArrayAdapter adapter = new StableArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, final View view,
                                    int position, long id) {

                final String item = (String) parent.getItemAtPosition(position);

                Intent i = new Intent(getBaseContext(), ResultActivity.class);

                i.putExtra("makamAdi", DataHolder.getMakamlar().get(item));

                startActivityForResult(i, REQUEST_CODE);

            }

        });
    }




    private HashMap<String, String> putData(String name, String purpose) {
        HashMap<String, String> item = new HashMap<String, String>();
        item.put("Makam", name);
        item.put("Dosya", purpose);
        return item;
    }
}
