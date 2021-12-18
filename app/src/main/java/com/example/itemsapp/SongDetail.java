package com.example.itemsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SongDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_detail);
        TextView titolo = findViewById(R.id.TitoloCanzone);
        Intent i = getIntent();

        titolo.setText(i.getStringExtra("titolo"));


        Bitmap bmap = BitmapFactory.decodeFile("/sdcard/test_image");

        //imageView.setImageBitmap(bmap);
    }
}