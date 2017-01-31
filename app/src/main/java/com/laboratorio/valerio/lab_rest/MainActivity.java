package com.laboratorio.valerio.lab_rest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;

import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {

    final Context context= this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

/*
                AlertDialog.Builder FinestraDialogoBuilder = new AlertDialog.Builder(context);

                FinestraDialogoBuilder.setTitle("La mia finestra");
                FinestraDialogoBuilder.setMessage("Questo è i mio primo messaggio");

                AlertDialog FinestraDialogo = FinestraDialogoBuilder.create();
                FinestraDialogo.show();

                */

                Intent myIntent = new Intent(MainActivity.this, ActivityListView.class);
                myIntent.putExtra("Capocchia","una bella capocchia"); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
    });
}
}