package com.example.compitodesigner3;

import android.widget.EditText;

import java.util.ArrayList;

public class GestioneBrani {
    ArrayList<Brano> ListaBrani;
    public GestioneBrani()
    {
        ListaBrani = new ArrayList();
    }
    public void visualizzaBrani()
    {



    }

    public void addBrano( String titolo, String genere)
    {
      Brano br = new Brano( titolo, genere);
      ListaBrani.add(br);



    }
    public String listaSong() {
        StringBuilder sbSong = new StringBuilder();
        for (Brano brc: ListaBrani) {

            sbSong.append(brc.getTitolo().toString());
            sbSong.append(brc.getGenere().toString()+"-");
            sbSong.append("\n");
        }
        return sbSong.toString();


    }



}
