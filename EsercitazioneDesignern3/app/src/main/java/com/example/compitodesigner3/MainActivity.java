package com.example.compitodesigner3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 EditText txtTitolo = (EditText) findViewById(R.id.titolo1);
 EditText txtBrano = (EditText) findViewById(R.id.titolo2);
 GestioneBrani gb;
 Button btnAggiungi = (Button)findViewById(R.id.button);
 Button btnVisualizza = (Button)findViewById(R.id.button2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(getApplicationContext(), VisualizzaBrani.class);
        gb = new GestioneBrani();

        btnAggiungi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                gb.addBrano();

            }
        });

        btnVisualizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i.putExtra("BRANI",gb.ListaBrani );
                startActivity(i);


            }
        });


    }
}