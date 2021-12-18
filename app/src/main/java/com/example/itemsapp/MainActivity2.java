package com.example.itemsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    ListView lvsongs;
    String Canzoni[] = {"Gleen Miller", "Can't Help Falling in Love", "Regalami un Sorriso", "Il pescatore", "I Was Made For Lovin' You", "Another One Bites The Dust", "Another Brick in The Wall", "GitHub"};//Fine array
    Button btnEsci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lvsongs = (ListView)findViewById(R.id.listview);
        btnEsci = (Button)findViewById(R.id.btnEsci);

        // array adapter prende array e dà un proprio layout e lo associa al contesto in cui sta lavronado + prende lvsong (che è la list view)
        ArrayAdapter<String> aaSongs = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, Canzoni);
        lvsongs.setAdapter(aaSongs);

        btnEsci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Stai per Uscire",
                        Toast.LENGTH_LONG).show();
            }
        });

        lvsongs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String titolo = (String)lvsongs.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(), titolo,
                        Toast.LENGTH_LONG).show();
                Log.d("click procedura", "Hai cliccato sulla " + i + "voce");

                //Creazione oggetto intent a cui passare titolo.
                Intent secAct = new Intent(getApplicationContext(), SongDetail.class);
                //passaggio titolo
                secAct.putExtra("titolo", titolo); //titolo preso da riga 44
                startActivity(secAct);

            }
        });

    }
}