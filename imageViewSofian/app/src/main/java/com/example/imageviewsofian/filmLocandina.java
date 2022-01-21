package com.example.imageviewsofian;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class filmLocandina extends AppCompatActivity {
    ImageView imgLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film_locandina);
        Intent secInt = getIntent();
        String titolo = secInt.getStringExtra("tit");

        if(titolo=="Batman")
         {
           imgLoc.setImageResource(R.drawable.);
         }
        Toast.makeText(getApplicationContext(),titolo,Toast.LENGTH_LONG).show();

    }
    }


