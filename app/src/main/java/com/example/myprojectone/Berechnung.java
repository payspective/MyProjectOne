package com.example.myprojectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

// ...

public class Berechnung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berechnung);

        Button button = findViewById(R.id.button_back);
        button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  // Erstelle einen Intent für den Wechsel zur Berechnung-Aktivität
                  Intent intent = new Intent(Berechnung.this, MainActivity.class);
                  // Starte die Berechnung-Aktivität
                  startActivity(intent);
              }
        });


        // Erhalte die übergebenen Werte aus dem Intent
        Intent intent = getIntent();
        String value1 = intent.getStringExtra("value1");
        String value2 = intent.getStringExtra("value2");

        // Verwende die Werte, wie du möchtest
        // Zum Beispiel kannst du sie in TextViews anzeigen
        EditText ergebnis = findViewById(R.id.ergebnis);
        Integer erg=(Integer.valueOf(value1) + Integer.valueOf(value2));
        ergebnis.setText(Integer.toString(erg));

        // ...
    }

    // ...
}
