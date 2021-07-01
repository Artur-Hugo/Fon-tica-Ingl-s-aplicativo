package com.devoligastudio.fonetica_ingles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {
    Button botao25;
Button botao1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    botao1 = findViewById(R.id.botaoinicioid);
botao25 = findViewById(R.id.buttonif);

botao25.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Palavras_Ingles.class);
        startActivity(intent);
    }
});

    botao1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Frase_Ingles.class);
            startActivity(intent);
        }
    });

    }


}
