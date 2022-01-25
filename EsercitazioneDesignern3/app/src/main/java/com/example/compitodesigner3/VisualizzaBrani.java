package com.example.compitodesigner3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class VisualizzaBrani extends AppCompatActivity {
    String ListaCanzoni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizza_brani);
        Intent i =getIntent();
        Bundle b = i.getExtras();

        ListaCanzoni=b.getString("BRANI");
    }
}