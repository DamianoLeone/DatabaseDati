package com.example.array5dcampana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
String nazioni [] = {"Italia","Francia","Germania","Olanda"};
ListView listastati;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listastati = findViewById(R.id.lvStati);
        ArrayAdapter<String> lvStati
    }
    }
}