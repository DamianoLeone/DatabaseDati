package com.example.imageviewsofian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView imgFilm;
    String[] nazioni = new String[]{"Batman","Shazam","The flash"};
    @Override



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final ArrayList<String> listp = new ArrayList<String>();
        for (int i = 0; i < nazioni.length;i++) {
            listp.add(nazioni[i]);
        }

        ListView lvfilm = (ListView) findViewById(R.id.list_view);


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, listp);
        lvfilm.setAdapter(adapter);

        lvfilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String titolo = (String)lvfilm.getItemAtPosition(position);


                Intent nuovAct= new Intent(getApplicationContext(),filmLocandina.class);
                nuovAct.putExtra("tit",titolo);
                startActivity(nuovAct);
                imgFilm.setImageResource(R.drawable.sium);


            }
        });
    }
}