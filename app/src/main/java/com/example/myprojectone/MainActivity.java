package com.example.myprojectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// ...

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hole die eingegebenen Werte aus den EditText-Feldern
                EditText editText1 = findViewById(R.id.editTextNumberDecimal);
                EditText editText2 = findViewById(R.id.editTextNumberDecimal2);
                String value1 = editText1.getText().toString();
                String value2 = editText2.getText().toString();

                // Erstelle einen Intent für den Wechsel zur Berechnung-Aktivität
                Intent intent = new Intent(MainActivity.this, Berechnung.class);

                // Füge die Werte als Extras zum Intent hinzu
                intent.putExtra("value1", value1);
                intent.putExtra("value2", value2);

                // Starte die Berechnung-Aktivität
                startActivity(intent);
            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Überprüfe die aktuelle Bildschirmausrichtung
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Landschaftsausrichtung - Führe die erforderlichen Anpassungen durch
            // ...
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            // Porträtausrichtung - Führe die erforderlichen Anpassungen durch
            // ...
        }
    }
}
