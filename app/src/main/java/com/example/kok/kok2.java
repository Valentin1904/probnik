package com.example.kok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class kok2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kok2);
    }

    public void chat (View view){
        Intent next = new Intent (kok2.this, kok3.class);
        startActivity(next);

    }
    private void dr (View view){
        Intent next = new Intent (kok2.this, kok4.class );
        startActivity(next);
    }
}