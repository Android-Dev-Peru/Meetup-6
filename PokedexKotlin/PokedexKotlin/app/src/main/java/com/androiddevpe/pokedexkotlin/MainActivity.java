package com.androiddevpe.pokedexkotlin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private View tviPJava;
    private View tviKotlin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ui();
    }

    private void ui() {
        tviPJava= findViewById(R.id.tviPJava);
        tviKotlin= findViewById(R.id.tviPKotlin);

        tviPJava.setOnClickListener(this);
        tviKotlin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.tviPJava:
                    gotoPokedexJava();
                break;

            case R.id.tviPKotlin:
                    gotoPokedexKotlin();
                break;
        }
    }

    private void gotoPokedexJava() {

        startActivity(new Intent(this,PokedexActivity.class));
    }

    private void gotoPokedexKotlin() {
        startActivity(new Intent(this,PokedexKotlinActivity.class));
    }
}
