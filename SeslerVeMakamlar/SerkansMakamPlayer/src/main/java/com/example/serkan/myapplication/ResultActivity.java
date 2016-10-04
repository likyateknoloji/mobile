package com.example.serkan.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends Activity {

        MediaPlayer mediaPlayer;

        String makamAdi;

        @Override
        public void onCreate(Bundle bundle) {

                super.onCreate(bundle);
                // setContentView(R.layout.activity_result);
                setContentView(R.layout.activity_listviewexampleactivity);
                /*
                Bundle extras = getIntent().getExtras();
                String makamAdi = extras.getString("yourkey");
                TextView view = (TextView) findViewById(R.id.displayintentextra);
                view.setText(inputString);
                */

                Bundle extras = getIntent().getExtras();
                makamAdi = extras.getString("makamAdi");

                final ListView listview = (ListView) findViewById(R.id.listview);

                final ArrayList<String> list = new ArrayList<String>();

                list.add("Yerinden");
                list.add("Bir Ses");
                list.add("Dört Ses");

                final StableArrayAdapter adapter = new StableArrayAdapter(this, android.R.layout.simple_list_item_1, list);
                listview.setAdapter(adapter);

                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, final View view,
                                            int position, long id) {

                        final String item = (String) parent.getItemAtPosition(position);

                        String sesId = "";

                        switch (list.indexOf(item)) {
                            case 0:
                                // do nothing
                                break;
                            case 1:
                                sesId = "1";
                                break;
                            case 2:
                                sesId = "4";
                                break;
                        }

                        // int idOfResource = getResources().getIdentifier("fileX", "drawable","com.yourapppackage.www");
                        try {

                            // int idx = findIdx(DataHolder.getMakamlar(), makamAdi);
                            // int idOfResource = R.raw.class.getField(DataHolder.getDosyalar()[idx]).getInt(null);

                            int idOfResource = R.raw.class.getField(makamAdi + sesId).getInt(null);

                            sesId = "";

                            cleanUpMP();

                            mediaPlayer = MediaPlayer.create(getBaseContext(), idOfResource);
                            // MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.muhayyer);

                            mediaPlayer.start();

                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (NoSuchFieldException e) {
                            e.printStackTrace();
                        }

                    }

                });

        }

        int findIdx(String[] array, String item) {
                int idx = 0;
                for(String str: array) {
                        if(str.equals(item)) return idx;
                        idx ++;
                }

                return idx;
        }

        @Override
        public void finish() {
                cleanUpMP();
                Intent intent = new Intent();
                // EditText editText= (EditText) findViewById(R.id.returnValue);
                // String string = editText.getText().toString();
                // intent.putExtra("returnkey", string);
                setResult(RESULT_OK, intent);
                super.finish();
        }

        private void cleanUpMP() {
            if(mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
        }
}